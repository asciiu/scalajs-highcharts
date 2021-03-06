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
  * @note JavaScript name: <code>xAxis</code>
  */
@js.annotation.ScalaJSDefined
class XAxis extends js.Object {

  /**
    * Whether to allow decimals in this axis' ticks. When counting integers, like
    *  persons or hits on a web page, decimals must be avoided in the axis tick
    *  labels.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/allowdecimals-true/" target="_blank">True by default</a> (unwanted for this
			type of data), 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/allowdecimals-false/" target="_blank">false</a>
    * @since 2.0
    */
  val allowDecimals: js.UndefOr[Boolean] = js.undefined

  /**
    * When using an alternate grid color, a band is painted across the plot area between every other grid line.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/alternategridcolor/" target="_blank">Alternate grid color on the Y axis</a>
    */
  val alternateGridColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. Requires that the broken-axis.js module is loaded.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/axisbreak/break-simple/" target="_blank">Simple break</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/axisbreak/break-visualized/" target="_blank">advanced with callback</a>
    * @since 4.1.0
    */
  val breaks: js.UndefOr[js.Array[CleanJsObject[XAxisBreaks]]] = js.undefined

  /**
    * <p>If categories are present for the xAxis, names are used instead of numbers for that axis. Since Highcharts 3.0, categories can also be extracted by giving each point a <a href="#series.data">name</a> and setting axis <a href="#xAxis.type">type</a> to <code>category</code>. However, if you have multiple series, best practice remains defining the <code>categories</code> array.</p>
    * 
    * <p>Example:
    * <pre>categories: ['Apples', 'Bananas', 'Oranges']</pre>
    * 		 Defaults to <code>null</code>
    * </p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/reflow-true/" target="_blank">With</a> and
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/categories/" target="_blank">without</a> categories
    */
  val categories: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * The highest allowed value for automatically computed axis extremes.
    * @example  <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/floor-ceiling/" target="_blank">Floor and ceiling</a>
    * @since 4.0
    */
  val ceiling: js.UndefOr[Double] = js.undefined

  /**
    * Configure a crosshair that follows either the mouse pointer or the hovered point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/crosshair-both/" target="_blank">Crosshair on both axes</a>
    * @since 4.1
    */
  val crosshair: js.UndefOr[Boolean | CleanJsObject[XAxisCrosshair]] = js.undefined

  /**
    * For a datetime axis, the scale will automatically adjust to the appropriate unit.
    *  This member gives the default string representations used for each unit. For an
    *  overview of the replacement codes, see dateFormat.
    *  Defaults to:
    * <pre>{
    * 	millisecond: '%H:%M:%S.%L',
    * 	second: '%H:%M:%S',
    * 	minute: '%H:%M',
    * 	hour: '%H:%M',
    * 	day: '%e. %b',
    * 	week: '%e. %b',
    * 	month: '%b \'%y',
    * 	year: '%Y'
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/datetimelabelformats/" target="_blank">Different day format on X axis</a>
    */
  val dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to force the axis to end on a tick. Use this option with the <code>maxPadding</code> option to control the axis end.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/reflow-true/" target="_blank">True by default</a> and
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/endontick/" target="_blank">false</a> for Y axis
    * @since 1.2.0
    */
  val endOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * Event handlers for the axis.
    */
  val events: js.UndefOr[CleanJsObject[XAxisEvents]] = js.undefined

  /**
    * The lowest allowed value for automatically computed axis extremes.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/floor-ceiling/" target="_blank">Floor and ceiling</a>
    * @since 4.0
    */
  val floor: js.UndefOr[Double] = js.undefined

  /**
    * Color of the grid lines extending the ticks across the plot area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/gridlinecolor/" target="_blank">Green lines</a>
    */
  val gridLineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/gridlinedashstyle/" target="_blank">Long dashes</a>
    * @since 1.2
    */
  val gridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * The width of the grid lines extending the ticks across the plot area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/gridlinewidth/" target="_blank">2px lines</a>
    */
  val gridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The Z index of the grid lines.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/gridzindex/" target="_blank">A Z index of 4 renders the grid above the graph</a>
    */
  val gridZIndex: js.UndefOr[Double] = js.undefined

  /**
    * An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/id/" target="_blank">Get the object</a>
    * @since 1.2.0
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The axis labels show the number or category for each tick.
    */
  val labels: js.UndefOr[CleanJsObject[XAxisLabels]] = js.undefined

