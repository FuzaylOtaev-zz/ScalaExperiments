package com.theaa

object PartiallyAppliedFunctions extends App {

  def sum(a: Int, b: Int, c: Int): Int = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val partialSum = sum(1, 2, _: Int)

    partialSum(3)
  }



}
