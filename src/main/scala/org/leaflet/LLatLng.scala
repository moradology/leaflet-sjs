package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.LatLng")
class LLatLng(val lat: Double, val lng: Double, alt: UndefOr[Double]) extends js.Object {
  def this(lat: Double, lng: Double) = this(lat, lng, undefined)

  def distanceTo(other: LLatLng): Double = js.native

  def equals(other: LLatLng): Boolean = js.native

  def wrap(left: Double, right: Double): LLatLng = js.native
}

object LLatLng {
  def apply(lat: Double, lng: Double, alt: UndefOr[Double] = undefined) = new LLatLng(lat, lng, alt)
}

