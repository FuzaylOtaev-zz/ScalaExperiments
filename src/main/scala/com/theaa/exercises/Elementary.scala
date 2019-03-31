package com.theaa.exercises

import java.util.Scanner

object Elementary extends App {

//  printName()
//  printCertainNames(Option("Fuzayl"))
//  println(getSum((1 to 10).toArray))
//    println(getSumUsingStepIncrement(Array.range(1, 10, 2)))
//  println(getProduct(5))
//  println(printMultiplicationTable(12))
//  printPrimeNumbers(100)

  def printName(): Unit = {
    val scanner = new Scanner(System.in)
    print("Enter your name: ")
    val name = scanner.next()
    println("your name is " + name)
  }

  def printCertainNames(name: Option[String]): Unit = name match {
    case Some(value) =>
      if ("Alice".equals(name.get) || "Bob".equals(name.get)) {
        println(name.get)
      }

    case None =>
  }

  def getSum(array: Array[Int]): Int = {
    array.fold(0) {
      (prev, next) => (prev + next) * 1
    }
  }

  def getSumUsingStepIncrement(array: Array[Int]): Int = {
    array.foldLeft(0) {
      (prev, next) => (prev + next) * 1
    }
  }

  def getProduct(value: Int): Int = value match {
    case 0 => 1
    case _ => value * (value - 1)
  }

  def printMultiplicationTable(value: Int): Unit = {
    for (i <- 1 to value) {
      for (j <- 1 to value) {
        print(j * i + " ")
      }
      println()
    }
  }

  def printPrimeNumbers(value: Int): Unit = {
    for (i <- 2 to 100 if (2 until i).forall(i % _ != 0)) {
      println(i)
    }
  }


}
