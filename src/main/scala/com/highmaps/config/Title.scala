/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>title</code>
  */
@js.annotation.ScalaJSDefined
class Title extends js.Object {

  /**
    * The horizontal alignment of the title. Can be one of "left", "center" and "right".
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * When the title is floating, the plot area will not move to make space for it.
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * The margin between the title and the plot area, or if a subtitle is present, the margin between the subtitle and the plot area.
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for the title. Use this for font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The title of the chart. To disable the title, set the <code>text</code> to <code>null</code>.
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * The x position of the title relative to the alignment within chart.spacingLeft and chart.spacingRight.
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position of the title relative to the alignment within <a href="#chart.spacingTop">chart.spacingTop</a> and <a href="#chart.spacingBottom">chart.spacingBottom</a>. By default it depends on the font size.
    */
  val y: js.UndefOr[Double] = js.undefined
}

object Title {
  /**
    * @param align The horizontal alignment of the title. Can be one of "left", "center" and "right".
    * @param floating When the title is floating, the plot area will not move to make space for it.
    * @param margin The margin between the title and the plot area, or if a subtitle is present, the margin between the subtitle and the plot area.
    * @param style CSS styles for the title. Use this for font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.
    * @param text The title of the chart. To disable the title, set the <code>text</code> to <code>null</code>.
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
    * @param verticalAlign The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
    * @param x The x position of the title relative to the alignment within chart.spacingLeft and chart.spacingRight.
    * @param y The y position of the title relative to the alignment within <a href="#chart.spacingTop">chart.spacingTop</a> and <a href="#chart.spacingBottom">chart.spacingBottom</a>. By default it depends on the font size.
    */
  def apply(align: js.UndefOr[String] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, margin: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Title = {
    val alignOuter: js.UndefOr[String] = align
    val floatingOuter: js.UndefOr[Boolean] = floating
    val marginOuter: js.UndefOr[Double] = margin
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new Title {
      override val align: js.UndefOr[String] = alignOuter
      override val floating: js.UndefOr[Boolean] = floatingOuter
      override val margin: js.UndefOr[Double] = marginOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
