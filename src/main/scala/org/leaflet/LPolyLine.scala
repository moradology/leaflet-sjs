package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Polyline")
class LPolyline extends LPath {

  def this(latlngs: js.Array[LLatLng], options: UndefOr[LPolylineOptions] = undefined) = this()

  def addLatLng(latlng: LLatLng): LPolyline = js.native

  def setLatLngs(latlngs: js.Array[LLatLng]): LPolyline = js.native

  def getLatLngs(): js.Array[LLatLng] = js.native

  def spliceLatLngs(index: Int, pointsToRemove: Int, latlng: UndefOr[LLatLng] = undefined): js.Array[LLatLng] = js.native

  override def getBounds(): LLatLngBounds = js.native

  def toGeoJSON(): js.Dynamic = js.native

}

object LPolyline {
  def apply(latlngs: js.Array[LLatLng], options: UndefOr[LPolylineOptions] = undefined) = new LPolyline(latlngs, options)
}

@js.native
trait LPolylineOptions extends LPathOptions

object LPolylineOptions extends LPolylineOptionsBuilder(OptMap.empty)

class LPolylineOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LPolylineOptions, LPolylineOptionsBuilder](new LPolylineOptionsBuilder(_)) {

  def fill(v: Boolean) = jsOpt("fill", v)

  def lineCap(v: String) = jsOpt("lineCap", v)

  def opacity(v: Double) = jsOpt("opacity", v)

  def color(v: String) = jsOpt("color", v)

  def fillColor(v: String) = jsOpt("fillColor", v)

  def pointerEvents(v: String) = jsOpt("pointerEvents", v)

  def lineJoin(v: String) = jsOpt("lineJoin", v)

  def clickable(v: Boolean) = jsOpt("clickable", v)

  def stroke(v: Boolean) = jsOpt("stroke", v)

  def dashArray(v: String) = jsOpt("dashArray", v)

  def smoothFactor(v: Double) = jsOpt("smoothFactor", v)

  def className(v: String) = jsOpt("className", v)

  def weight(v: Double) = jsOpt("weight", v)

  def noClip(v: Boolean) = jsOpt("noClip", v)

  def fillOpacity(v: Double) = jsOpt("fillOpacity", v)

}

