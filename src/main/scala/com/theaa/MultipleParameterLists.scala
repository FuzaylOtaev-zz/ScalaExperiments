package com.theaa

object MultipleParameterLists extends App {

//  println(sum(List(1, 2, 3, 4, 5)))
  showPartial()

  def sum(list: List[Int]): Int = {
    list.foldLeft(0)(_ + _)
  }

  def showPartial(): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numberFunc = numbers.foldLeft(List[Int]()) _

    val squares = numberFunc((xs, x) => xs :+ x*x)
    println(squares)

    val cubes = numberFunc((xs, x) => xs :+ x*x*x)
    println(cubes)
  }





}