  /**
    * The color of the line marking the axis itself.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/linecolor/" target="_blank">A red line on Y axis</a>
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The width of the line marking the axis itself.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/linecolor/" target="_blank">A 1px line on Y axis</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info, or to ease reading the chart by duplicating the scales.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/linkedto/" target="_blank">Different string formats of the same date</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/linkedto/" target="_blank">Y values on both sides</a>
    * @since 2.0.2
    */
  val linkedTo: js.UndefOr[Double] = js.undefined

  /**
    * The maximum value of the axis. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up. The actual maximum value is also influenced by  <a class="internal" href="#chart">chart.alignTicks</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/max-200/" target="_blank">Y axis max of 200</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/max-logarithmic/" target="_blank">Y axis max on logarithmic axis</a>
    */
  val max: js.UndefOr[Double] = js.undefined

  /**
    * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area. When the axis' <code>max</code> option is set or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/maxpadding/" target="_blank">Max padding of 0.25 on y axis</a>
    * @since 1.2.0
    */
  val maxPadding: js.UndefOr[Double] = js.undefined

  /**
    * Deprecated. Renamed to <code>minRange</code> as of Highcharts 2.2.
    */
  val maxZoom: js.UndefOr[Double] = js.undefined

  /**
    * The minimum value of the axis. If <code>null</code> the min value is automatically calculated. If the <code>startOnTick</code> option is true, the <code>min</code> value might be rounded down.
    * @example Y axis min of <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/min-startontick-false/" target="_blank">-50 with startOnTick to false</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/min-startontick-true/" target="_blank">-50 with startOnTick true by default</a>
    */
  val min: js.UndefOr[Double] = js.undefined

  /**
    * Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. When the axis' <code>min</code> option is set or a min extreme is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minpadding/" target="_blank">Min padding of 0.2</a>
    * @since 1.2.0
    */
  val minPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour.</p> 
    * 
    * <p>The default minRange for the x axis is five times the smallest interval between any of the data points.</p> 
    * 
    * <p>On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 	1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc.</p>
    * 
    * <p>Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code> settings also affect how the extremes of the axis are computed.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/minrange/" target="_blank">Minimum range of 5</a>
    */
  val minRange: js.UndefOr[Double] = js.undefined

  /**
    * The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
    * @since 2.3.0
    */
  val minTickInterval: js.UndefOr[Double] = js.undefined

  /**
    * Color of the minor, secondary grid lines.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minorgridlinecolor/" target="_blank">Bright grey lines from Y axis</a>
    */
  val minorGridLineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minorgridlinedashstyle/" target="_blank">Long dashes on minor grid lines</a>
    * @since 1.2
    */
  val minorGridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * Width of the minor, secondary grid lines.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minorgridlinewidth/" target="_blank">2px lines from Y axis </a>
    */
  val minorGridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * Color for the minor tick marks.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minortickcolor/" target="_blank">Black tick marks on Y axis</a>
    */
  val minorTickColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Tick interval in scale units for the minor ticks. On a linear axis, if <code>"auto"</code>, 
    *  the minor tick interval is calculated as a fifth of the tickInterval. If
    *  <code>null</code>, minor ticks are not shown.</p>
    *  <p>On logarithmic axes, the unit is the power of the value. For example, setting
    *  	the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting
    *  	the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 
    *  	10 and 100 etc. A minorTickInterval of "auto" on a log axis results in a best guess,
    *  	attempting to enter approximately 5 minor ticks between each major tick.</p>
    * 
    * <p>If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.</a>
    * 
    * <p>On axes using <a href="#xAxis.categories">categories</a>, minor ticks are not supported.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minortickinterval-null/" target="_blank">Null by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minortickinterval-auto/" target="_blank">"auto" on linear Y axis</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minortickinterval-5/" target="_blank">5 units</a> on linear Y axis, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minortickinterval-log-auto/" target="_blank">"auto"</a> on logarithmic Y axis,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minortickinterval-log/" target="_blank">0.1</a> on logarithmic Y axis.
    */
  val minorTickInterval: js.UndefOr[String | Double] = js.undefined

  /**
    * The pixel length of the minor tick marks.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minorticklength/" target="_blank">10px on Y axis</a>
    */
  val minorTickLength: js.UndefOr[Double] = js.undefined

  /**
    * The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minortickposition-outside/" target="_blank">Outside by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minortickposition-inside/" target="_blank">inside</a>
    */
  val minorTickPosition: js.UndefOr[String] = js.undefined

  /**
    * The pixel width of the minor tick mark.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/minortickwidth/" target="_blank">3px width</a>
    */
  val minorTickWidth: js.UndefOr[Double] = js.undefined

  /**
    * The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/offset/" target="_blank">Y axis offset of 70</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/offset-centered/" target="_blank">Axes positioned in the center of the plot</a>
    */
  val offset: js.UndefOr[Double] = js.undefined

