package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
trait LZoomOptions extends js.Object

object LZoomOptions extends LZoomOptionsBuilder(OptMap.empty)

class LZoomOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LZoomOptions, LZoomOptionsBuilder](new LZoomOptionsBuilder(_)) {

  def animate(v: Boolean) = jsOpt("animate", v)

}

@js.native
trait LPanOptions extends js.Object

object LPanOptions extends LPanOptionsBuilder(OptMap.empty)

class LPanOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LPanOptions, LPanOptionsBuilder](new LPanOptionsBuilder(_)) {

  def duration(v: Double) = jsOpt("duration", v)

  def animate(v: Boolean) = jsOpt("animate", v)

  def noMoveStart(v: Boolean) = jsOpt("noMoveStart", v)

  def easeLinearity(v: Double) = jsOpt("easeLinearity", v)

}

@js.native
trait LZoomPanOptions extends js.Object

object LZoomPanOptions extends LZoomPanOptionsBuilder(OptMap.empty)

class LZoomPanOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LZoomPanOptions, LZoomPanOptionsBuilder](new LZoomPanOptionsBuilder(_)) {

  def animate(v: Boolean) = jsOpt("animate", v)

  def pan(v: LPanOptions) = jsOpt("pan", v)

  def reset(v: Boolean) = jsOpt("reset", v)

  def zoom(v: LZoomOptions) = jsOpt("zoom", v)

}

@js.native
trait LFitBoundsOptions extends LZoomPanOptions

object LFitBoundsOptions extends LFitBoundsOptionsBuilder(OptMap.empty)

class LFitBoundsOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LFitBoundsOptions, LFitBoundsOptionsBuilder](new LFitBoundsOptionsBuilder(_)) {

  def paddingTopLeft(v: LPoint) = jsOpt("paddingTopLeft", v)

  def paddingBottomRight(v: LPoint) = jsOpt("paddingBottomRight", v)

  def padding(v: LPoint) = jsOpt("padding", v)

  def maxZoom(v: Double) = jsOpt("maxZoom", v)

}

@js.native
trait LocateOptions extends js.Object

object LocateOptions extends LocateOptionsBuilder(OptMap.empty)

class LocateOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LocateOptions, LocateOptionsBuilder](new LocateOptionsBuilder(_)) {

  def timeout(v: Double) = jsOpt("timeout", v)

  def maximumAge(v: Double) = jsOpt("maximumAge", v)

  def enableHighAccuracy(v: Boolean) = jsOpt("enableHighAccuracy", v)

  def maxZoom(v: Double) = jsOpt("maxZoom", v)

  def setView(v: Boolean) = jsOpt("setView", v)

  def watch(v: Boolean) = jsOpt("watch", v)

}

@js.native
trait LIHandler extends js.Object {

  def enable(): Unit = js.native

  def disable(): Unit = js.native

  def enabled(): Boolean = js.native

}

