package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
trait LIProjection extends js.Object {
  def project(latlng: LLatLng): LPoint = js.native

  def unproject(point: LPoint): LLatLng = js.native

  val SphericalMercator: LIProjection = js.native
  val Mercator: LIProjection = js.native
  val LonLat: LIProjection = js.native
}
