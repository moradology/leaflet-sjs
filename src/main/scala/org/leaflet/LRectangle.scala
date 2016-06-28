package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Rectangle")
class LRectangle extends LPolygon {

  def this(bounds: LLatLngBounds, options: UndefOr[LPathOptions] = undefined) = this()

  def setBounds(bounds: LLatLngBounds): LRectangle = js.native

}

object LRectangle {
  def apply(bounds: LLatLngBounds, options: UndefOr[LPathOptions] = undefined) = new LRectangle(bounds, options)
}
