package com.theaa.exercises

import java.util.Scanner

object Elementary extends App {

//  printName()

  def printName(): Unit = {
    val scanner = new Scanner(System.in)
    print("Enter your name: ")
    val name = scanner.next()
    println("your name is " + name)
  }


}
