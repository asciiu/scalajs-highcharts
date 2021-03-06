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
  * @note JavaScript name: <code>navigator</code>
  */
@js.annotation.ScalaJSDefined
class Navigator extends js.Object {

  /**
    * Whether the navigator and scrollbar should adapt to updated data in the base X axis. This should be false when loading data asynchronously, to prevent circular loading.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/demo/lazy-loading/" target="_blank">Set to false with async data loading</a>
    */
  val adaptToUpdatedData: js.UndefOr[Boolean] = js.undefined

  /**
    * An integer identifying the index to use for the base series, or a string representing the id of the series.
    */
  val baseSeries: js.Any = js.undefined

  /**
    * Enable or disable the navigator.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/enabled/" target="_blank">Disable the navigator</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Options for the handles for dragging the zoomed area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/handles/" target="_blank">Colored handles</a>
    */
  val handles: js.UndefOr[CleanJsObject[NavigatorHandles]] = js.undefined

  /**
    * The height of the navigator.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/height/" target="_blank">A higher navigator</a>
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * The distance from the nearest element, the X axis or X axis labels.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/margin/" target="_blank">A margin of 2 draws the
				navigator closer to the X axis labels</a>
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * The color of the mask covering the areas of the navigator series that are currently not visible in the main series. The default color is bluish with an opacity of 0.3 to see the series below.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/maskfill/" target="_blank">Blue, semi transparent mask</a>
    */
  val maskFill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Whether the mask should be inside the range marking the zoomed range, or outside. In Highstock 1.x it was always <code>false</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/maskinside-false/" target="_blank">False, mask outside</a>
    * @since 2.0
    */
  val maskInside: js.UndefOr[Boolean] = js.undefined

