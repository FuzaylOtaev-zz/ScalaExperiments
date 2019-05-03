package com.theaa.singelton_objects

/**
  * Created by: fuzayl
  * Date: 30 Apr, 2019
  * Company: Finnet Limited 
  */
object SingeltonMainObject2 extends App {
  val circle = new Circle(4.0)
  println(circle.getArea)
}

case class Circle(radius: Double) {
  import Circle.calculateArea

  def getArea: Double = calculateArea(radius)
}

object Circle {
  private def calculateArea(radius: Double): Double = Math.PI * Math.pow(radius, 2.0)
}
