package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Bounds")
class LBounds(topLeft: LPoint, bottomRight: LPoint) extends js.Object {

  val min: LPoint = js.native
  val max: LPoint = js.native

  def extend(point: LPoint): Unit = js.native

  def getCenter(): LPoint = js.native

  def contains(other: LBounds): Boolean = js.native

  def contains(other: LPoint): Boolean = js.native

  def intersects(other: LBounds): Boolean = js.native

  def isValid(): Boolean = js.native

  def getSize(): LPoint = js.native

}

object LBounds {
  def apply(topLeft: LPoint, bottomRight: LPoint) = new LBounds(topLeft, bottomRight)
}

@js.native
@JSName("L.LatLngBounds")
class LLatLngBounds(southWest: LLatLng, northEast: LLatLng) extends js.Object {

  def extend(latlng: LLatLng): LLatLngBounds = js.native

  @JSName("extend")
  def extendWithBounds(latlngBounds: LLatLngBounds): LLatLngBounds = js.native

  def getSouthWest(): LLatLng = js.native

  def getNorthEast(): LLatLng = js.native

  def getNorthWest(): LLatLng = js.native

  def getSouthEast(): LLatLng = js.native

  def getWest(): Double = js.native

  def getSouth(): Double = js.native

  def getEast(): Double = js.native

  def getNorth(): Double = js.native

  def getCenter(): Double = js.native

  def contains(other: LLatLngBounds): Boolean = js.native

  def intersects(other: LLatLngBounds): Boolean = js.native

  def equals(other: LLatLngBounds): Boolean = js.native

  def toBBoxString(): String = js.native

  def pad(bufferRatio: Double): LLatLngBounds = js.native

  def isValid(): Boolean = js.native
}

object LLatLngBounds {
  def apply(southWest: LLatLng, northEast: LLatLng) = new LLatLngBounds(northEast, southWest)
}

