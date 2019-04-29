package com.theaa

object NestedMethods extends App {

//  println(filter(List(1, 9, 2, 8, 3, 7, 4), 5))

  def factorial(x: Int): Int = {
    def fact(x: Int, accumalator: Int): Int = {
      if (x <= 1) accumalator
      else fact(x - 1, x * accumalator)
    }

    fact(x, 1)
  }

  def max(a: Int, b: Int, c: Int): Int = {
    def max(x: Int, y: Int) = {
      if (x > y) x else y
    }

    max(a, max(b, c))
  }

  def filter(xs: List[Int], threshold: Int) = {
    def process(ys: List[Int]): List[Int] = {
      if (ys.isEmpty) ys
      else if (ys.head < threshold) ys.head :: process(ys.tail)
      else process(ys.tail)
    }
    process(xs)
  }

}
