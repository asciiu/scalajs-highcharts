package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ConfigurationObject
import com.karasiq.highcharts.generator.ast.{ScalaJsClass, ScalaJsDefinition, ScalaJsMethod, ScalaJsValue}
import org.apache.commons.lang3.StringEscapeUtils

object ScalaClassWriter {
  // Scala keywords
  private val reserved = Set("abstract", "case", "catch", "class", "def", "do", "else", "extends", "false", "final", "finally", "for", "forSome", "if", "implicit", "import", "lazy", "match", "new", "null", "object", "override", "package", "private", "protected", "return", "sealed", "super", "this", "throw", "trait", "try", "true", "type", "val", "var", "while", "with", "yield")

  def validScalaName(name: String): String = {
    if (name.nonEmpty && (!name.matches("\\w+") || reserved.contains(name))) {
      s"`$name`"
    } else {
      name
    }
  }
}

class ScalaClassWriter extends ClassWriter {
  import ScalaClassWriter.validScalaName

  private val compoundValueName = "(\\w+)<(\\w+)>".r

  override def writeClass(scalaClass: ScalaJsClass)(writer: (String) ⇒ Unit): Unit = scalaClass match {
    case ScalaJsClass(jsName, className, definitions) ⇒
      writer(
        s"""/**
           |  * @note JavaScript name: <code>${StringEscapeUtils.escapeHtml4(jsName)}</code>
           |  */""".stripMargin
      )

      // Abstract native JS trait
      val isTrait: Boolean = definitions.exists(_.isInstanceOf[ScalaJsMethod])

      if (isTrait) {
        writer("@js.native")
        writer(s"trait ${validScalaName(className)} extends js.Object {")
      } else {
        writer("@js.annotation.ScalaJSDefined")
        writer(s"class ${validScalaName(className)} extends js.Object {")
      }

      val tab = "  " // Tabulation
      val docWriter = new ScalaDocWriter

      def writeDoc(cfg: ConfigurationObject): Unit = {
        writer("") // Empty line
        docWriter.writeDocumentation(cfg)(str ⇒ writer(tab + str)) // ScalaDoc
      }

      def writeValue(scalaName: String, scalaType: String, value: Option[String]): Unit = {
        if (isTrait) {
          writer(tab + s"val $scalaName: $scalaType = js.native")
        } else value match {
          case Some(v) ⇒
            writer(tab + s"val $scalaName: $scalaType = $v")

          case None if scalaType == "js.Any" ⇒
            writer(tab + s"val $scalaName: $scalaType = js.undefined")

          case None ⇒
            writer(tab + s"val $scalaName: js.UndefOr[$scalaType] = js.undefined")
        }
      }

      def writeMethod(scalaName: String, scalaType: String, arguments: Seq[ScalaJsValue]): Unit = {
        val args = arguments.collect {
          case ScalaJsValue(_, argName, argType, Some(argValue)) ⇒
            s"${validScalaName(argName)}: $argType = $argValue"

          case ScalaJsValue(_, argName, argType, None) ⇒
            s"${validScalaName(argName)}: $argType = ???"
        }
        writer(tab + s"def $scalaName(${args.mkString(", ")}): $scalaType = js.native")
      }

      val compoundValues = compoundTypes(definitions)

      val otherDefinitions = definitions.collect {
        case df if df.scalaName.nonEmpty && !compoundValues.exists(_.scalaName == df.scalaName) && compoundValueName.findFirstIn(df.scalaName).isEmpty ⇒
          df
      }

      compoundValues.foreach {
        case ScalaJsValue(config, scalaName, scalaType, _) ⇒
          writeDoc(config)
          writeValue(validScalaName(scalaName), scalaType, None)
      }

      otherDefinitions.foreach {
        case ScalaJsMethod(cfg, scalaName, scalaType, arguments) ⇒
          writeDoc(cfg)
          writeMethod(validScalaName(scalaName), scalaType, arguments)

        case ScalaJsValue(cfg, scalaName, scalaType, value) ⇒
          writeDoc(cfg)
          writeValue(validScalaName(scalaName), scalaType, value)

        case c: ScalaJsClass ⇒
          writeClass(c)(str ⇒ writer(tab + str))
      }

      writer("}")

      // Write companion object
      val parameters = compoundValues ++ otherDefinitions.collect {
        case v: ScalaJsValue ⇒
          v
      }

      if (!isTrait && parameters.nonEmpty) {
        writer("")
        writer(s"object ${validScalaName(className)} {")
        docWriter.paramDocumentation(parameters)(str ⇒ writer(tab + str))

        val args = parameters.collect {
          case ScalaJsValue(_, argName, argType, Some(argValue)) ⇒
            s"${validScalaName(argName)}: $argType = $argValue"

          case ScalaJsValue(_, argName, argType, None) ⇒
            s"${validScalaName(argName)}: js.UndefOr[$argType] = js.undefined"
        }
        writer(tab + s"def apply(${args.mkString(", ")}): ${validScalaName(scalaClass.scalaName)} = {")
        for (ScalaJsValue(_, scalaName, scalaType, value) <- parameters) {
          val outer = validScalaName(scalaName + "Outer")
          val name = validScalaName(scalaName)
          val tpe = if (value.isDefined || scalaType == "js.Any") scalaType else s"js.UndefOr[$scalaType]"
          writer(tab + tab + s"val $outer: $tpe = $name")
        }
        writer(tab + tab + s"new ${validScalaName(scalaClass.scalaName)} {")
        for (ScalaJsValue(_, scalaName, scalaType, value) <- parameters) {
          val name = validScalaName(scalaName)
          val outer = validScalaName(scalaName + "Outer")
          val tpe = if (value.isDefined || scalaType == "js.Any") scalaType else s"js.UndefOr[$scalaType]"
          writer(tab + tab + tab + s"override val $name: $tpe = $outer")
        }
        writer(tab + tab + "}")
        writer(tab + "}")
        writer("}")
      }
  }

