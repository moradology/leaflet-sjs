package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Popup")
class LPopup extends js.Object {
  def this(options: UndefOr[LPopupOptions] = undefined, source: UndefOr[LILayer] = undefined) = this()

  def addTo(map: LMap): LPopup = js.native

  def openOn(map: LMap): LPopup = js.native

  def setLatLng(latlng: LLatLng): LPopup = js.native

  def getLatLng(): LLatLng = js.native

  def setContent(htmlContent: String): LPopup = js.native

  def setContent(htmlContent: HTMLElement): LPopup = js.native

  def getContent(): String = js.native

  @JSName("getContent")
  def getContentElement(): HTMLElement = js.native

  def update(): LPopup = js.native

}

object LPopup {
  def apply(options: UndefOr[LPopupOptions] = undefined, source: UndefOr[LILayer] = undefined) = new LPopup(options, source)
}

@js.native
trait LPopupOptions extends js.Object

object LPopupOptions extends LPopupOptionsBuilder(OptMap.empty)

class LPopupOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LPopupOptions, LPopupOptionsBuilder](new LPopupOptionsBuilder(_)) {

  def offset(v: LPoint) = jsOpt("offset", v)

  def keepInView(v: Boolean) = jsOpt("keepInView", v)

  def minWidth(v: Double) = jsOpt("minWidth", v)

  def autoPan(v: Boolean) = jsOpt("autoPan", v)

  def maxWidth(v: Double) = jsOpt("maxWidth", v)

  def autoPanPaddingTopLeft(v: LPoint) = jsOpt("autoPanPaddingTopLeft", v)

  def closeOnClick(v: Boolean) = jsOpt("closeOnClick", v)

  def zoomAnimation(v: Boolean) = jsOpt("zoomAnimation", v)

  def closeButton(v: Boolean) = jsOpt("closeButton", v)

  def autoPanPaddingBottomRight(v: LPoint) = jsOpt("autoPanPaddingBottomRight", v)

  def autoPanPadding(v: LPoint) = jsOpt("autoPanPadding", v)

  def maxHeight(v: Double) = jsOpt("maxHeight", v)

  def className(v: String) = jsOpt("className", v)
}

