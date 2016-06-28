package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Path")
trait LPath extends LILayer {

  def addTo(map: LMap): this.type = js.native

  def bindPopup(html: String, options: UndefOr[LPopupOptions] = undefined): this.type = js.native

  @JSName("bindPopup")
  def bindPopupWithElement(el: HTMLElement, options: UndefOr[LPopupOptions] = undefined): this.type = js.native

  @JSName("bindPopup")
  def bindPopupWithPopup(popup: LPopup, options: UndefOr[LPopupOptions] = undefined): this.type = js.native

  def unbindPopup(): this.type = js.native

  def openPopup(latlng: UndefOr[LLatLng] = undefined): this.type = js.native

  def closePopup(): this.type = js.native

  def setStyle(obj: LPathOptions): this.type = js.native

  def getBounds(): LLatLngBounds = js.native

  def bringToFront(): this.type = js.native

  def bringToBack(): this.type = js.native

  def redraw(): this.type = js.native

  val SVG: Boolean = js.native
  val VML: Boolean = js.native
  val CANVAS: Boolean = js.native
  val CLIP_PADDING: Double = js.native

}

@js.native
trait LPathOptions extends js.Object {

  val stroke: UndefOr[Boolean] = js.native
  val color: UndefOr[String] = js.native
  val weight: UndefOr[Double] = js.native
  val opacity: UndefOr[Double] = js.native
  val fill: UndefOr[Boolean] = js.native
  val fillColor: UndefOr[String] = js.native
  val fillOpacity: UndefOr[Double] = js.native
  val dashArray: UndefOr[String] = js.native
  val lineCap: UndefOr[String] = js.native
  val lineJoin: UndefOr[String] = js.native
  val clickable: UndefOr[Boolean] = js.native
  val pointerEvents: UndefOr[String] = js.native
  val className: UndefOr[String] = js.native

}

object LPathOptions extends LPathOptionsBuilder(OptMap.empty)


class LPathOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LPathOptions, LPathOptionsBuilder](new LPathOptionsBuilder(_)) {

  def stroke(v: Boolean) = jsOpt("stroke", v)

  def color(v: String) = jsOpt("color", v)

  def weight(v: Double) = jsOpt("weight", v)

  def opacity(v: Double) = jsOpt("opacity", v)

  def fill(v: Boolean) = jsOpt("fill", v)

  def fillColor(v: String) = jsOpt("fillColor", v)

  def fillOpacity(v: Double) = jsOpt("fillOpacity", v)

  def dashArray(v: String) = jsOpt("dashArray", v)

  def lineCap(v: String) = jsOpt("lineCap", v)

  def lineJoin(v: String) = jsOpt("lineJoin", v)

  def clickable(v: Boolean) = jsOpt("clickable", v)

  def pointerEvents(v: String) = jsOpt("pointerEvents", v)

  def className(v: String) = jsOpt("className", v)
}