  /**
    * Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. This is typically used with dual or multiple axes.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/opposite/" target="_blank">Secondary Y axis opposite</a>
    */
  val opposite: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An array of colored bands stretching across the plot area marking an interval on the axis.</p>
    * 
    * <p>In a gauge, a plot band on the Y axis (value axis) will stretch along the perimeter of the gauge.</p>
    */
  val plotBands: js.UndefOr[js.Array[CleanJsObject[XAxisPlotBands]]] = js.undefined

  /**
    * An array of lines stretching across the plot area, marking a specific value on one of the axes.
    */
  val plotLines: js.UndefOr[js.Array[CleanJsObject[XAxisPlotLines]]] = js.undefined

  /**
    * Whether to reverse the axis so that the highest number is closest to the origin. If the chart is inverted, the x axis is reversed by default.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/reversed/" target="_blank">Reversed Y axis</a>
    */
  val reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to show the axis line and title when the axis has no data.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/showempty/" target="_blank">When clicking the legend to hide series, one axis preserves line and title, the other doesn't</a>
    * @since 1.1
    */
  val showEmpty: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to show the first tick label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/showfirstlabel-false/" target="_blank">Set to false on X axis</a>
    */
  val showFirstLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to show the last tick label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/showlastlabel-true/" target="_blank">Set to true on X axis</a>
    */
  val showLastLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/startofweek-monday/" target="_blank">Monday by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/startofweek-sunday/" target="_blank">Sunday</a>
    */
  val startOfWeek: js.UndefOr[Double] = js.undefined

  /**
    * Whether to force the axis to start on a tick. Use this option with the <code>minPadding</code> option to control the axis start.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/startontick-false/" target="_blank">False by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/startontick-true/" target="_blank">true</a> on X axis
    * @since 1.2.0
    */
  val startOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The amount of ticks to draw on the axis. This opens up for aligning the ticks of multiple charts or panes within a chart. This option overrides the <code>tickPixelInterval</code> option.</p>
    * <p>This option only has an effect on linear axes. Datetime, logarithmic or category axes are not affected.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/tickamount/" target="_blank">8 ticks on Y axis</a>
    * @since 4.1.0
    */
  val tickAmount: js.UndefOr[Double] = js.undefined

  /**
    * Color for the main tick marks.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/tickcolor/" target="_blank">Red ticks on X axis</a>
    */
  val tickColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The interval of the tick marks in axis units. When <code>null</code>, the tick interval
    *  is computed to approximately follow the <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> on linear and datetime axes.
    *  On categorized axes, a <code>null</code> tickInterval will default to 1, one category. 
    *  Note that datetime axes are based on milliseconds, so for 
    *  example an interval of one day is expressed as <code>24 * 3600 * 1000</code>.</p>
    *  <p>On logarithmic axes, the tickInterval is based on powers, so a tickInterval of 1 means
    *  	one tick on each of 0.1, 1, 10, 100 etc. A tickInterval of 2 means a tick of 0.1, 10, 1000 etc.
    *  	A tickInterval of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40 etc.</p>
    * <p>If the tickInterval is too dense for labels to be drawn, Highcharts may remove ticks.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/tickinterval-5/" target="_blank">Tick interval of 5 on a linear axis</a>
    */
  val tickInterval: js.UndefOr[Double] = js.undefined

  /**
    * The pixel length of the main tick marks.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/ticklength/" target="_blank">20 px tick length on the X axis</a>
    */
  val tickLength: js.UndefOr[Double] = js.undefined

  /**
    * If tickInterval is <code>null</code> this option sets the approximate pixel interval of the
    *  tick marks. Not applicable to categorized axis. Defaults to <code>72</code> 
    *  for the Y axis and <code>100</code> for	the X axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/tickpixelinterval-50/" target="_blank">50 px on X axis</a>
    */
  val tickPixelInterval: js.UndefOr[Double] = js.undefined

  /**
    * The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/tickposition-outside/" target="_blank">"outside" by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/tickposition-inside/" target="_blank">"inside"</a> on X axis
    */
  val tickPosition: js.UndefOr[String] = js.undefined

  /**
    * A callback function returning array defining where the ticks are laid out on the axis. This overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible through <code>this.tickPositions</code> and can be modified by the callback.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/" target="_blank">Demo of tickPositions and tickPositioner</a>
    */
  val tickPositioner: js.UndefOr[js.Function] = js.undefined

  /**
    * An array defining where the ticks are laid out on the axis. This overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/" target="_blank">Demo of tickPositions and tickPositioner</a>
    */
  val tickPositions: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * The pixel width of the major tick marks.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/tickwidth/" target="_blank">10 px width</a>
    */
  val tickWidth: js.UndefOr[Double] = js.undefined

