package org.leaflet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


@js.native
@JSName("L.Transformation")
class LTransformation(a: Double, b: Double, c: Double, d: Double) extends js.Object {
  def transform(point: LPoint, scale: UndefOr[Double] = undefined): LPoint = js.native

  def untransform(point: LPoint, scale: UndefOr[Double] = undefined): LPoint = js.native
}

object LTransformation {
  def apply(a: Double, b: Double, c: Double, d: Double): LTransformation = new LTransformation(a, b, c, d)
}

