package com.theaa

object Mixins extends App {
//  val d = new D
//  println(d.message)
//  println(d.loudMessage)
}

//abstract class A {
//  val message: String
//}
//
//class B extends A {
//  val message: String = "I'm an instance of class B"
//}
//
//trait C extends A {
//  def loudMessage = message.toUpperCase()
//}
//
//class D extends B with C

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next(): T
}

class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0

  def hasNext = i < s.length
  def next() = {
    val ch = s charAt i
    i += 1
    ch
  }
}
