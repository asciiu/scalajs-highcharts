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
  * @note JavaScript name: <code>plotOptions-area</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsArea extends js.Object {

  /**
    * Allow this series' points to be selected by clicking on the markers or bars.
    */
  val allowPointSelect: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>
    * <dl>
    *   <dt>duration</dt>
    *   <dd>The duration of the animation in milliseconds.</dd>
    * <dt>easing</dt>
    * <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>
    * </dl>
    * <p>
    * Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/animation-slower/" target="_blank">Slower animation</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/animation-easing/" target="_blank">easing "swing" through jQuery UI</a>.
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Compare the values of the series against the first non-null, non-zero value in the visible range. The y axis will
    *  show percentage or absolute change depending on whether <code>compare</code> is set to <code>"percent"</code>
    *  or <code>"value"</code>. When this is applied to multiple series, it allows comparing the development
    *  of the series against each other.
    * @example Setting compare to 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-compare-percent/" target="_blank">
				percent</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-compare-value/" target="_blank">
				value</a>.
    * @since 1.0.1
    */
  val compare: js.UndefOr[String] = js.undefined

  /**
    * Whether to draw a line between points on either side of a null point, or render a gap between them.
    */
  val connectNulls: js.UndefOr[Boolean] = js.undefined

  /**
    * When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
    */
  val cropThreshold: js.UndefOr[Double] = js.undefined

  /**
    * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/cursor/" target="_blank">Pointer on a line graph</a>
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * A name for the dash style to use for the graph. Applies only to series type having a graph, like <code>line</code>, <code>spline</code>, <code>area</code> and <code>scatter</code> in  case it has a <code>lineWidth</code>. The value for the <code>dashStyle</code> include:
    * 		    <ul>
    * 		    	<li>Solid</li>
    * 		    	<li>ShortDash</li>
    * 		    	<li>ShortDot</li>
    * 		    	<li>ShortDashDot</li>
    * 		    	<li>ShortDashDotDot</li>
    * 		    	<li>Dot</li>
    * 		    	<li>Dash</li>
    * 		    	<li>LongDash</li>
    * 		    	<li>DashDot</li>
    * 		    	<li>LongDashDot</li>
    * 		    	<li>LongDashDotDot</li>
    * 		    </ul>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/" target="_blank">Possible values demonstrated</a>
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  val dataGrouping: js.UndefOr[CleanJsObject[PlotOptionsAreaDataGrouping]] = js.undefined

  val dataLabels: js.UndefOr[CleanJsObject[PlotOptionsAreaDataLabels]] = js.undefined

  /**
    * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. When using shared tooltips  (default in stock charts), mouse tracking is not required. For large datasets it improves performance.
    */
  val enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  val events: js.UndefOr[CleanJsObject[PlotOptionsAreaEvents]] = js.undefined

  /**
    * Fill color or gradient for the area. When <code>null</code>, the series' <code>color</code>  is  used with the series' <code>fillOpacity</code>.
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Fill opacity for the area. Note that when you set an explicit <code>fillColor</code>, the <code>fillOpacity</code> is not applied. Instead, you should define the opacity in the <code>fillColor</code> with an rgba color definition.
    */
  val fillOpacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines when to display a gap in the graph. A gap size of 5 means that if the distance between two points is greater than five times that of the two closest points, the  graph will be broken.</p>
    * 
    * <p>In practice, this option is most often used to visualize gaps in time series. In a stock chart, intraday data is available for daytime hours, while gaps will appear 	in nights and weekends.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-gapsize/" target="_blank">
				Setting the gap size to 2 introduces gaps for weekends in daily datasets.</a>
    */
  val gapSize: js.UndefOr[Double] = js.undefined

  /**
    * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @since 2.1.6
    */
  val getExtremesFromAll: js.UndefOr[Boolean] = js.undefined

  /**
    * An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-keys/" target="_blank">An extended data array with keys</a>
    * @since 2.1.6
    */
  val keys: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * The sequential index of the series within the legend.
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * A separate color for the graph line. By default the line takes the <code>color</code> of the series, but the lineColor setting allows setting a separate color for the line without altering the <code>fillColor</code>.
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Pixel with of the graph line.
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The line cap used for line ends and line joins on the graph.
    */
  val linecap: js.UndefOr[String] = js.undefined

  /**
    * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/arearange-line/" target="_blank">Linked series</a>
    * @since 1.3
    */
  val linkedTo: js.UndefOr[String] = js.undefined

  val marker: js.UndefOr[CleanJsObject[PlotOptionsAreaMarker]] = js.undefined

  /**
    * Properties for each single point
    */
  val point: js.UndefOr[CleanJsObject[PlotOptionsAreaPoint]] = js.undefined

  /**
    * <p>If no x values are given for the points in a series, pointInterval defines the interval of the x values in milliseconds. For example, if a series contains one value each day, set pointInterval to <code>24 * 3600 * 1000</code>.</p>
    * <p>Since Highstock 2.1, it can be combined with <code>pointIntervalUnit</code> to draw irregular intervals.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/pointinterval-pointstart/" target="_blank">
				Using pointStart and pointInterval</a>
    */
  val pointInterval: js.UndefOr[Double] = js.undefined

  /**
    * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/" target="_blank">One point a month</a>
    * @since 2.1.0
    */
  val pointIntervalUnit: js.UndefOr[String] = js.undefined

  /**
    * <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>
    * <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
    * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
    * <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>
    * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointplacement-between/" target="_blank">Between in a column chart</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointplacement-numeric/" target="_blank">numeric placement for custom layout</a>.
    * @since 1.2.0
    */
  val pointPlacement: js.UndefOr[String | Double] = js.undefined

  /**
    * The width of each point on the x axis. For example in a column chart with one value each day, the pointRange would be 1 day (= 24 * 3600 * 1000 milliseconds). This is normally computed automatically, but this option can be used to override the automatic value.
    */
  val pointRange: js.UndefOr[Double] = js.undefined

  /**
    * If no x values are given for the points in a series, pointStart defines on what value to start. On a datetime X axis, the number will be given as milliseconds since 1970-01-01, for example <code>Date.UTC(2011, 0, 1)</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/pointinterval-pointstart/" target="_blank">
				Using pointStart and pointInterval</a>
    */
  val pointStart: js.UndefOr[Double] = js.undefined

  /**
    * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name in the legend will be checked for a selected series.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to apply a drop shadow to the graph line. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    */
  val showCheckbox: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When this is true, the series will not cause the Y axis to cross the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option) unless the data actually crosses the plane.</p>
    * 
    * <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will make the Y axis show negative values according to the <code>minPadding</code> option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.</p>
    * @since 2.1.9
    */
  val softThreshold: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to stack the values of each series on top of each other. Possible values
    *  are null to disable, "normal" to stack by value or "percent".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/stacking/" target="_blank">Area</a> with "normal" stacking.
    */
  val stacking: js.UndefOr[String] = js.undefined

  /**
    * A wrapper object for all the series options in specific states.
    */
  val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined

  /**
    * Whether to apply steps to the line. Possible values are <code>left</code>, <code>center</code> and <code>right</code>. Prior to 1.2.5, only <code>left</code> was supported.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/line-step/" target="_blank">Step line</a>
    */
  val step: js.UndefOr[String] = js.undefined

  /**
    * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
    *  on a series isn't triggered until the mouse moves over another series, or out
    *  of the plot area. When false, the <code>mouseOut</code> event on a series is
    *  triggered when the mouse leaves the area around the series' graph or markers.
    *  This also implies the tooltip when not shared. When <code>stickyTracking</code> is false, the 
    *  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, candlesticks etc.
    */
  val stickyTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * The Y axis value to serve as the base for the area, for distinguishing between values above and below a threshold. If <code>null</code>, the area behaves like a line series with fill between the graph and the Y axis minimum.
    */
  val threshold: js.UndefOr[Double] = js.undefined

  /**
    * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    */
  val tooltip: js.UndefOr[CleanJsObject[PlotOptionsAreaTooltip]] = js.undefined

  /**
    * Whether the whole area or just the line should respond to mouseover tooltips and other mouse or touch events.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/area-trackbyarea/" target="_blank">Display the tooltip when the
				area is hovered</a>
    * @since 2.2.4
    */
  val trackByArea: js.UndefOr[Boolean] = js.undefined

  /**
    * When a series contains a data array that is longer than this, only one dimensional arrays of numbers,
    *  or two dimensional arrays with x and y values are allowed. Also, only the first
    *  point is tested, and the rest are assumed to be the same format. This saves expensive
    *  data checking and indexing in long series. Set it to <code>0</code> disable.
    */
  val turboThreshold: js.UndefOr[Double] = js.undefined

  /**
    * Set the initial visibility of the series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-visibility/" target="_blank">Hidden series</a>
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * Defines the Axis on which the zones are applied.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/" target="_blank">Zones on the X-Axis</a>
    * @since 2.1.0
    */
  val zoneAxis: js.UndefOr[String] = js.undefined

  /**
    * An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-simple/" target="_blank">Color zones</a>
    * @since 2.1.0
    */
  val zones: js.UndefOr[js.Array[CleanJsObject[PlotOptionsAreaZones]]] = js.undefined
}

