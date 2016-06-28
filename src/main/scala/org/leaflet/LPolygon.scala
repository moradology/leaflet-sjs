package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Polygon")
class LPolygon extends LPolyline {

  def this(latlngs: js.Array[LLatLng], options: UndefOr[LPolylineOptions] = undefined) = this()

  override def toGeoJSON(): js.Dynamic = js.native
}

object LPolygon {

  def apply(latlngs: js.Array[LLatLng], options: UndefOr[LPolylineOptions] = undefined) = new LPolygon(latlngs, options)

}

