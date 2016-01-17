/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>mapNavigation-buttons</code>
  */
@js.annotation.ScalaJSDefined
class MapNavigationButtons extends js.Object {

  /**
    * Options for the zoom in button. Properties for the zoom in and zoom out buttons are inherited from <a href="#mapNavigation.buttonOptions">mapNavigation.buttonOptions</a>, while individual options can be overridden. By default, the <code>onclick</code>, <code>text</code> and <code>y</code> options are individual.
    */
  val zoomIn: js.UndefOr[CleanJsObject[MapNavigationButtonsZoomIn]] = js.undefined

  /**
    * Options for the zoom out button. Properties for the zoom in and zoom out buttons are inherited from <a href="#mapNavigation.buttonOptions">mapNavigation.buttonOptions</a>, while individual options can be overridden. By default, the <code>onclick</code>, <code>text</code> and <code>y</code> options are individual.
    */
  val zoomOut: js.UndefOr[CleanJsObject[MapNavigationButtonsZoomOut]] = js.undefined
}
