package com.theaa

object Options extends App {
//  val presentValue: Option[String] = Some("I am wrapped ")
//  val absentValue: Option[String] = None
//
//  println(presentValue)
//  println(absentValue.getOrElse("empty"))

//  def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
//    if (flag) Some("Found value") else None
//  }
//
//  val value1 = maybeItWillReturnSomething(true)
//  val value2 = maybeItWillReturnSomething(false)

//  println(value1.getOrElse("No value"))
//  println(value2.getOrElse("No value"))

//  println(value1.isEmpty)
//  println(value2.isEmpty)

//  val someValue: Option[Double] = Some(20.0)
//  val value = someValue match {
//    case Some(v) => v
//    case None => 0.0
//  }
//  println(value)

  val number: Option[Int] = Some(3)
  val noNumber: Option[Int] = None
  val result1 = number.map(_ * 1.5)
  val result2 = noNumber.map(_ * 1.5)

  println(result1)
  println(result2)
}
