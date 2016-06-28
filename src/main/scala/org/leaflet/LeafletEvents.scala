package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
trait LEvent extends js.Object {

  @JSName("type") // TODO  not working - check it
  val tpe: String = js.native
  @JSName("type") val eventType: String = js.native
  val target: js.Dynamic = js.native
}

@js.native
trait LMouseEvent extends LEvent {
  val latlng: LLatLng = js.native
  val layerPoint: LPoint = js.native
  val containerPoint: LPoint = js.native
  val originalEvent: MouseEvent = js.native
}

@js.native
trait LLocationEvent extends LEvent {
  val latlng: LLatLng = js.native
  val bounds: LLatLngBounds = js.native
  val accuracy: Double = js.native
  val altitude: Double = js.native
  val altitudeAccuracy: Double = js.native
  val heading: Double = js.native
  val speed: Double = js.native
  val timestamp: Double = js.native
}


@js.native
trait LErrorEvent extends LEvent {
  val message: String = js.native
  val code: Double = js.native
}

@js.native
trait LLayerEvent extends LEvent {
  val layer: LILayer = js.native

}

@js.native
trait LLayersControlEvent extends LEvent {

  val layer: LLayersControlEvent = js.native
  val name: String = js.native
}

@js.native
trait LTileEvent extends LEvent {
  val tile: HTMLElement = js.native
  val url: String = js.native
}

@js.native
trait LResizeEvent extends LEvent {
  val oldSize: LPoint = js.native
  val newSize: LPoint = js.native
}

@js.native
trait LGeoJSONEvent extends LEvent {
  val layer: LILayer = js.native
  val properties: js.Dynamic = js.native
  val geometryType: String = js.native
  val id: String = js.native

}

@js.native
trait LPopupEvent extends LEvent {
  val popup: LPopup = js.native
}

@js.native
trait LDragEndEvent extends LEvent {
  val distance: Double = js.native
}

@js.native
trait LEventEmitter extends js.Object {
  //TODO check this variance later!
  def on[LEventType <: LEvent](name: String, listener: js.Function1[LEventType, Any], context: UndefOr[js.Object] = undefined): this.type = js.native

  def off[LEventType <: LEvent](name: String, listener: js.Function1[LEventType, Any], context: UndefOr[js.Object] = undefined): this.type = js.native

  def once[LEventType <: LEvent](name: String, listener: js.Function1[LEventType, Any], context: UndefOr[js.Object] = undefined): this.type = js.native

  def fire(name: String, data: UndefOr[js.Object] = undefined): this.type = js.native

  def removeEventListener(): this.type = js.native

  def clearAllEventListeners(): this.type = js.native

  def hasEventListeners(tpe: String): Boolean = js.native

}


object LEventEmitter {

  implicit class LEventEmitterEvents(val self: LEventEmitter) extends AnyVal {

    def onClick(listener: js.Function1[LMouseEvent, Any]): self.type = self.on("click", listener)

    def onDblclick(listener: js.Function1[LMouseEvent, Any]): self.type = self.on("dblclick", listener)

    def onMouseDown(listener: js.Function1[LMouseEvent, Any]): self.type = self.on("mousedown", listener)

    def onMouseUp(listener: js.Function1[LMouseEvent, Any]): self.type = self.on("mouseup", listener)

    def onMouseOver(listener: js.Function1[LMouseEvent, Any]): self.type = self.on("mouseover", listener)

    def onMouseOut(listener: js.Function1[LMouseEvent, Any]): self.type = self.on("mouseout", listener)

    def onMouseMove(listener: js.Function1[LMouseEvent, Any]): self.type = self.on("mousemove", listener)

    def onContextmenu(listener: js.Function1[LMouseEvent, Any]): self.type = self.on("contextmenu", listener)

    def onFocus(listener: js.Function1[LEvent, Any]): self.type = self.on("focus", listener)

    def onBlur(listener: js.Function1[LEvent, Any]): self.type = self.on("blur", listener)

    def onPreclick(listener: js.Function1[LMouseEvent, Any]): self.type = self.on("preclick", listener)

    def onLoad(listener: js.Function1[LEvent, Any]): self.type = self.on("load", listener)

    def onUnload(listener: js.Function1[LEvent, Any]): self.type = self.on("unload", listener)

    def onViewreset(listener: js.Function1[LEvent, Any]): self.type = self.on("viewreset", listener)

    def onMovestart(listener: js.Function1[LEvent, Any]): self.type = self.on("movestart", listener)

    def onMove(listener: js.Function1[LEvent, Any]): self.type = self.on("move", listener)

    def onMoveend(listener: js.Function1[LEvent, Any]): self.type = self.on("moveend", listener)

    def onDragstart(listener: js.Function1[LEvent, Any]): self.type = self.on("dragstart", listener)

    def onDrag(listener: js.Function1[LEvent, Any]): self.type = self.on("drag", listener)

    def onDragend(listener: js.Function1[LDragEndEvent, Any]): self.type = self.on("dragend", listener)

    def onZoomend(listener: js.Function1[LDragEndEvent, Any]): self.type = self.on("zoomend", listener)

    def onZoomlevelschange(listener: js.Function1[LEvent, Any]): self.type = self.on("zoomlevelschange", listener)

    def onResize(listener: js.Function1[LResizeEvent, Any]): self.type = self.on("resize", listener)

    def onAutopanstart(listener: js.Function1[LEvent, Any]): self.type = self.on("autopanstart", listener)

    def onLayeradd(listener: js.Function1[LLayerEvent, Any]): self.type = self.on("layeradd", listener)

    def onLayerremove(listener: js.Function1[LLayerEvent, Any]): self.type = self.on("layerremove", listener)

    def onBaselayerchange(listener: js.Function1[LLayerEvent, Any]): self.type = self.on("baselayerchange", listener)

    def onOverlayadd(listener: js.Function1[LLayerEvent, Any]): self.type = self.on("overlayadd", listener)

    def onOverlayremove(listener: js.Function1[LLayerEvent, Any]): self.type = self.on("overlayremove", listener)

    def onLocationfound(listener: js.Function1[LLocationEvent, Any]): self.type = self.on("locationfound", listener)

    def onLocationerror(listener: js.Function1[LErrorEvent, Any]): self.type = self.on("locationerror", listener)

    def onPopupopen(listener: js.Function1[LPopupEvent, Any]): self.type = self.on("popupopen", listener)

    def onPopupclose(listener: js.Function1[LPopupEvent, Any]): self.type = self.on("popupclose", listener)

    def onAdd(listener: js.Function1[LEvent, Any]): self.type = self.on("add", listener)

    def onRemove(listener: js.Function1[LEvent, Any]): self.type = self.on("remove", listener)

    def onLoading(listener: js.Function1[LEvent, Any]): self.type = self.on("loading", listener)

    def onTileloadstart(listener: js.Function1[LTileEvent, Any]): self.type = self.on("tileloadstart", listener)

    def onTileload(listener: js.Function1[LTileEvent, Any]): self.type = self.on("tileload", listener)

    def onTileunload(listener: js.Function1[LTileEvent, Any]): self.type = self.on("tileunload", listener)

  }
}