object PlotOptionsArea {
  /**
    * @param allowPointSelect Allow this series' points to be selected by clicking on the markers or bars.
    * @param animation <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>. <dl>.   <dt>duration</dt>.   <dd>The duration of the animation in milliseconds.</dd>. <dt>easing</dt>. <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>. </dl>. <p>. Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
    * @param color The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
    * @param compare Compare the values of the series against the first non-null, non-zero value in the visible range. The y axis will.  show percentage or absolute change depending on whether <code>compare</code> is set to <code>"percent"</code>.  or <code>"value"</code>. When this is applied to multiple series, it allows comparing the development.  of the series against each other.
    * @param connectNulls Whether to draw a line between points on either side of a null point, or render a gap between them.
    * @param cropThreshold When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
    * @param cursor You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @param dashStyle A name for the dash style to use for the graph. Applies only to series type having a graph, like <code>line</code>, <code>spline</code>, <code>area</code> and <code>scatter</code> in  case it has a <code>lineWidth</code>. The value for the <code>dashStyle</code> include:. 		    <ul>. 		    	<li>Solid</li>. 		    	<li>ShortDash</li>. 		    	<li>ShortDot</li>. 		    	<li>ShortDashDot</li>. 		    	<li>ShortDashDotDot</li>. 		    	<li>Dot</li>. 		    	<li>Dash</li>. 		    	<li>LongDash</li>. 		    	<li>DashDot</li>. 		    	<li>LongDashDot</li>. 		    	<li>LongDashDotDot</li>. 		    </ul>
    * @param enableMouseTracking Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. When using shared tooltips  (default in stock charts), mouse tracking is not required. For large datasets it improves performance.
    * @param fillColor Fill color or gradient for the area. When <code>null</code>, the series' <code>color</code>  is  used with the series' <code>fillOpacity</code>.
    * @param fillOpacity Fill opacity for the area. Note that when you set an explicit <code>fillColor</code>, the <code>fillOpacity</code> is not applied. Instead, you should define the opacity in the <code>fillColor</code> with an rgba color definition.
    * @param gapSize <p>Defines when to display a gap in the graph. A gap size of 5 means that if the distance between two points is greater than five times that of the two closest points, the  graph will be broken.</p>. . <p>In practice, this option is most often used to visualize gaps in time series. In a stock chart, intraday data is available for daytime hours, while gaps will appear 	in nights and weekends.</p>
    * @param getExtremesFromAll Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @param keys An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @param legendIndex The sequential index of the series within the legend.
    * @param lineColor A separate color for the graph line. By default the line takes the <code>color</code> of the series, but the lineColor setting allows setting a separate color for the line without altering the <code>fillColor</code>.
    * @param lineWidth Pixel with of the graph line.
    * @param linecap The line cap used for line ends and line joins on the graph.
    * @param linkedTo The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @param point Properties for each single point
    * @param pointInterval <p>If no x values are given for the points in a series, pointInterval defines the interval of the x values in milliseconds. For example, if a series contains one value each day, set pointInterval to <code>24 * 3600 * 1000</code>.</p>. <p>Since Highstock 2.1, it can be combined with <code>pointIntervalUnit</code> to draw irregular intervals.</p>
    * @param pointIntervalUnit On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
    * @param pointPlacement <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>. <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>. <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>. <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>. <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
    * @param pointRange The width of each point on the x axis. For example in a column chart with one value each day, the pointRange would be 1 day (= 24 * 3600 * 1000 milliseconds). This is normally computed automatically, but this option can be used to override the automatic value.
    * @param pointStart If no x values are given for the points in a series, pointStart defines on what value to start. On a datetime X axis, the number will be given as milliseconds since 1970-01-01, for example <code>Date.UTC(2011, 0, 1)</code>.
    * @param selected Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name in the legend will be checked for a selected series.
    * @param shadow Whether to apply a drop shadow to the graph line. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param showCheckbox If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    * @param showInLegend Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
    * @param softThreshold <p>When this is true, the series will not cause the Y axis to cross the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option) unless the data actually crosses the plane.</p>. . <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will make the Y axis show negative values according to the <code>minPadding</code> option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.</p>
    * @param stacking Whether to stack the values of each series on top of each other. Possible values.  are null to disable, "normal" to stack by value or "percent".
    * @param states A wrapper object for all the series options in specific states.
    * @param step Whether to apply steps to the line. Possible values are <code>left</code>, <code>center</code> and <code>right</code>. Prior to 1.2.5, only <code>left</code> was supported.
    * @param stickyTracking Sticky tracking of mouse events. When true, the <code>mouseOut</code> event.  on a series isn't triggered until the mouse moves over another series, or out.  of the plot area. When false, the <code>mouseOut</code> event on a series is.  triggered when the mouse leaves the area around the series' graph or markers..  This also implies the tooltip when not shared. When <code>stickyTracking</code> is false, the .  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, candlesticks etc.
    * @param threshold The Y axis value to serve as the base for the area, for distinguishing between values above and below a threshold. If <code>null</code>, the area behaves like a line series with fill between the graph and the Y axis minimum.
    * @param tooltip A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    * @param trackByArea Whether the whole area or just the line should respond to mouseover tooltips and other mouse or touch events.
    * @param turboThreshold When a series contains a data array that is longer than this, only one dimensional arrays of numbers,.  or two dimensional arrays with x and y values are allowed. Also, only the first.  point is tested, and the rest are assumed to be the same format. This saves expensive.  data checking and indexing in long series. Set it to <code>0</code> disable.
    * @param visible Set the initial visibility of the series.
    * @param zoneAxis Defines the Axis on which the zones are applied.
    * @param zones An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
    */
  def apply(allowPointSelect: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, compare: js.UndefOr[String] = js.undefined, connectNulls: js.UndefOr[Boolean] = js.undefined, cropThreshold: js.UndefOr[Double] = js.undefined, cursor: js.UndefOr[String] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, dataGrouping: js.UndefOr[CleanJsObject[PlotOptionsAreaDataGrouping]] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[PlotOptionsAreaDataLabels]] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[PlotOptionsAreaEvents]] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, fillOpacity: js.UndefOr[Double] = js.undefined, gapSize: js.UndefOr[Double] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, linecap: js.UndefOr[String] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, marker: js.UndefOr[CleanJsObject[PlotOptionsAreaMarker]] = js.undefined, point: js.UndefOr[CleanJsObject[PlotOptionsAreaPoint]] = js.undefined, pointInterval: js.UndefOr[Double] = js.undefined, pointIntervalUnit: js.UndefOr[String] = js.undefined, pointPlacement: js.UndefOr[String | Double] = js.undefined, pointRange: js.UndefOr[Double] = js.undefined, pointStart: js.UndefOr[Double] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, softThreshold: js.UndefOr[Boolean] = js.undefined, stacking: js.UndefOr[String] = js.undefined, states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined, step: js.UndefOr[String] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, threshold: js.UndefOr[Double] = js.undefined, tooltip: js.UndefOr[CleanJsObject[PlotOptionsAreaTooltip]] = js.undefined, trackByArea: js.UndefOr[Boolean] = js.undefined, turboThreshold: js.UndefOr[Double] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zoneAxis: js.UndefOr[String] = js.undefined, zones: js.UndefOr[js.Array[CleanJsObject[PlotOptionsAreaZones]]] = js.undefined): PlotOptionsArea = {
    val allowPointSelectOuter: js.UndefOr[Boolean] = allowPointSelect
    val animationOuter: js.UndefOr[Boolean] = animation
    val colorOuter: js.UndefOr[String | js.Object] = color
    val compareOuter: js.UndefOr[String] = compare
    val connectNullsOuter: js.UndefOr[Boolean] = connectNulls
    val cropThresholdOuter: js.UndefOr[Double] = cropThreshold
    val cursorOuter: js.UndefOr[String] = cursor
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val dataGroupingOuter: js.UndefOr[CleanJsObject[PlotOptionsAreaDataGrouping]] = dataGrouping
    val dataLabelsOuter: js.UndefOr[CleanJsObject[PlotOptionsAreaDataLabels]] = dataLabels
    val enableMouseTrackingOuter: js.UndefOr[Boolean] = enableMouseTracking
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsAreaEvents]] = events
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val fillOpacityOuter: js.UndefOr[Double] = fillOpacity
    val gapSizeOuter: js.UndefOr[Double] = gapSize
    val getExtremesFromAllOuter: js.UndefOr[Boolean] = getExtremesFromAll
    val keysOuter: js.UndefOr[js.Array[String]] = keys
    val legendIndexOuter: js.UndefOr[Double] = legendIndex
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val linecapOuter: js.UndefOr[String] = linecap
    val linkedToOuter: js.UndefOr[String] = linkedTo
    val markerOuter: js.UndefOr[CleanJsObject[PlotOptionsAreaMarker]] = marker
    val pointOuter: js.UndefOr[CleanJsObject[PlotOptionsAreaPoint]] = point
    val pointIntervalOuter: js.UndefOr[Double] = pointInterval
    val pointIntervalUnitOuter: js.UndefOr[String] = pointIntervalUnit
    val pointPlacementOuter: js.UndefOr[String | Double] = pointPlacement
    val pointRangeOuter: js.UndefOr[Double] = pointRange
    val pointStartOuter: js.UndefOr[Double] = pointStart
    val selectedOuter: js.UndefOr[Boolean] = selected
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val showCheckboxOuter: js.UndefOr[Boolean] = showCheckbox
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val softThresholdOuter: js.UndefOr[Boolean] = softThreshold
    val stackingOuter: js.UndefOr[String] = stacking
    val statesOuter: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = states
    val stepOuter: js.UndefOr[String] = step
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val thresholdOuter: js.UndefOr[Double] = threshold
    val tooltipOuter: js.UndefOr[CleanJsObject[PlotOptionsAreaTooltip]] = tooltip
    val trackByAreaOuter: js.UndefOr[Boolean] = trackByArea
    val turboThresholdOuter: js.UndefOr[Double] = turboThreshold
    val visibleOuter: js.UndefOr[Boolean] = visible
    val zoneAxisOuter: js.UndefOr[String] = zoneAxis
    val zonesOuter: js.UndefOr[js.Array[CleanJsObject[PlotOptionsAreaZones]]] = zones
    new PlotOptionsArea {
      override val allowPointSelect: js.UndefOr[Boolean] = allowPointSelectOuter
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val compare: js.UndefOr[String] = compareOuter
      override val connectNulls: js.UndefOr[Boolean] = connectNullsOuter
      override val cropThreshold: js.UndefOr[Double] = cropThresholdOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val dataGrouping: js.UndefOr[CleanJsObject[PlotOptionsAreaDataGrouping]] = dataGroupingOuter
      override val dataLabels: js.UndefOr[CleanJsObject[PlotOptionsAreaDataLabels]] = dataLabelsOuter
      override val enableMouseTracking: js.UndefOr[Boolean] = enableMouseTrackingOuter
      override val events: js.UndefOr[CleanJsObject[PlotOptionsAreaEvents]] = eventsOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val fillOpacity: js.UndefOr[Double] = fillOpacityOuter
      override val gapSize: js.UndefOr[Double] = gapSizeOuter
      override val getExtremesFromAll: js.UndefOr[Boolean] = getExtremesFromAllOuter
      override val keys: js.UndefOr[js.Array[String]] = keysOuter
      override val legendIndex: js.UndefOr[Double] = legendIndexOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val linecap: js.UndefOr[String] = linecapOuter
      override val linkedTo: js.UndefOr[String] = linkedToOuter
      override val marker: js.UndefOr[CleanJsObject[PlotOptionsAreaMarker]] = markerOuter
      override val point: js.UndefOr[CleanJsObject[PlotOptionsAreaPoint]] = pointOuter
      override val pointInterval: js.UndefOr[Double] = pointIntervalOuter
      override val pointIntervalUnit: js.UndefOr[String] = pointIntervalUnitOuter
      override val pointPlacement: js.UndefOr[String | Double] = pointPlacementOuter
      override val pointRange: js.UndefOr[Double] = pointRangeOuter
      override val pointStart: js.UndefOr[Double] = pointStartOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val showCheckbox: js.UndefOr[Boolean] = showCheckboxOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val softThreshold: js.UndefOr[Boolean] = softThresholdOuter
      override val stacking: js.UndefOr[String] = stackingOuter
      override val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = statesOuter
      override val step: js.UndefOr[String] = stepOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val threshold: js.UndefOr[Double] = thresholdOuter
      override val tooltip: js.UndefOr[CleanJsObject[PlotOptionsAreaTooltip]] = tooltipOuter
      override val trackByArea: js.UndefOr[Boolean] = trackByAreaOuter
      override val turboThreshold: js.UndefOr[Double] = turboThresholdOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val zoneAxis: js.UndefOr[String] = zoneAxisOuter
      override val zones: js.UndefOr[js.Array[CleanJsObject[PlotOptionsAreaZones]]] = zonesOuter
    }
  }
}
