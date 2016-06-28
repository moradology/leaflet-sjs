package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.TileLayer")
class LTileLayer extends LILayer {

  def this(urlTemplate: String, options: UndefOr[LTileLayerOptions] = undefined) = this()

  def addTo(map: LMap): LTileLayer = js.native

  def bringToFront(): LTileLayer = js.native

  def bringToBack(): LTileLayer = js.native

  def setOpacity(opacity: Double): LTileLayer = js.native

  def setZIndex(zIndex: Double): LTileLayer = js.native

  def redraw(): LTileLayer = js.native

  def setUrl(urlTemplate: String): LTileLayer = js.native

  def getContainer(): HTMLElement = js.native

  def wms(baseurl: String, options: LTileLayerWMSOptions): LTileLayerWMS = js.native
}

object LTileLayer {
  def apply(urlTemplate: String, options: UndefOr[LTileLayerOptions] = undefined) = new LTileLayer(urlTemplate, options)
}

@js.native
trait LTileLayerOptions extends js.Object

object LTileLayerOptions extends LTileLayerOptionsBuilder(OptMap.empty)

class LTileLayerOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LTileLayerOptions, LTileLayerOptionsBuilder](new LTileLayerOptionsBuilder(_)) {

  def unloadInvisibleTiles(v: Boolean) = jsOpt("unloadInvisibleTiles", v)

  def mapId(v: String) = jsOpt("mapId", v)

  def opacity(v: Double) = jsOpt("opacity", v)

  def maxNativeZoom(v: Double) = jsOpt("maxNativeZoom", v)

  def minZoom(v: Double) = jsOpt("minZoom", v)

  def zoomOffset(v: Double) = jsOpt("zoomOffset", v)

  def updateWhenIdle(v: Boolean) = jsOpt("updateWhenIdle", v)

  def noWrap(v: Boolean) = jsOpt("noWrap", v)

  def errorTileUrl(v: String) = jsOpt("errorTileUrl", v)

  def maxZoom(v: Double) = jsOpt("maxZoom", v)

  def continuousWorld(v: Boolean) = jsOpt("continuousWorld", v)

  def subdomains(v: String) = jsOpt("subdomains", v)

  def attribution(v: String) = jsOpt("attribution", v)

  def tileSize(v: Double) = jsOpt("tileSize", v)

  def zoomReverse(v: Boolean) = jsOpt("zoomReverse", v)

  def detectRetina(v: Boolean) = jsOpt("detectRetina", v)

  def token(v: String) = jsOpt("token", v)

  def tms(v: Boolean) = jsOpt("tms", v)

  def bounds(v: LLatLngBounds) = jsOpt("bounds", v)

  def reuseTiles(v: Boolean) = jsOpt("reuseTiles", v)

  def zIndex(v: Double) = jsOpt("zIndex", v)
}

