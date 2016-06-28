package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.GeoJSON")
class LGeoJson extends LFeatureGroup {

  def this(geojson: UndefOr[js.Dynamic] = undefined, options: UndefOr[LGeoJsonOptions] = undefined) = this()

  def addData(data: js.Dynamic): LGeoJson = js.native

  def setStyle(data: js.Function1[js.Dynamic, Any]): LGeoJson = js.native

  def resetStyle(layer: LPath): LGeoJson = js.native

}

object LGeoJson {

  def apply(geojson: UndefOr[js.Dynamic] = undefined, options: UndefOr[LGeoJsonOptions] = undefined) = new LGeoJson(geojson, options)

}

@js.native
@JSName("L.GeoJSON")
object LGeoJsonStatic extends js.Object {

  def geometryToLayer(featureData: js.Dynamic, pointToLayer: UndefOr[js.Function] = undefined): LILayer = js.native

  def coordsToLatLng(coords: js.Array[js.Dynamic], reverse: UndefOr[Boolean] = undefined): LLatLng = js.native

  def coordsToLatLngs(coords: js.Array[js.Dynamic], levelsDeep: UndefOr[js.Dynamic] = undefined, reverse: UndefOr[Boolean] = undefined): js.Array[js.Dynamic] = js.native

}

@js.native
trait LGeoJsonOptions extends LPathOptions

object LGeoJsonOptions extends LGeoJsonOptionsBuilder(OptMap.empty) {}

class LGeoJsonOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LGeoJsonOptions, LGeoJsonOptionsBuilder](new LGeoJsonOptionsBuilder(_)) {

  def fill(v: Boolean) = jsOpt("fill", v)

  def lineCap(v: String) = jsOpt("lineCap", v)

  def opacity(v: Double) = jsOpt("opacity", v)

  def style(v: js.Function1[js.Dynamic, Any]) = jsOpt("style", v)

  def color(v: String) = jsOpt("color", v)

  def fillColor(v: String) = jsOpt("fillColor", v)

  def pointerEvents(v: String) = jsOpt("pointerEvents", v)

  def lineJoin(v: String) = jsOpt("lineJoin", v)

  def clickable(v: Boolean) = jsOpt("clickable", v)

  def stroke(v: Boolean) = jsOpt("stroke", v)

  def pointToLayer(v: js.Function2[js.Dynamic, LLatLng, Any]) = jsOpt("pointToLayer", v)

  def dashArray(v: String) = jsOpt("dashArray", v)

  def onEachFeature(v: js.Function2[js.Dynamic, LFeatureGroup, Any]) = jsOpt("onEachFeature", v)

  def className(v: String) = jsOpt("className", v)

  def weight(v: Double) = jsOpt("weight", v)

  def filter(v: js.Function2[js.Dynamic, LFeatureGroup, Any]) = jsOpt("filter", v)

  def fillOpacity(v: Double) = jsOpt("fillOpacity", v)

  def coordsToLatLng(v: js.Function1[js.Array[js.Dynamic], Any]) = jsOpt("coordsToLatLng", v)

}