  /**
    * For categorized axes only. If <code>on</code> the tick mark is placed in the center of  the category, if <code>between</code> the tick mark is placed between categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else <code>on</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/tickmarkplacement-between/" target="_blank">"between" by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/tickmarkplacement-on/" target="_blank">"on"</a>
    */
  val tickmarkPlacement: js.UndefOr[String] = js.undefined

  /**
    * The axis title, showing next to the axis line.
    */
  val title: js.UndefOr[CleanJsObject[XAxisTitle]] = js.undefined

  /**
    * The type of axis. Can be one of <code>"linear"</code>, <code>"logarithmic"</code>, <code>"datetime"</code> or <code>"category"</code>. In a datetime axis, the numbers are given in milliseconds, and tick marks are placed 		on appropriate values like full hours or days. In a category axis, the <a href="#series.data">point names</a> of the chart's series are used for categories, if not a <a href="#xAxis.categories">categories</a> array is defined.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/type-linear/" target="_blank">"linear"</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/type-datetime/" target="_blank">"datetime" with regular intervals</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/type-datetime-irregular/" target="_blank">"datetime" with irregular intervals</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/type-log/" target="_blank">"logarithmic"</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/type-log-minorgrid/" target="_blank">"logarithmic" with minor grid lines</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/type-log-both/" target="_blank">"logarithmic" on two axes</a>.
    */
  val `type`: js.UndefOr[String] = js.undefined

  /**
    * Datetime axis only. An array determining what time intervals the ticks are allowed to fall on. Each array item is an array where the first value is the time unit and the  second value another array of allowed multiples. Defaults to:
    * <pre>units: [[
    * 	'millisecond', // unit name
    * 	[1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples
    * ], [
    * 	'second',
    * 	[1, 2, 5, 10, 15, 30]
    * ], [
    * 	'minute',
    * 	[1, 2, 5, 10, 15, 30]
    * ], [
    * 	'hour',
    * 	[1, 2, 3, 4, 6, 8, 12]
    * ], [
    * 	'day',
    * 	[1]
    * ], [
    * 	'week',
    * 	[1]
    * ], [
    * 	'month',
    * 	[1, 3, 6]
    * ], [
    * 	'year',
    * 	null
    * ]]</pre>
    */
  val units: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * Whether axis, including axis title, line, ticks and labels, should be visible.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/visible/">Toggle axis visibility</a>.
    * @since 4.1.9
    */
  val visible: js.UndefOr[Boolean] = js.undefined
}

