package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.DivIcon")
class LDivIcon extends js.Object {
  def this(options: LDivIconOptions) = this()
}

object LDivIcon {
  def apply(options: LDivIconOptions) = new LDivIcon(options)
}

@js.native
trait LDivIconOptions extends js.Object

object LDivIconOptions extends LDivIconOptionsBuilder(OptMap.empty)

class LDivIconOptionsBuilder(val dict: OptMap)
    extends JSOptionBuilder[LDivIconOptions,LDivIconOptionsBuilder](new LDivIconOptionsBuilder(_)) {

  def iconAnchor(v: LPoint) = jsOpt("iconAnchor",v)

  def iconSize(v: LPoint) = jsOpt("iconSize",v)

  def popupAnchor(v: LPoint) = jsOpt("popupAnchor",v)

  def html(v: String) = jsOpt("html",v)

  def className(v: String) = jsOpt("className",v)

}
