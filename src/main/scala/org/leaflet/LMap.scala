package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Map")
class LMap(id: String, options: UndefOr[LMapOptions]) extends LEventEmitter {

  def setView(center: LLatLng, zoom: UndefOr[Double] = undefined, options: UndefOr[LZoomPanOptions] = undefined): LMap = js.native

  def setZoom(zoom: Double, options: UndefOr[LZoomPanOptions] = undefined): LMap = js.native

  def zoomIn(delta: UndefOr[Double] = undefined, options: UndefOr[LZoomOptions] = undefined): LMap = js.native

  def zoomOut(delta: UndefOr[Double] = undefined, options: UndefOr[LZoomOptions] = undefined): LMap = js.native

  def setZoomAround(latlng: LLatLng, zoom: Double, options: UndefOr[LZoomOptions] = undefined): LMap = js.native

  def fitBounds(bounds: LLatLngBounds, options: UndefOr[LFitBoundsOptions] = undefined): LMap = js.native

  def fitWorld(options: UndefOr[LFitBoundsOptions] = undefined): LMap = js.native

  def panTo(latlng: LLatLng, options: UndefOr[LPanOptions] = undefined): LMap = js.native

  def panInsideBounds(bounds: LLatLngBounds, options: UndefOr[LPanOptions] = undefined): LMap = js.native

  def panBy(point: LPoint, options: UndefOr[LPanOptions] = undefined): LMap = js.native

  def invalidateSize(animate: Boolean): LMap = js.native

  def invalidateSize(options: LZoomPanOptions): LMap = js.native

  def setMaxBounds(bounds: LLatLngBounds): LMap = js.native

  def locate(options: UndefOr[LocateOptions] = undefined): LMap = js.native

  def stopLocate(): LMap = js.native

  def remove(): LMap = js.native

  //Methods for Getting Map State

  def getCenter(): LLatLng = js.native

  def getZoom(): Double = js.native

  def getMinZoom(): Double = js.native

  def getMaxZoom(): Double = js.native

  def getBounds(): Double = js.native

  def getBoundsZoom(bounds: LLatLngBounds, inside: UndefOr[Boolean] = undefined): Double = js.native

  def getSize(): LPoint = js.native

  def getPixelBounds(): LBounds = js.native

  def getPixelOrigin(): LPoint = js.native

  //Methods for Layers and Controls
  def addLayer(layer: LILayer): LMap = js.native

  def removeLayer(layer: LILayer): LMap = js.native

  def hasLayer(layer: LILayer): Boolean = js.native

  def eachLayer(fn: js.Function, context: UndefOr[js.Object] = undefined): LMap = js.native

  def openPopup(popup: LPopup): LMap = js.native

  def openPopup(html: String, latlng: LLatLng, options: UndefOr[LPopupOptions] = undefined): LMap = js.native

  @JSName("openPopup")
  def openPopupWithElement(el: HTMLElement, latlng: LLatLng, options: UndefOr[LPopupOptions] = undefined): LMap = js.native

  def closePopup(popup: UndefOr[LPopup] = undefined): LMap = js.native

  def addControl(control: LIControl): LMap = js.native

  def removeControl(control: LIControl): LMap = js.native

  //Conversion Methods
  def latLngToLayerPoint(latlng: LLatLng): LPoint = js.native

  def layerPointToLatLng(point: LPoint): LLatLng = js.native

  def containerPointToLayerPoint(point: LPoint): LPoint = js.native

  def layerPointToContainerPoint(point: LPoint): LPoint = js.native

  def latLngToContainerPoint(latlng: LLatLng): LPoint = js.native

  def containerPointToLatLng(point: LPoint): LLatLng = js.native

  def project(latlng: LLatLng, zoom: UndefOr[Double] = undefined): LPoint = js.native

  def unproject(point: LPoint, zoom: UndefOr[Double] = undefined): LLatLng = js.native

  def mouseEventToContainerPoint(event: LMouseEvent): LPoint = js.native

  def mouseEventToLayerPoint(event: LMouseEvent): LPoint = js.native

  def mouseEventToLatLng(event: LMouseEvent): LPoint = js.native

  // other methods
  def getContainer(): HTMLElement = js.native

  def getPanes(): LMapPanes = js.native

  def whenReady(fn: js.Function, context: UndefOr[js.Object]): LMap = js.native

}

object LMap {
  def apply(id: String, options: UndefOr[LMapOptions] = undefined) = new LMap(id, options)
}