  /*
    For pseudo values like series<area>, series<spline>, etc
    Will generate very long signature, like this:
    js.UndefOr[js.Array[CleanJsObject[SeriesArea]] | js.Array[CleanJsObject[SeriesArearange]] | js.Array[CleanJsObject[SeriesAreaspline]] | js.Array[CleanJsObject[SeriesAreasplinerange]] | js.Array[CleanJsObject[SeriesBar]] | js.Array[CleanJsObject[SeriesBoxplot]] | js.Array[CleanJsObject[SeriesBubble]] | js.Array[CleanJsObject[SeriesColumn]] | js.Array[CleanJsObject[SeriesColumnrange]] | js.Array[CleanJsObject[SeriesErrorbar]] | js.Array[CleanJsObject[SeriesFunnel]] | js.Array[CleanJsObject[SeriesGauge]] | js.Array[CleanJsObject[SeriesHeatmap]] | js.Array[CleanJsObject[SeriesLine]] | js.Array[CleanJsObject[SeriesPie]] | js.Array[CleanJsObject[SeriesPolygon]] | js.Array[CleanJsObject[SeriesPyramid]] | js.Array[CleanJsObject[SeriesScatter]] | js.Array[CleanJsObject[SeriesSolidgauge]] | js.Array[CleanJsObject[SeriesSpline]] | js.Array[CleanJsObject[SeriesTreemap]] | js.Array[CleanJsObject[SeriesWaterfall]]]

    Fix: now signature looks like
    js.UndefOr[js.Array[CleanJsObject[SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesBar | SeriesBoxplot | SeriesBubble | SeriesColumn | SeriesColumnrange | SeriesErrorbar | SeriesFunnel | SeriesGauge | SeriesHeatmap | SeriesLine | SeriesPie | SeriesPolygon | SeriesPyramid | SeriesScatter | SeriesSolidgauge | SeriesSpline | SeriesTreemap | SeriesWaterfall]]]
   */
  protected def compoundTypes(definitions: Seq[ScalaJsDefinition]): Seq[ScalaJsValue] = {
    definitions.collect {
      case ScalaJsValue(cfg, compoundValueName(baseName, typeArg), scalaType, value) ⇒
        baseName → scalaType
    }.groupBy(_._1).mapValues(_.unzip._2).toSeq.map {
      case (baseName, types) ⇒
        // js.Array[CleanJsObject[ConfigType]] -> List(js.Array, CleanJsObject, ConfigType)
        def unwrapTypes(tpe: String): List[String] = {
          val regex = """([\w\.]+)\[([\w\.\[\]]+)\]""".r
          tpe match {
            case regex(name, typeArg) ⇒
              List(name) ::: unwrapTypes(typeArg)

            case name ⇒
              List(name)
          }
        }
        val unwrapped = types.map(unwrapTypes)
        val typesHead = unwrapped.headOption.map(_.dropRight(1))
        val canWrap: Boolean = unwrapped.tail.nonEmpty && unwrapped.tail.forall(tl ⇒ tl.length > 1 && typesHead.contains(tl.dropRight(1)))
        val scalaType = if (canWrap) {
          def wrap(types: List[String]): String = types match {
            case Nil ⇒
              throw new scala.IllegalArgumentException

            case tpe :: Nil ⇒
              tpe

            case tpe1 :: tpe2 :: Nil ⇒
              s"$tpe1[$tpe2]"

            case tpe :: ts ⇒
              s"$tpe[${wrap(ts)}]"
          }

          wrap(typesHead.toList.flatten :+ ScalaJsClassBuilder.unionType(unwrapped.map(_.last).toList))
        } else {
          ScalaJsClassBuilder.unionType(types.toList)
        }
        val config = definitions.collectFirst {
          case ScalaJsValue(cfg, name, _, _) if name == baseName ⇒
            cfg
        }

        ScalaJsValue(config.get, baseName, scalaType, None)
    }
  }
}