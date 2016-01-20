/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>xAxis-plotLines-label</code>
  */
@js.annotation.ScalaJSDefined
class XAxisPlotLinesLabel extends js.Object {

  /**
    * Horizontal alignment of the label. Can be one of "left", "center" or "right".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/xaxis/plotlines/" target="_blank">Plot line on Y axis</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Rotation of the text label in degrees. Defaults to 0 for horizontal plot lines and 90 for vertical lines.
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for the text label.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed within the plot band, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". Defaults to the same as the <code>align</code> option.
    */
  val textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to <a href="http://docs.highcharts.com/#formatting$html">use HTML</a> to render the labels.
    * @since 1.3.3
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * Vertical alignment of the label relative to the plot line. Can be one of "top", "middle" or "bottom".
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * Horizontal position relative the alignment. Default varies by orientation.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/xaxis/plotlines/" target="_blank">Plot line on Y axis</a>
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * Vertical position of the text baseline relative to the alignment. Default varies by orientation.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/xaxis/plotlines/" target="_blank">Plot line on Y axis</a>
    */
  val y: js.UndefOr[Double] = js.undefined
}