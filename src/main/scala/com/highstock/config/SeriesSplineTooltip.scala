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
  * @note JavaScript name: <code>series&lt;spline&gt;-tooltip</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSplineTooltip extends js.Object {

  /**
    * How many decimals to show for the <code>point.change</code> value when the <code>series.compare</code> option is set. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
    * @since 1.0.1
    */
  val changeDecimals: js.UndefOr[Double] = js.undefined

  /**
    * <p>For series on a datetime axes, the date format in the tooltip's header will by default be guessed based on the closest data points. This member gives the default string representations used for each unit.<p>
    * 
    * <p>Note that when data grouping applies, the date time label formats are pulled from <a href="#plotOptions.series.dataGrouping.dateTimeLabelFormats">dataGrouping.dateTimeLabelFormats</a> instead, because it also allows formatting of time spans.</p>
    * 
    * <p>For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.</p>
    * 
    * <p>Defaults to:
    * <pre>{
    *     millisecond:"%A, %b %e, %H:%M:%S.%L",
    *     second:"%A, %b %e, %H:%M:%S",
    *     minute:"%A, %b %e, %H:%M",
    *     hour:"%A, %b %e, %H:%M",
    *     day:"%A, %b %e, %Y",
    *     week:"Week from %A, %b %e, %Y",
    *     month:"%B %Y",
    *     year:"%Y"
    * }</pre>
    * </p>
    */
  val dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>
    * <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @since 1.3
    */
  val followPointer: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether the tooltip should follow the finger as it moves on a touch device. In order to take effect, <a href="#chart.zoomType">chart.zoomType</a> and <a href="#chart.pinchType">chart.pinchType</a> must be disabled.
    * @since 1.3.1
    */
  val followTouchMove: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the <code>point.key</code> date format can be set using tooltip.xDateFormat.</p>
    *  
    * <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/footerformat/" target="_blank">A HTML table in the tooltip</a>
    */
  val headerFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.x, point.y, point.change, series.name and series.color and other properties on the same form. Furthermore,  point.y can be extended by the tooltip.valuePrefix and tooltip.valueSuffix variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>
    */
  val pointFormat: js.UndefOr[String] = js.undefined

  /**
    * A callback function for formatting the HTML output for a single point in the tooltip. Like the <code>pointFormat</code> string, but with more flexibility.
    * @since 2.1.0
    */
  val pointFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * The name of a symbol to use for the border around the tooltip. In Highstock 1.x, the shape was <code>square</code>. 
    * @since 2.0
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * How many decimals to show in each series' y value. This is overridable in each series' tooltip options object.
    *  The default is to preserve all decimals.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 1.2
    */
  val valueDecimals: js.UndefOr[Double] = js.undefined

  /**
    * A string to prepend to each series' y value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 1.2
    */
  val valuePrefix: js.UndefOr[String] = js.undefined

  /**
    * A string to append to each series' y value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 1.2
    */
  val valueSuffix: js.UndefOr[String] = js.undefined

  /**
    * The format for the date in the tooltip header. If data grouping is used, the default is  a smart guess based on how close the closest points are. It is pulled from the #plotOptions.dataGrouping.dateTimeLabelFormats array.
    */
  val xDateFormat: js.UndefOr[String] = js.undefined
}

