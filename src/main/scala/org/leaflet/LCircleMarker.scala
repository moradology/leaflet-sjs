package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.CircleMarker")
class LCircleMarker extends LCircle {

  def this(latlng: LLatLng, options: UndefOr[LPathOptions] = undefined) = this()

  override def setLatLng(latlng: LLatLng): LCircleMarker = js.native

  override def setRadius(radius: Double): LCircleMarker = js.native

  override def toGeoJSON(): js.Dynamic = js.native
}

object LCircleMarker {

  def apply(latlng: LLatLng, options: UndefOr[LPathOptions] = undefined) = new LCircleMarker(latlng, options)

}

@js.native
trait LCircleMarkerOptions extends LPathOptions

object LCircleMarkerOptions extends LCircleMarkerOptionsBuilder(OptMap.empty)

class LCircleMarkerOptionsBuilder(val dict :OptMap) extends JSOptionBuilder[LCircleMarkerOptions,LCircleMarkerOptionsBuilder](new LCircleMarkerOptionsBuilder(_)) {

  def fill(v: Boolean) = jsOpt("fill",v)

  def lineCap(v: String) = jsOpt("lineCap",v)

  def opacity(v: Double) = jsOpt("opacity",v)

  def color(v: String) = jsOpt("color",v)

  def fillColor(v: String) = jsOpt("fillColor",v)

  def pointerEvents(v: String) = jsOpt("pointerEvents",v)

  def lineJoin(v: String) = jsOpt("lineJoin",v)

  def clickable(v: Boolean) = jsOpt("clickable",v)

  def stroke(v: Boolean) = jsOpt("stroke",v)

  def dashArray(v: String) = jsOpt("dashArray",v)

  def className(v: String) = jsOpt("className",v)

  def weight(v: Double) = jsOpt("weight",v)

  def radius(v: Double) = jsOpt("radius",v)

  def fillOpacity(v: Double) = jsOpt("fillOpacity",v)

}

