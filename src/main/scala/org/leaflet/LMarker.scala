package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Marker")
class LMarker extends LILayer {
  def this(latlng: LLatLng, options: UndefOr[LMarkerOptions] = undefined) = this()

  val dragging: LIHandler = js.native

  def addTo(map: LMap): LMarker = js.native

  def getLatLng(): LLatLng = js.native

  def setLatLng(latlng: LLatLng): LMarker = js.native

  def setIcon(icon: LIcon): LMarker = js.native

  def setZIndexOffset(offset: Double): LMarker = js.native

  def setOpacity(opacity: Double): LMarker = js.native

  def update(): LMarker = js.native

  def bindPopup(html: String, options: UndefOr[LPopupOptions] = undefined): LMarker = js.native

  @JSName("bindPopup")
  def bindPopupWithElement(el: HTMLElement, popup: LPopup, options: UndefOr[LPopupOptions] = undefined): LMarker = js.native

  @JSName("bindPopup")
  def bindPopupWithPopup(popup: LPopup, options: UndefOr[LPopupOptions] = undefined): LMarker = js.native

  def unbindPopup(): LMarker = js.native

  def openPopup(): LMarker = js.native

  def getPopup(): LMarker = js.native

  def closePopup(): LMarker = js.native

  def togglePopup(): LMarker = js.native

  def setPopupContent(html: String): LMarker = js.native

  def setPopupContent(el: HTMLElement): LMarker = js.native

  def toGeoJSON(): js.Dynamic = js.native
}

object LMarker {
  def apply(latlng: LLatLng, options: UndefOr[LMarkerOptions] = undefined) = new LMarker(latlng, options)
}

@js.native
trait LMarkerOptions extends js.Object

object LMarkerOptions extends LMarkerOptionsBuilder(OptMap.empty)

class LMarkerOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LMarkerOptions, LMarkerOptionsBuilder](new LMarkerOptionsBuilder(_)) {

  def opacity(v: Double) = jsOpt("opacity", v)

  def riseOnHover(v: Boolean) = jsOpt("riseOnHover", v)

  def draggable(v: Boolean) = jsOpt("draggable", v)

  def title(v: String) = jsOpt("title", v)

  def clickable(v: Boolean) = jsOpt("clickable", v)

  def icon(v: LIcon) = jsOpt("icon", v)

  def zIndexOffset(v: Double) = jsOpt("zIndexOffset", v)

  def riseOffset(v: Double) = jsOpt("riseOffset", v)

  def keyboard(v: Boolean) = jsOpt("keyboard", v)

  def alt(v: String) = jsOpt("alt", v)

}

