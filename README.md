# A Leaflet Wrapper for ScalaJS

This project aims to expose the the mapping functionality of
(leaflet.js)[http://leafletjs.com/) to those writing frontend
applications in ScalaJS. Much of this code was ported from an example
facade written by (chandu0101)[https://github.com/chandu0101], to whom
much is owed.

If you're familiar with the [leaflet
API](http://leafletjs.com/reference.html), this wrapper follows the
pattern of converting, e.g., the `L.map` class into `LMap`. Here's a
simple example:
```scala
val mapOpts = LMapOptions
  .center(LLatLng(41.850033, -87.6500523))
  .zoom(ClientCircuit.zoom(_.displayM.leafletM.zoom).value.getOrElse(2))
  .layers(js.Array(baseLayers("toner_lite")))
  .result

LMap("#myMapContainer", mapOpts)
```

Though this wrapper is well on its way to completion, there remain edge
cases and holes in the API. Issues and PRs are welcome!
