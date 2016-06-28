package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
trait LILayer extends LEventEmitter {
  def onAdd(map: LMap): Unit = js.native

  def onRemove(map: LMap): Unit = js.native
}
