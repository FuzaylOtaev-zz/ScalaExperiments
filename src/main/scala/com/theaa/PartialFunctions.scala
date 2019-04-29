package com.theaa

object PartialFunctions extends App {

  def divide(value: Int): Int = {
    val divide = new PartialFunction[Int, Int] {
      override def isDefinedAt(x: Int): Boolean = x != 0
      override def apply(x: Int): Int = value / x
    }

    if (divide.isDefinedAt(2)) divide.apply(2) else 0
  }


}
