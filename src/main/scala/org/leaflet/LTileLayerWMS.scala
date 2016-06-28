package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.TileLayer.WMS")
class LTileLayerWMS extends LTileLayer {
  def this(baseurl: String, options: LTileLayerWMSOptions) = this()
}

@js.native
trait LTileLayerWMSOptions extends js.Object {

  val layers: UndefOr[String] = js.native
  val styles: UndefOr[String] = js.native
  val format: UndefOr[String] = js.native
  val transparent: UndefOr[Boolean] = js.native
  val version: UndefOr[String] = js.native
  val crs: UndefOr[LICRS] = js.native

}

object LTileLayerWMSOptions {

  def apply(crs: UndefOr[LICRS] = null,
            transparent: UndefOr[Boolean] = false,
            version: UndefOr[String] = "1.1.1",
            format: UndefOr[String] = "image/jpeg",
            layers: UndefOr[String] = "",
            styles: UndefOr[String] = "") =
    json("layers" -> layers, "styles" -> styles, "crs" -> crs, "format" -> format, "version" -> version, "transparent" -> transparent).asInstanceOf[LTileLayerWMSOptions]

}