object SeriesSplineTooltip {
  /**
    * @param changeDecimals How many decimals to show for the <code>point.change</code> value when the <code>series.compare</code> option is set. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
    * @param dateTimeLabelFormats <p>For series on a datetime axes, the date format in the tooltip's header will by default be guessed based on the closest data points. This member gives the default string representations used for each unit.<p>. . <p>Note that when data grouping applies, the date time label formats are pulled from <a href="#plotOptions.series.dataGrouping.dateTimeLabelFormats">dataGrouping.dateTimeLabelFormats</a> instead, because it also allows formatting of time spans.</p>. . <p>For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.</p>. . <p>Defaults to:. <pre>{.     millisecond:"%A, %b %e, %H:%M:%S.%L",.     second:"%A, %b %e, %H:%M:%S",.     minute:"%A, %b %e, %H:%M",.     hour:"%A, %b %e, %H:%M",.     day:"%A, %b %e, %Y",.     week:"Week from %A, %b %e, %Y",.     month:"%B %Y",.     year:"%Y". }</pre>. </p>
    * @param followPointer <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>. <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @param followTouchMove Whether the tooltip should follow the finger as it moves on a touch device. In order to take effect, <a href="#chart.zoomType">chart.zoomType</a> and <a href="#chart.pinchType">chart.pinchType</a> must be disabled.
    * @param headerFormat <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the <code>point.key</code> date format can be set using tooltip.xDateFormat.</p>.  . <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @param pointFormat <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.x, point.y, point.change, series.name and series.color and other properties on the same form. Furthermore,  point.y can be extended by the tooltip.valuePrefix and tooltip.valueSuffix variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>
    * @param pointFormatter A callback function for formatting the HTML output for a single point in the tooltip. Like the <code>pointFormat</code> string, but with more flexibility.
    * @param shape The name of a symbol to use for the border around the tooltip. In Highstock 1.x, the shape was <code>square</code>. 
    * @param valueDecimals How many decimals to show in each series' y value. This is overridable in each series' tooltip options object..  The default is to preserve all decimals.
    * @param valuePrefix A string to prepend to each series' y value. Overridable in each series' tooltip options object.
    * @param valueSuffix A string to append to each series' y value. Overridable in each series' tooltip options object.
    * @param xDateFormat The format for the date in the tooltip header. If data grouping is used, the default is  a smart guess based on how close the closest points are. It is pulled from the #plotOptions.dataGrouping.dateTimeLabelFormats array.
    */
  def apply(changeDecimals: js.UndefOr[Double] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined, followPointer: js.UndefOr[Boolean] = js.undefined, followTouchMove: js.UndefOr[Boolean] = js.undefined, headerFormat: js.UndefOr[String] = js.undefined, pointFormat: js.UndefOr[String] = js.undefined, pointFormatter: js.UndefOr[js.Function] = js.undefined, shape: js.UndefOr[String] = js.undefined, valueDecimals: js.UndefOr[Double] = js.undefined, valuePrefix: js.UndefOr[String] = js.undefined, valueSuffix: js.UndefOr[String] = js.undefined, xDateFormat: js.UndefOr[String] = js.undefined): SeriesSplineTooltip = {
    val changeDecimalsOuter: js.UndefOr[Double] = changeDecimals
    val dateTimeLabelFormatsOuter: js.UndefOr[js.Object] = dateTimeLabelFormats
    val followPointerOuter: js.UndefOr[Boolean] = followPointer
    val followTouchMoveOuter: js.UndefOr[Boolean] = followTouchMove
    val headerFormatOuter: js.UndefOr[String] = headerFormat
    val pointFormatOuter: js.UndefOr[String] = pointFormat
    val pointFormatterOuter: js.UndefOr[js.Function] = pointFormatter
    val shapeOuter: js.UndefOr[String] = shape
    val valueDecimalsOuter: js.UndefOr[Double] = valueDecimals
    val valuePrefixOuter: js.UndefOr[String] = valuePrefix
    val valueSuffixOuter: js.UndefOr[String] = valueSuffix
    val xDateFormatOuter: js.UndefOr[String] = xDateFormat
    new SeriesSplineTooltip {
      override val changeDecimals: js.UndefOr[Double] = changeDecimalsOuter
      override val dateTimeLabelFormats: js.UndefOr[js.Object] = dateTimeLabelFormatsOuter
      override val followPointer: js.UndefOr[Boolean] = followPointerOuter
      override val followTouchMove: js.UndefOr[Boolean] = followTouchMoveOuter
      override val headerFormat: js.UndefOr[String] = headerFormatOuter
      override val pointFormat: js.UndefOr[String] = pointFormatOuter
      override val pointFormatter: js.UndefOr[js.Function] = pointFormatterOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val valueDecimals: js.UndefOr[Double] = valueDecimalsOuter
      override val valuePrefix: js.UndefOr[String] = valuePrefixOuter
      override val valueSuffix: js.UndefOr[String] = valueSuffixOuter
      override val xDateFormat: js.UndefOr[String] = xDateFormatOuter
    }
  }
}
