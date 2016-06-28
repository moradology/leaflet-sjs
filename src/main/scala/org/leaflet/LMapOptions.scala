package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
trait LMapOptions extends js.Object

object LMapOptions extends LMapOptionsBuilder(OptMap.empty)

class LMapOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LMapOptions, LMapOptionsBuilder](new LMapOptionsBuilder(_)) {

  def keyboardZoomOffset(v: Int) = jsOpt("keyboardZoomOffset", v)

  def bounceAtZoomLimits(v: Boolean) = jsOpt("bounceAtZoomLimits", v)

  def fadeAnimation(v: Boolean) = jsOpt("fadeAnimation", v)

  def maxZoom(v: Int) = jsOpt("maxZoom", v)

  def keyboardPanOffset(v: Int) = jsOpt("keyboardPanOffset", v)

  def zoomControl(v: Boolean) = jsOpt("zoomControl", v)

  def inertiaMaxSpeed(v: Int) = jsOpt("inertiaMaxSpeed", v)

  def zoomAnimationThreshold(v: Int) = jsOpt("zoomAnimationThreshold", v)

  def zoom(v: Int) = jsOpt("zoom", v)

  def tapTolerance(v: Int) = jsOpt("tapTolerance", v)

  def layers(v: js.Array[LILayer]) = jsOpt("layers", v)

  def worldCopyJump(v: Boolean) = jsOpt("worldCopyJump", v)

  def trackResize(v: Boolean) = jsOpt("trackResize", v)

  def touchZoom(v: Boolean) = jsOpt("touchZoom", v)

  def tap(v: Boolean) = jsOpt("tap", v)

  def dragging(v: Boolean) = jsOpt("dragging", v)

  def scrollWheelZoom(v: Boolean) = jsOpt("scrollWheelZoom", v)

  def boxZoom(v: Boolean) = jsOpt("boxZoom", v)

  def inertia(v: Boolean) = jsOpt("inertia", v)

  def attributionControl(v: Boolean) = jsOpt("attributionControl", v)

  def doubleClickZoom(v: Boolean) = jsOpt("doubleClickZoom", v)

  def crs(v: LICRS) = jsOpt("crs", v)

  def inertiaDeceleration(v: Int) = jsOpt("inertiaDeceleration", v)

  def zoomAnimation(v: Boolean) = jsOpt("zoomAnimation", v)

  def center(v: LLatLng) = jsOpt("center", v)

  def closePopupOnClick(v: Boolean) = jsOpt("closePopupOnClick", v)

  def markerZoomAnimation(v: Boolean) = jsOpt("markerZoomAnimation", v)

  def minZoom(v: Int) = jsOpt("minZoom", v)

  def maxBounds(v: LLatLngBounds) = jsOpt("maxBounds", v)

  def inertiaThreshold(v: Int) = jsOpt("inertiaThreshold", v)

  def keyboard(v: Boolean) = jsOpt("keyboard", v)

}


