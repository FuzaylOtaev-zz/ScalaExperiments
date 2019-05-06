package com.theaa.for_comprehensions

object ForComprehensionsFunctions extends App {


//  foo(10, 10) foreach {
//    case (i, j) => println(s"($i, $j) ")
//  }

//  println(capitalise(List("bukhara", "tashkent", "samarkand")))


  def foo(n: Int, v: Int) = {
    for (i <- 0 until n; j <- 0 until n if i + j == v) yield (i, j)
  }

  def capitalise(list: List[String]): List[String] = {
    for (value <- list) yield value.capitalize
  }
}
