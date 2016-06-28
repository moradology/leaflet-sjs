package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Control")
class LControl extends LIControl {

  def this(options: UndefOr[LControlOptions] = undefined) = this()

  def setPosition(position: String): LControl = js.native

  def getPosition(): String = js.native

  def addTo(map: LMap): LControl = js.native

  def removeFrom(map: LMap): LControl = js.native

  def getContainer(): HTMLElement = js.native

  def zoom(options: UndefOr[LControlZoomOptions] = js.native): LControlZoom = js.native

  def attribution(options: UndefOr[LControlAttributionOptions] = undefined): LControlAttribution = js.native

  def layers(baseLayers: UndefOr[js.Dynamic] = undefined, overlays: UndefOr[js.Dynamic] = undefined, options: UndefOr[LControlLayersOptions] = undefined): LControlLayers = js.native

}

object LControl {
  def apply(options: UndefOr[LControlOptions] = undefined) = new LControl(options)
}

@js.native
trait LControlOptions extends js.Object

object LControlOptions extends LControlOptionsBuilder(OptMap.empty)

class LControlOptionsBuilder(val dict :OptMap)
    extends JSOptionBuilder[LControlOptions, LControlOptionsBuilder](new LControlOptionsBuilder(_)) {
  def position(v: String) = jsOpt("position",v)
}

@js.native
trait LControlZoomOptions extends js.Object

object LControlZoomOptions extends LControlZoomOptionsBuilder(OptMap.empty)

class LControlZoomOptionsBuilder(val dict :OptMap)
    extends JSOptionBuilder[LControlZoomOptions, LControlZoomOptionsBuilder](new LControlZoomOptionsBuilder(_)) {

  def zoomOutText(v: String) = jsOpt("zoomOutText",v)

  def zoomInTitle(v: String) = jsOpt("zoomInTitle",v)

  def position(v: String) = jsOpt("position",v)

  def zoomOutTitle(v: String) = jsOpt("zoomOutTitle",v)

  def zoomInText(v: String) = jsOpt("zoomInText",v)

}

@js.native
@JSName("L.Control.Zoom")
class LControlZoom extends LControl

@js.native
trait LControlAttributionOptions extends js.Object

object LControlAttributionOptions extends LControlAttributionOptionsBuilder(OptMap.empty)

class LControlAttributionOptionsBuilder(val dict :OptMap)
    extends JSOptionBuilder[LControlAttributionOptions,LControlAttributionOptionsBuilder](new LControlAttributionOptionsBuilder(_)) {

  def prefix(v: String) = jsOpt("prefix",v)

  def position(v: String) = jsOpt("position",v)

}

@js.native
@JSName("L.Control.Attribution")
class LControlAttribution extends LControl {

  def setPrefix(prefix: String): LControlAttribution = js.native

  def addAttribution(text: String): LControlAttribution = js.native

  def removeAttribution(text: String): LControlAttribution = js.native

}

@js.native
trait LControlLayersOptions extends js.Object

object LControlLayersOptions extends LControlLayersOptionsBuilder(OptMap.empty)

class LControlLayersOptionsBuilder(val dict :OptMap)
    extends JSOptionBuilder[LControlLayersOptions,LControlLayersOptionsBuilder](new LControlLayersOptionsBuilder(_)) {

  def autoZIndex(v: Boolean) = jsOpt("autoZIndex",v)

  def position(v: String) = jsOpt("position",v)

  def collapsed(v: Boolean) = jsOpt("collapsed",v)

}

@js.native
@JSName("L.Control.Layers")
class LControlLayers extends LControl with LEventEmitter {

  def addBaseLayer(layer: LILayer, name: String): LControlLayers = js.native

  def addOverlay(layer: LILayer, name: String): LControlLayers = js.native

  def removeLayer(layer: LILayer): LControlLayers = js.native
}

@js.native
trait LControlScaleOptions extends js.Object

object LControlScaleOptions extends LControlScaleOptionsBuilder(OptMap.empty)

class LControlScaleOptionsBuilder(val dict :OptMap)
    extends JSOptionBuilder[LControlScaleOptions,LControlScaleOptionsBuilder](new LControlScaleOptionsBuilder(_)) {

  def metric(v: Boolean) = jsOpt("metric",v)

  def maxWidth(v: Double) = jsOpt("maxWidth",v)

  def updateWhenIdle(v: Boolean) = jsOpt("updateWhenIdle",v)

  def position(v: String) = jsOpt("position",v)

  def imperial(v: Boolean) = jsOpt("imperial",v)

}

@js.native
class LControlScale extends LControl {}