object XAxis {
  /**
    * @param allowDecimals Whether to allow decimals in this axis' ticks. When counting integers, like.  persons or hits on a web page, decimals must be avoided in the axis tick.  labels.
    * @param alternateGridColor When using an alternate grid color, a band is painted across the plot area between every other grid line.
    * @param breaks An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. Requires that the broken-axis.js module is loaded.
    * @param categories <p>If categories are present for the xAxis, names are used instead of numbers for that axis. Since Highcharts 3.0, categories can also be extracted by giving each point a <a href="#series.data">name</a> and setting axis <a href="#xAxis.type">type</a> to <code>category</code>. However, if you have multiple series, best practice remains defining the <code>categories</code> array.</p>. . <p>Example:. <pre>categories: ['Apples', 'Bananas', 'Oranges']</pre>. 		 Defaults to <code>null</code>. </p>
    * @param ceiling The highest allowed value for automatically computed axis extremes.
    * @param crosshair Configure a crosshair that follows either the mouse pointer or the hovered point.
    * @param dateTimeLabelFormats For a datetime axis, the scale will automatically adjust to the appropriate unit..  This member gives the default string representations used for each unit. For an.  overview of the replacement codes, see dateFormat..  Defaults to:. <pre>{. 	millisecond: '%H:%M:%S.%L',. 	second: '%H:%M:%S',. 	minute: '%H:%M',. 	hour: '%H:%M',. 	day: '%e. %b',. 	week: '%e. %b',. 	month: '%b \'%y',. 	year: '%Y'. }</pre>
    * @param endOnTick Whether to force the axis to end on a tick. Use this option with the <code>maxPadding</code> option to control the axis end.
    * @param events Event handlers for the axis.
    * @param floor The lowest allowed value for automatically computed axis extremes.
    * @param gridLineColor Color of the grid lines extending the ticks across the plot area.
    * @param gridLineDashStyle The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @param gridLineWidth The width of the grid lines extending the ticks across the plot area.
    * @param gridZIndex The Z index of the grid lines.
    * @param id An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
    * @param labels The axis labels show the number or category for each tick.
    * @param lineColor The color of the line marking the axis itself.
    * @param lineWidth The width of the line marking the axis itself.
    * @param linkedTo Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info, or to ease reading the chart by duplicating the scales.
    * @param max The maximum value of the axis. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up. The actual maximum value is also influenced by  <a class="internal" href="#chart">chart.alignTicks</a>.
    * @param maxPadding Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area. When the axis' <code>max</code> option is set or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.
    * @param maxZoom Deprecated. Renamed to <code>minRange</code> as of Highcharts 2.2.
    * @param min The minimum value of the axis. If <code>null</code> the min value is automatically calculated. If the <code>startOnTick</code> option is true, the <code>min</code> value might be rounded down.
    * @param minPadding Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. When the axis' <code>min</code> option is set or a min extreme is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.
    * @param minRange <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour.</p> . . <p>The default minRange for the x axis is five times the smallest interval between any of the data points.</p> . . <p>On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 	1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc.</p>. . <p>Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code> settings also affect how the extremes of the axis are computed.</p>
    * @param minTickInterval The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
    * @param minorGridLineColor Color of the minor, secondary grid lines.
    * @param minorGridLineDashStyle The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @param minorGridLineWidth Width of the minor, secondary grid lines.
    * @param minorTickColor Color for the minor tick marks.
    * @param minorTickInterval <p>Tick interval in scale units for the minor ticks. On a linear axis, if <code>"auto"</code>, .  the minor tick interval is calculated as a fifth of the tickInterval. If.  <code>null</code>, minor ticks are not shown.</p>.  <p>On logarithmic axes, the unit is the power of the value. For example, setting.  	the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting.  	the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, .  	10 and 100 etc. A minorTickInterval of "auto" on a log axis results in a best guess,.  	attempting to enter approximately 5 minor ticks between each major tick.</p>. . <p>If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.</a>. . <p>On axes using <a href="#xAxis.categories">categories</a>, minor ticks are not supported.</p>
    * @param minorTickLength The pixel length of the minor tick marks.
    * @param minorTickPosition The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @param minorTickWidth The pixel width of the minor tick mark.
    * @param offset The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot.
    * @param opposite Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. This is typically used with dual or multiple axes.
    * @param plotBands <p>An array of colored bands stretching across the plot area marking an interval on the axis.</p>. . <p>In a gauge, a plot band on the Y axis (value axis) will stretch along the perimeter of the gauge.</p>
    * @param plotLines An array of lines stretching across the plot area, marking a specific value on one of the axes.
    * @param reversed Whether to reverse the axis so that the highest number is closest to the origin. If the chart is inverted, the x axis is reversed by default.
    * @param showEmpty Whether to show the axis line and title when the axis has no data.
    * @param showFirstLabel Whether to show the first tick label.
    * @param showLastLabel Whether to show the last tick label.
    * @param startOfWeek For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday.
    * @param startOnTick Whether to force the axis to start on a tick. Use this option with the <code>minPadding</code> option to control the axis start.
    * @param tickAmount <p>The amount of ticks to draw on the axis. This opens up for aligning the ticks of multiple charts or panes within a chart. This option overrides the <code>tickPixelInterval</code> option.</p>. <p>This option only has an effect on linear axes. Datetime, logarithmic or category axes are not affected.</p>
    * @param tickColor Color for the main tick marks.
    * @param tickInterval <p>The interval of the tick marks in axis units. When <code>null</code>, the tick interval.  is computed to approximately follow the <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> on linear and datetime axes..  On categorized axes, a <code>null</code> tickInterval will default to 1, one category. .  Note that datetime axes are based on milliseconds, so for .  example an interval of one day is expressed as <code>24 * 3600 * 1000</code>.</p>.  <p>On logarithmic axes, the tickInterval is based on powers, so a tickInterval of 1 means.  	one tick on each of 0.1, 1, 10, 100 etc. A tickInterval of 2 means a tick of 0.1, 10, 1000 etc..  	A tickInterval of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40 etc.</p>. <p>If the tickInterval is too dense for labels to be drawn, Highcharts may remove ticks.</p>
    * @param tickLength The pixel length of the main tick marks.
    * @param tickPixelInterval If tickInterval is <code>null</code> this option sets the approximate pixel interval of the.  tick marks. Not applicable to categorized axis. Defaults to <code>72</code> .  for the Y axis and <code>100</code> for	the X axis.
    * @param tickPosition The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @param tickPositioner A callback function returning array defining where the ticks are laid out on the axis. This overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible through <code>this.tickPositions</code> and can be modified by the callback.
    * @param tickPositions An array defining where the ticks are laid out on the axis. This overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.
    * @param tickWidth The pixel width of the major tick marks.
    * @param tickmarkPlacement For categorized axes only. If <code>on</code> the tick mark is placed in the center of  the category, if <code>between</code> the tick mark is placed between categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else <code>on</code>.
    * @param title The axis title, showing next to the axis line.
    * @param `type` The type of axis. Can be one of <code>"linear"</code>, <code>"logarithmic"</code>, <code>"datetime"</code> or <code>"category"</code>. In a datetime axis, the numbers are given in milliseconds, and tick marks are placed 		on appropriate values like full hours or days. In a category axis, the <a href="#series.data">point names</a> of the chart's series are used for categories, if not a <a href="#xAxis.categories">categories</a> array is defined.
    * @param units Datetime axis only. An array determining what time intervals the ticks are allowed to fall on. Each array item is an array where the first value is the time unit and the  second value another array of allowed multiples. Defaults to:. <pre>units: [[. 	'millisecond', // unit name. 	[1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples. ], [. 	'second',. 	[1, 2, 5, 10, 15, 30]. ], [. 	'minute',. 	[1, 2, 5, 10, 15, 30]. ], [. 	'hour',. 	[1, 2, 3, 4, 6, 8, 12]. ], [. 	'day',. 	[1]. ], [. 	'week',. 	[1]. ], [. 	'month',. 	[1, 3, 6]. ], [. 	'year',. 	null. ]]</pre>
    * @param visible Whether axis, including axis title, line, ticks and labels, should be visible.
    */
  def apply(allowDecimals: js.UndefOr[Boolean] = js.undefined, alternateGridColor: js.UndefOr[String | js.Object] = js.undefined, breaks: js.UndefOr[js.Array[CleanJsObject[XAxisBreaks]]] = js.undefined, categories: js.UndefOr[js.Array[String]] = js.undefined, ceiling: js.UndefOr[Double] = js.undefined, crosshair: js.UndefOr[Boolean | CleanJsObject[XAxisCrosshair]] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined, endOnTick: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[XAxisEvents]] = js.undefined, floor: js.UndefOr[Double] = js.undefined, gridLineColor: js.UndefOr[String | js.Object] = js.undefined, gridLineDashStyle: js.UndefOr[String] = js.undefined, gridLineWidth: js.UndefOr[Double] = js.undefined, gridZIndex: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, labels: js.UndefOr[CleanJsObject[XAxisLabels]] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, linkedTo: js.UndefOr[Double] = js.undefined, max: js.UndefOr[Double] = js.undefined, maxPadding: js.UndefOr[Double] = js.undefined, maxZoom: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined, minPadding: js.UndefOr[Double] = js.undefined, minRange: js.UndefOr[Double] = js.undefined, minTickInterval: js.UndefOr[Double] = js.undefined, minorGridLineColor: js.UndefOr[String | js.Object] = js.undefined, minorGridLineDashStyle: js.UndefOr[String] = js.undefined, minorGridLineWidth: js.UndefOr[Double] = js.undefined, minorTickColor: js.UndefOr[String | js.Object] = js.undefined, minorTickInterval: js.UndefOr[String | Double] = js.undefined, minorTickLength: js.UndefOr[Double] = js.undefined, minorTickPosition: js.UndefOr[String] = js.undefined, minorTickWidth: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined, opposite: js.UndefOr[Boolean] = js.undefined, plotBands: js.UndefOr[js.Array[CleanJsObject[XAxisPlotBands]]] = js.undefined, plotLines: js.UndefOr[js.Array[CleanJsObject[XAxisPlotLines]]] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, showEmpty: js.UndefOr[Boolean] = js.undefined, showFirstLabel: js.UndefOr[Boolean] = js.undefined, showLastLabel: js.UndefOr[Boolean] = js.undefined, startOfWeek: js.UndefOr[Double] = js.undefined, startOnTick: js.UndefOr[Boolean] = js.undefined, tickAmount: js.UndefOr[Double] = js.undefined, tickColor: js.UndefOr[String | js.Object] = js.undefined, tickInterval: js.UndefOr[Double] = js.undefined, tickLength: js.UndefOr[Double] = js.undefined, tickPixelInterval: js.UndefOr[Double] = js.undefined, tickPosition: js.UndefOr[String] = js.undefined, tickPositioner: js.UndefOr[js.Function] = js.undefined, tickPositions: js.UndefOr[js.Array[Double]] = js.undefined, tickWidth: js.UndefOr[Double] = js.undefined, tickmarkPlacement: js.UndefOr[String] = js.undefined, title: js.UndefOr[CleanJsObject[XAxisTitle]] = js.undefined, `type`: js.UndefOr[String] = js.undefined, units: js.UndefOr[js.Array[js.Any]] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined): XAxis = {
    val allowDecimalsOuter: js.UndefOr[Boolean] = allowDecimals
    val alternateGridColorOuter: js.UndefOr[String | js.Object] = alternateGridColor
    val breaksOuter: js.UndefOr[js.Array[CleanJsObject[XAxisBreaks]]] = breaks
    val categoriesOuter: js.UndefOr[js.Array[String]] = categories
    val ceilingOuter: js.UndefOr[Double] = ceiling
    val crosshairOuter: js.UndefOr[Boolean | CleanJsObject[XAxisCrosshair]] = crosshair
    val dateTimeLabelFormatsOuter: js.UndefOr[js.Object] = dateTimeLabelFormats
    val endOnTickOuter: js.UndefOr[Boolean] = endOnTick
    val eventsOuter: js.UndefOr[CleanJsObject[XAxisEvents]] = events
    val floorOuter: js.UndefOr[Double] = floor
    val gridLineColorOuter: js.UndefOr[String | js.Object] = gridLineColor
    val gridLineDashStyleOuter: js.UndefOr[String] = gridLineDashStyle
    val gridLineWidthOuter: js.UndefOr[Double] = gridLineWidth
    val gridZIndexOuter: js.UndefOr[Double] = gridZIndex
    val idOuter: js.UndefOr[String] = id
    val labelsOuter: js.UndefOr[CleanJsObject[XAxisLabels]] = labels
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val linkedToOuter: js.UndefOr[Double] = linkedTo
    val maxOuter: js.UndefOr[Double] = max
    val maxPaddingOuter: js.UndefOr[Double] = maxPadding
    val maxZoomOuter: js.UndefOr[Double] = maxZoom
    val minOuter: js.UndefOr[Double] = min
    val minPaddingOuter: js.UndefOr[Double] = minPadding
    val minRangeOuter: js.UndefOr[Double] = minRange
    val minTickIntervalOuter: js.UndefOr[Double] = minTickInterval
    val minorGridLineColorOuter: js.UndefOr[String | js.Object] = minorGridLineColor
    val minorGridLineDashStyleOuter: js.UndefOr[String] = minorGridLineDashStyle
    val minorGridLineWidthOuter: js.UndefOr[Double] = minorGridLineWidth
    val minorTickColorOuter: js.UndefOr[String | js.Object] = minorTickColor
    val minorTickIntervalOuter: js.UndefOr[String | Double] = minorTickInterval
    val minorTickLengthOuter: js.UndefOr[Double] = minorTickLength
    val minorTickPositionOuter: js.UndefOr[String] = minorTickPosition
    val minorTickWidthOuter: js.UndefOr[Double] = minorTickWidth
    val offsetOuter: js.UndefOr[Double] = offset
    val oppositeOuter: js.UndefOr[Boolean] = opposite
    val plotBandsOuter: js.UndefOr[js.Array[CleanJsObject[XAxisPlotBands]]] = plotBands
    val plotLinesOuter: js.UndefOr[js.Array[CleanJsObject[XAxisPlotLines]]] = plotLines
    val reversedOuter: js.UndefOr[Boolean] = reversed
    val showEmptyOuter: js.UndefOr[Boolean] = showEmpty
    val showFirstLabelOuter: js.UndefOr[Boolean] = showFirstLabel
    val showLastLabelOuter: js.UndefOr[Boolean] = showLastLabel
    val startOfWeekOuter: js.UndefOr[Double] = startOfWeek
    val startOnTickOuter: js.UndefOr[Boolean] = startOnTick
    val tickAmountOuter: js.UndefOr[Double] = tickAmount
    val tickColorOuter: js.UndefOr[String | js.Object] = tickColor
    val tickIntervalOuter: js.UndefOr[Double] = tickInterval
    val tickLengthOuter: js.UndefOr[Double] = tickLength
    val tickPixelIntervalOuter: js.UndefOr[Double] = tickPixelInterval
    val tickPositionOuter: js.UndefOr[String] = tickPosition
    val tickPositionerOuter: js.UndefOr[js.Function] = tickPositioner
    val tickPositionsOuter: js.UndefOr[js.Array[Double]] = tickPositions
    val tickWidthOuter: js.UndefOr[Double] = tickWidth
    val tickmarkPlacementOuter: js.UndefOr[String] = tickmarkPlacement
    val titleOuter: js.UndefOr[CleanJsObject[XAxisTitle]] = title
    val typeOuter: js.UndefOr[String] = `type`
    val unitsOuter: js.UndefOr[js.Array[js.Any]] = units
    val visibleOuter: js.UndefOr[Boolean] = visible
    new XAxis {
      override val allowDecimals: js.UndefOr[Boolean] = allowDecimalsOuter
      override val alternateGridColor: js.UndefOr[String | js.Object] = alternateGridColorOuter
      override val breaks: js.UndefOr[js.Array[CleanJsObject[XAxisBreaks]]] = breaksOuter
      override val categories: js.UndefOr[js.Array[String]] = categoriesOuter
      override val ceiling: js.UndefOr[Double] = ceilingOuter
      override val crosshair: js.UndefOr[Boolean | CleanJsObject[XAxisCrosshair]] = crosshairOuter
      override val dateTimeLabelFormats: js.UndefOr[js.Object] = dateTimeLabelFormatsOuter
      override val endOnTick: js.UndefOr[Boolean] = endOnTickOuter
      override val events: js.UndefOr[CleanJsObject[XAxisEvents]] = eventsOuter
      override val floor: js.UndefOr[Double] = floorOuter
      override val gridLineColor: js.UndefOr[String | js.Object] = gridLineColorOuter
      override val gridLineDashStyle: js.UndefOr[String] = gridLineDashStyleOuter
      override val gridLineWidth: js.UndefOr[Double] = gridLineWidthOuter
      override val gridZIndex: js.UndefOr[Double] = gridZIndexOuter
      override val id: js.UndefOr[String] = idOuter
      override val labels: js.UndefOr[CleanJsObject[XAxisLabels]] = labelsOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val linkedTo: js.UndefOr[Double] = linkedToOuter
      override val max: js.UndefOr[Double] = maxOuter
      override val maxPadding: js.UndefOr[Double] = maxPaddingOuter
      override val maxZoom: js.UndefOr[Double] = maxZoomOuter
      override val min: js.UndefOr[Double] = minOuter
      override val minPadding: js.UndefOr[Double] = minPaddingOuter
      override val minRange: js.UndefOr[Double] = minRangeOuter
      override val minTickInterval: js.UndefOr[Double] = minTickIntervalOuter
      override val minorGridLineColor: js.UndefOr[String | js.Object] = minorGridLineColorOuter
      override val minorGridLineDashStyle: js.UndefOr[String] = minorGridLineDashStyleOuter
      override val minorGridLineWidth: js.UndefOr[Double] = minorGridLineWidthOuter
      override val minorTickColor: js.UndefOr[String | js.Object] = minorTickColorOuter
      override val minorTickInterval: js.UndefOr[String | Double] = minorTickIntervalOuter
      override val minorTickLength: js.UndefOr[Double] = minorTickLengthOuter
      override val minorTickPosition: js.UndefOr[String] = minorTickPositionOuter
      override val minorTickWidth: js.UndefOr[Double] = minorTickWidthOuter
      override val offset: js.UndefOr[Double] = offsetOuter
      override val opposite: js.UndefOr[Boolean] = oppositeOuter
      override val plotBands: js.UndefOr[js.Array[CleanJsObject[XAxisPlotBands]]] = plotBandsOuter
      override val plotLines: js.UndefOr[js.Array[CleanJsObject[XAxisPlotLines]]] = plotLinesOuter
      override val reversed: js.UndefOr[Boolean] = reversedOuter
      override val showEmpty: js.UndefOr[Boolean] = showEmptyOuter
      override val showFirstLabel: js.UndefOr[Boolean] = showFirstLabelOuter
      override val showLastLabel: js.UndefOr[Boolean] = showLastLabelOuter
      override val startOfWeek: js.UndefOr[Double] = startOfWeekOuter
      override val startOnTick: js.UndefOr[Boolean] = startOnTickOuter
      override val tickAmount: js.UndefOr[Double] = tickAmountOuter
      override val tickColor: js.UndefOr[String | js.Object] = tickColorOuter
      override val tickInterval: js.UndefOr[Double] = tickIntervalOuter
      override val tickLength: js.UndefOr[Double] = tickLengthOuter
      override val tickPixelInterval: js.UndefOr[Double] = tickPixelIntervalOuter
      override val tickPosition: js.UndefOr[String] = tickPositionOuter
      override val tickPositioner: js.UndefOr[js.Function] = tickPositionerOuter
      override val tickPositions: js.UndefOr[js.Array[Double]] = tickPositionsOuter
      override val tickWidth: js.UndefOr[Double] = tickWidthOuter
      override val tickmarkPlacement: js.UndefOr[String] = tickmarkPlacementOuter
      override val title: js.UndefOr[CleanJsObject[XAxisTitle]] = titleOuter
      override val `type`: js.UndefOr[String] = typeOuter
      override val units: js.UndefOr[js.Array[js.Any]] = unitsOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
    }
  }
}
