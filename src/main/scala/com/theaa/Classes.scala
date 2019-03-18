package com.theaa

object Classes extends App {

  val point = new Point(2, 3)
  point.move(1, 1)
//  println(point.toString)

  ////////////////////////////

  val customPoint = new CustomPoint(10)
  customPoint.move(0, 10)
//  println(customPoint)

  val myPointer = new MyPointer()
  myPointer.x = 99
  myPointer.y = 101

}

class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = {
    s"($x, $y)"
  }
}

class CustomPoint(var x: Int, var y: Int = 0) {
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = {
    s"($x, $y)"
  }
}

class MyPointer {
  private var _x = 0
  private var _y = 0
  private var bound = 100

  def x = _x
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning
  }

  def y = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning
  }

  private def printWarning = println("WARNING: Out of bounds")


}
