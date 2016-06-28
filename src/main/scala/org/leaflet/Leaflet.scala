package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L")
object LeafLet extends js.Object {

  def map(id: String, options: UndefOr[LMapOptions] = undefined): LMap = js.native

  @JSName("map")
  def mapWithElement(id: HTMLElement, options: UndefOr[LMapOptions] = undefined): LMap = js.native

  def latlng(lat: Double, lng: Double, alt: UndefOr[Double] = undefined): LLatLng = js.native

  def latLngBounds(southWest: LLatLng, northEast: LLatLng): LLatLngBounds = js.native

  def latLngBounds(latlngs: js.Array[LLatLng]): LLatLngBounds = js.native

  def point(x: Double, y: Double, round: UndefOr[Boolean] = undefined): LPoint = js.native

  def CRS: LICRS = js.native

  def bounds(topLeft: LPoint, bottomRight: LPoint): LBounds = js.native

  def bounds(points: js.Array[LPoint]): LBounds = js.native

  def popup(options: UndefOr[LPopupOptions] = undefined, source: UndefOr[LILayer] = undefined): LPopup = js.native

  def icon(options: LIconOptions): LIcon = js.native

  def marker(latlng: LLatLng, options: UndefOr[LMarkerOptions] = undefined): LMarker = js.native

  def tileLayer(urlTemplate: String, options: UndefOr[LTileLayerOptions] = undefined): LTileLayer = js.native

  def imageOverlay(imageUrl: String, bounds: LLatLngBounds, options: UndefOr[LImageOverlayOptions] = undefined): LImageOverlay = js.native

  def polyline(latlngs: js.Array[LLatLng], options: UndefOr[LPolylineOptions] = undefined): LPolyline = js.native

  def layerGroup(layers: UndefOr[LILayer] = undefined): LLayerGroup = js.native

  def featureGroup(layers: UndefOr[LILayer] = undefined): LFeatureGroup = js.native

  def geoJson(geojson: UndefOr[js.Dynamic] = undefined, options: UndefOr[LGeoJsonOptions] = undefined): LGeoJson = js.native

  def polygon(latlngs: js.Array[LLatLng], options: UndefOr[LPolylineOptions] = undefined): LPolygon = js.native

  def rectangle(bounds: LLatLngBounds, options: UndefOr[LPathOptions] = undefined): LRectangle = js.native

  def circle(latlng: LLatLng, radius: Double, options: UndefOr[LPathOptions] = undefined): LCircle = js.native

  def circleMarker(latlng: LLatLng, options: UndefOr[LPathOptions] = undefined): LCircleMarker = js.native

  def divIcon(options: LDivIconOptions): LDivIcon = js.native

  def control(options: UndefOr[LControlOptions] = undefined): LControl = js.native

  val version: String = js.native
}
