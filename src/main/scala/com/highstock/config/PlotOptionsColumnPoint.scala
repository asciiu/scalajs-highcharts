/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-column-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsColumnPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsColumnPointEvents]] = js.undefined
}

object PlotOptionsColumnPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsColumnPointEvents]] = js.undefined): PlotOptionsColumnPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsColumnPointEvents]] = events
    new PlotOptionsColumnPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsColumnPointEvents]] = eventsOuter
    }
  }
}