  /**
    * The color of the line marking the currently zoomed area in the navigator.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/outline/" target="_blank">2px blue outline</a>
    */
  val outlineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The width of the line marking the currently zoomed area in the navigator.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/outline/" target="_blank">2px blue outline</a>
    */
  val outlineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the navigator series. Available options are the same as any series, documented at <a class="internal" href="#plotOptions.series">plotOptions</a> and <a class="internal" href="#series">series</a>.</p>
    * 
    * <p>Unless data is explicitly defined on navigator.series, the data is borrowed from the first series in the chart.</p>
    * 
    * <p>Default series options for the navigator series are:</p>
    * <pre>series: {
    * 	type: 'areaspline',
    * 	color: '#4572A7',
    * 	fillOpacity: 0.05,
    * 	dataGrouping: {
    * 		smoothed: true
    * 	},
    * 	lineWidth: 1,
    * 	marker: {
    * 		enabled: false
    * 	}
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/series-data/" target="_blank">Using a separate data set for the navigator</a>;
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/series/" target="_blank">A green navigator series</a>
    */
  val series: js.UndefOr[js.Object] = js.undefined

  /**
    * Options for the navigator X axis. Available options are the same as any X axis, documented at <a class="internal" href="#xAxis">xAxis</a>. Default series options for the navigator xAxis are:
    * <pre>xAxis: {
    *     tickWidth: 0,
    *     lineWidth: 0,
    *     gridLineWidth: 1,
    *     tickPixelInterval: 200,
    *     labels: {
    *         align: 'left',
    *         style: {
    *             color: '#888'
    *         },
    *         x: 3,
    *         y: -4
    *     }
    * }</pre>
    */
  val xAxis: js.UndefOr[js.Object] = js.undefined

  /**
    * Options for the navigator Y axis. Available options are the same as any y axis, documented at <a class="internal" href="#yAxis">yAxis</a>. Default series options for the navigator yAxis are:
    * <pre>yAxis: {
    * 	gridLineWidth: 0,
    * 	startOnTick: false,
    * 	endOnTick: false,
    * 	minPadding: 0.1,
    * 	maxPadding: 0.1,
    * 	labels: {
    * 		enabled: false
    * 	},
    * 	title: {
    * 		text: null
    * 	},
    * 	tickWidth: 0
    * }</pre>
    */
  val yAxis: js.UndefOr[js.Object] = js.undefined
}

object Navigator {
  /**
    * @param adaptToUpdatedData Whether the navigator and scrollbar should adapt to updated data in the base X axis. This should be false when loading data asynchronously, to prevent circular loading.
    * @param baseSeries An integer identifying the index to use for the base series, or a string representing the id of the series.
    * @param enabled Enable or disable the navigator.
    * @param handles Options for the handles for dragging the zoomed area.
    * @param height The height of the navigator.
    * @param margin The distance from the nearest element, the X axis or X axis labels.
    * @param maskFill The color of the mask covering the areas of the navigator series that are currently not visible in the main series. The default color is bluish with an opacity of 0.3 to see the series below.
    * @param maskInside Whether the mask should be inside the range marking the zoomed range, or outside. In Highstock 1.x it was always <code>false</code>.
    * @param outlineColor The color of the line marking the currently zoomed area in the navigator.
    * @param outlineWidth The width of the line marking the currently zoomed area in the navigator.
    * @param series <p>Options for the navigator series. Available options are the same as any series, documented at <a class="internal" href="#plotOptions.series">plotOptions</a> and <a class="internal" href="#series">series</a>.</p>. . <p>Unless data is explicitly defined on navigator.series, the data is borrowed from the first series in the chart.</p>. . <p>Default series options for the navigator series are:</p>. <pre>series: {. 	type: 'areaspline',. 	color: '#4572A7',. 	fillOpacity: 0.05,. 	dataGrouping: {. 		smoothed: true. 	},. 	lineWidth: 1,. 	marker: {. 		enabled: false. 	}. }</pre>
    * @param xAxis Options for the navigator X axis. Available options are the same as any X axis, documented at <a class="internal" href="#xAxis">xAxis</a>. Default series options for the navigator xAxis are:. <pre>xAxis: {.     tickWidth: 0,.     lineWidth: 0,.     gridLineWidth: 1,.     tickPixelInterval: 200,.     labels: {.         align: 'left',.         style: {.             color: '#888'.         },.         x: 3,.         y: -4.     }. }</pre>
    * @param yAxis Options for the navigator Y axis. Available options are the same as any y axis, documented at <a class="internal" href="#yAxis">yAxis</a>. Default series options for the navigator yAxis are:. <pre>yAxis: {. 	gridLineWidth: 0,. 	startOnTick: false,. 	endOnTick: false,. 	minPadding: 0.1,. 	maxPadding: 0.1,. 	labels: {. 		enabled: false. 	},. 	title: {. 		text: null. 	},. 	tickWidth: 0. }</pre>
    */
  def apply(adaptToUpdatedData: js.UndefOr[Boolean] = js.undefined, baseSeries: js.UndefOr[js.Any] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, handles: js.UndefOr[CleanJsObject[NavigatorHandles]] = js.undefined, height: js.UndefOr[Double] = js.undefined, margin: js.UndefOr[Double] = js.undefined, maskFill: js.UndefOr[String | js.Object] = js.undefined, maskInside: js.UndefOr[Boolean] = js.undefined, outlineColor: js.UndefOr[String | js.Object] = js.undefined, outlineWidth: js.UndefOr[Double] = js.undefined, series: js.UndefOr[js.Object] = js.undefined, xAxis: js.UndefOr[js.Object] = js.undefined, yAxis: js.UndefOr[js.Object] = js.undefined): Navigator = {
    val adaptToUpdatedDataOuter: js.UndefOr[Boolean] = adaptToUpdatedData
    val baseSeriesOuter: js.Any = baseSeries
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val handlesOuter: js.UndefOr[CleanJsObject[NavigatorHandles]] = handles
    val heightOuter: js.UndefOr[Double] = height
    val marginOuter: js.UndefOr[Double] = margin
    val maskFillOuter: js.UndefOr[String | js.Object] = maskFill
    val maskInsideOuter: js.UndefOr[Boolean] = maskInside
    val outlineColorOuter: js.UndefOr[String | js.Object] = outlineColor
    val outlineWidthOuter: js.UndefOr[Double] = outlineWidth
    val seriesOuter: js.UndefOr[js.Object] = series
    val xAxisOuter: js.UndefOr[js.Object] = xAxis
    val yAxisOuter: js.UndefOr[js.Object] = yAxis
    new Navigator {
      override val adaptToUpdatedData: js.UndefOr[Boolean] = adaptToUpdatedDataOuter
      override val baseSeries: js.Any = baseSeriesOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val handles: js.UndefOr[CleanJsObject[NavigatorHandles]] = handlesOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val margin: js.UndefOr[Double] = marginOuter
      override val maskFill: js.UndefOr[String | js.Object] = maskFillOuter
      override val maskInside: js.UndefOr[Boolean] = maskInsideOuter
      override val outlineColor: js.UndefOr[String | js.Object] = outlineColorOuter
      override val outlineWidth: js.UndefOr[Double] = outlineWidthOuter
      override val series: js.UndefOr[js.Object] = seriesOuter
      override val xAxis: js.UndefOr[js.Object] = xAxisOuter
      override val yAxis: js.UndefOr[js.Object] = yAxisOuter
    }
  }
}
