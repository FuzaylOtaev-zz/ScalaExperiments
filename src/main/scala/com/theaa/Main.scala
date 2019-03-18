package com.theaa

object Main extends App {
//  println("Hello world")
//  val ages = Seq(42, 75, 29, 64)
//  println(s"The oldest person is ${ages.max}")

//  var value = 10
//  value = 15
//  println({
//    value += 10
//    value
//  })

//  val addOne = (x: Int) => x + 1
//  println(addOne.apply(9))
//  println(addOne(9))

//  val getResult = () => 100
//  println(getResult())
//  println(getResult.apply())

//  def add(x: Int, y: Int): Int = x + y
//  println(add(1, 2))

//  def name: String = System.getProperty("user.name")
//  println(name)

//  def getSquareAsString(input: Double): String = {
//    val square = input * input
//    square.toString
//  }
//
//  println(getSquareAsString(10))

//  val greeter = new Greeter("Hello ", "!")
//  greeter.greet("Scala Developer")

//  val point = Point(1, 2)
//  val anotherPoint = Point(1, 2)
//  val yetAnotherPoint = Point(2, 2)
//
//  if (point == anotherPoint) {
//    println(point + " and " + anotherPoint + " are the same")
//  } else {
//    println(point + " and " + anotherPoint + " are different")
//  }
//
//  if (point == yetAnotherPoint) {
//    println(point + " and " + yetAnotherPoint + " are the same")
//  } else {
//    println(point + " and " + yetAnotherPoint + " are different")
//  }

//  val newId: Int = IdFactory.create()
//  println(newId)
//  val newerId: Int = IdFactory.create()
//  println(newerId)
//
//  object IdFactory {
//    private var counter = 0
//    def create(): Int = {
//      counter += 1
//      counter
//    }
//  }

  val greeter = new DefaultGreeter()
  greeter.greet("Scala Developer")

  val customGreeter = new CustomizableGreeter("How are you, ", "?")
  customGreeter.greet("Scala Developer")


}

trait Greeter {
  def greet(name: String): Unit = {
    println("Hello " +  name + "!")
  }
}

class DefaultGreeter extends Greeter

class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

//class Greeter(prefix: String, suffix: String) {
//  def greet(name: String): Unit = println(prefix + name + suffix)
//}

//case class Point(x: Int, y: Int)


