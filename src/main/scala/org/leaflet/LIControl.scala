package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
trait LIControl extends js.Object {

//  def onAdd(map: LMap): HTMLElement = js.native

  var onAdd :js.Function1[LMap,HTMLElement] = js.native

  var onRemove : js.Function1[LMap,Any] = js.native

  var update : js.Function1[UndefOr[js.Dynamic],Any] = js.native
//  def onRemove(map: LMap): Unit = js.native

}
