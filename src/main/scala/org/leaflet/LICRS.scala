package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
trait LICRS extends js.Object {
  def latLngToPoint(latlng: LLatLng, zoom: Double): LPoint = js.native

  def pointToLatLng(point: LPoint, zoom: Double): LLatLng = js.native

  def project(latlng: LLatLng): LPoint = js.native

  def scale(zoom: Double): Double = js.native

  def getSize(zoom: Double): LPoint = js.native

  val projection: LIProjection = js.native
  val transformation: LTransformation = js.native
  val code: String = js.native
  val EPSG3857: LICRS = js.native
  val EPSG4326: LICRS = js.native
  val EPSG3395: LICRS = js.native
  val Simple: LICRS = js.native
}

