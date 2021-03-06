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
  * @note JavaScript name: <code>series&lt;funnel&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesFunnelPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesFunnelPointEvents]] = js.undefined
}

object SeriesFunnelPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesFunnelPointEvents]] = js.undefined): SeriesFunnelPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesFunnelPointEvents]] = events
    new SeriesFunnelPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesFunnelPointEvents]] = eventsOuter
    }
  }
}
