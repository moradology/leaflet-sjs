package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Circle")
class LCircle extends LPath {

  def this(latlng: LLatLng, radius: Double, options: UndefOr[LPathOptions] = undefined) = this()

  def hetLatLng(): LLatLng = js.native

  def getRadius(): Double = js.native

  def setLatLng(latlng: LLatLng): LCircle = js.native

  def setRadius(radius: Double): LCircle = js.native

  def toGeoJSON(): js.Dynamic = js.native


}

object LCircle {
  def apply(latlng: LLatLng, radius: Double, options: UndefOr[LPathOptions] = undefined) = new LCircle(latlng, radius, options)
}
