package org

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, undefined}


package object leaflet {

  /** A map of option values, which JSOptionBuilder builds up. */
  type OptMap = Map[String, Any]

  object OptMap {
    def empty = Map.empty[String, Any]
  }

  /**
    * //https://github.com/jducoeur/Querki/blob/a13a69c995dd7e4f0f4dc4df370e5ab66e540daf/querki/scalajs/src/main/scala/org/querki/jsext/JSOptionBuilder.scala
    * @param copy
    * @tparam T
    * @tparam B
    */
  abstract class JSOptionBuilder[T <: js.Object, B <: JSOptionBuilder[T, _]](copy:OptMap => B) {
    /**
      * This is a dictionary of option values. It is usually *very* heterogeneous,
      * mixing everything from Ints to Functions. So it needs to be js.Any.
      */
    def dict:OptMap

    def jsOpt(name:String, opt:Any):B = {
      copy(dict + (name -> opt))
    }

    def result = {
      dict.toJSDictionary.asInstanceOf[T]
    }

    override def toString = {
      s"""{\n${dict.keys.map{ key => s"  $key = ${dict(key).toString}"}.mkString("\n")}\n}"""
    }
  }
}
