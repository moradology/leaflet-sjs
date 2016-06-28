package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.LayerGroup")
class LLayerGroup extends LILayer {

  def this(layers: UndefOr[LILayer] = undefined) = this()

  def addTo(map: LMap): this.type = js.native

  def addLayer(layer: LILayer): this.type = js.native

  def removeLayer(layer: LILayer): this.type = js.native

  def removeLayer(id: String): this.type = js.native

  def hasLayer(layer: LILayer): Boolean = js.native

  def getLayer(id: String): LILayer = js.native

  def getLayers(): js.Array[LILayer] = js.native

  def clearLayers(): this.type = js.native

  def eachLayer(fn: js.Function, context: UndefOr[js.Object] = undefined): this.type = js.native

  def toGeoJSON(): js.Dynamic = js.native

}

object LLayerGroup {
  def apply(layers: UndefOr[LILayer] = undefined) = new LLayerGroup(layers)
}
