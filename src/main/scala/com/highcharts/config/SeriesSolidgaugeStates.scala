/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;solidgauge&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSolidgaugeStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesSolidgaugeStatesHover]] = js.undefined
}

object SeriesSolidgaugeStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesSolidgaugeStatesHover]] = js.undefined): SeriesSolidgaugeStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesSolidgaugeStatesHover]] = hover
    new SeriesSolidgaugeStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesSolidgaugeStatesHover]] = hoverOuter
    }
  }
}
