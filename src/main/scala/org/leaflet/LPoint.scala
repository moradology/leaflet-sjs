package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Point")
class LPoint(val x: Double, val y: Double, val roundB: UndefOr[Boolean]) extends js.Object {
  def this(x: Double, y: Double) = this(x, y, undefined)

  def add(other: LPoint): LPoint = js.native

  def subtract(other: LPoint): LPoint = js.native

  def multiplyBy(number: Double): LPoint = js.native

  def divideBy(other: LPoint): LPoint = js.native

  def equals(other: LPoint): LPoint = js.native

  def contains(other: LPoint): Boolean = js.native

  def distanceTo(other: LPoint): Double = js.native

  def round(): LPoint = js.native

  def floor(): LPoint = js.native
}

object LPoint {
  def apply(x: Double, y: Double, round: UndefOr[Boolean] = undefined) = new LPoint(x, y, round)
}

