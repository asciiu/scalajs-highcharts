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
  * @note JavaScript name: <code>plotOptions-pyramid-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsPyramidStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsPyramidStatesHover]] = js.undefined
}

object PlotOptionsPyramidStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsPyramidStatesHover]] = js.undefined): PlotOptionsPyramidStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsPyramidStatesHover]] = hover
    new PlotOptionsPyramidStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsPyramidStatesHover]] = hoverOuter
    }
  }
}
