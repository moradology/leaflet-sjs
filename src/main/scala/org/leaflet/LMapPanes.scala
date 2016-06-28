package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
trait LMapPanes extends js.Object {

  def mapPane: HTMLElement = js.native

  def tilePane: HTMLElement = js.native

  def objectsPane: HTMLElement = js.native

  def shadowPane: HTMLElement = js.native

  def overlayPane: HTMLElement = js.native

  def markerPane: HTMLElement = js.native

  def popupPane: HTMLElement = js.native

}
