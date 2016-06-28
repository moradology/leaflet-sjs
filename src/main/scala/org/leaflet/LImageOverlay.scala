package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.ImageOverlay")
class LImageOverlay extends js.Object {
  def this(imageUrl: String, bounds: LLatLngBounds, options: UndefOr[LImageOverlayOptions] = undefined) = this()

  def addTo(map: LMap): LImageOverlay = js.native

  def setOpacity(opacity: Double): LImageOverlay = js.native

  def setUrl(imageUrl: String): LImageOverlay = js.native

  def bringToFront(): LImageOverlay = js.native

  def bringToBack(): LImageOverlay = js.native

}

object LImageOverlay {
  def apply(imageUrl: String, bounds: LLatLngBounds, options: UndefOr[LImageOverlayOptions] = undefined) = new LImageOverlay(imageUrl, bounds, options)
}

@js.native
trait LImageOverlayOptions extends js.Object

object LImageOverlayOptions extends LImageOverlayOptionsBuilder(OptMap.empty)

class LImageOverlayOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LImageOverlayOptions, LImageOverlayOptionsBuilder](new LImageOverlayOptionsBuilder(_)) {

  def opacity(v: Double) = jsOpt("opacity", v)

  def attribution(v: String) = jsOpt("attribution", v)

}
