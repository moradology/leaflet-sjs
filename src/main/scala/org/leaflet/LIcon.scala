package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Icon")
class LIcon extends js.Object {
  def this(options: LIconOptions) = this()
}

object LIcon {
  def apply(options: LIconOptions) = new LIcon(options)
}

@js.native
@JSName("L.Icon.Default")
object LIconDefault extends LIcon {
  var imagePath: String = js.native
}

@js.native
trait LIconOptions extends js.Object

object LIconOptions extends LIconOptionsBuilder(OptMap.empty)

class LIconOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[LIconOptions, LIconOptionsBuilder](new LIconOptionsBuilder(_)) {

  def iconRetinaUrl(v: String) = jsOpt("iconRetinaUrl", v)

  def iconUrl(v: String) = jsOpt("iconUrl", v)

  def shadowUrl(v: String) = jsOpt("shadowUrl", v)

  def iconAnchor(v: LPoint) = jsOpt("iconAnchor", v)

  def iconSize(v: LPoint) = jsOpt("iconSize", v)

  def shadowAnchor(v: LPoint) = jsOpt("shadowAnchor", v)

  def shadowSize(v: LPoint) = jsOpt("shadowSize", v)

  def shadowRetinaUrl(v: String) = jsOpt("shadowRetinaUrl", v)

  def popupAnchor(v: LPoint) = jsOpt("popupAnchor", v)

  def className(v: String) = jsOpt("className", v)

}

