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
  * @note JavaScript name: <code>plotOptions-series-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSeriesStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesHover]] = js.undefined

  /**
    * Overrides for the normal state
    */
  val normal: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesNormal]] = js.undefined

  /**
    * Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">Allow point select demo</a>
    */
  val select: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesSelect]] = js.undefined
}

object PlotOptionsSeriesStates {
  /**
    * @param hover Options for the hovered series
    * @param normal Overrides for the normal state
    * @param select Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesHover]] = js.undefined, normal: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesNormal]] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesSelect]] = js.undefined): PlotOptionsSeriesStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesHover]] = hover
    val normalOuter: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesNormal]] = normal
    val selectOuter: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesSelect]] = select
    new PlotOptionsSeriesStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesHover]] = hoverOuter
      override val normal: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesNormal]] = normalOuter
      override val select: js.UndefOr[CleanJsObject[PlotOptionsSeriesStatesSelect]] = selectOuter
    }
  }
}
