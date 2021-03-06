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
  * @note JavaScript name: <code>series&lt;bar&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBarPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesBarPointEvents]] = js.undefined
}

object SeriesBarPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesBarPointEvents]] = js.undefined): SeriesBarPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesBarPointEvents]] = events
    new SeriesBarPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesBarPointEvents]] = eventsOuter
    }
  }
}
