package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.FeatureGroup")
class LFeatureGroup extends LLayerGroup with LEventEmitter {

  def this(layers: UndefOr[LILayer] = undefined) = this()

  def bindPopup(htmlContent: String, options: UndefOr[LPopupOptions] = undefined): this.type = js.native

  def setStyle(style: LPathOptions): this.type = js.native

  def bringToFront(): this.type = js.native

  def bringToBack(): this.type = js.native

  def getBounds(): LLatLngBounds = js.native

}

object LFeatureGroup {

  def apply(layers: UndefOr[LILayer] = undefined) = new LFeatureGroup(layers)

}

