package com.theaa.for_comprehensions

object ForComprehensionsMain extends App {

  val users = List(
    User("Kelly", 33),
    User("Jennifer", 44),
    User("Travis", 28),
    User("Dennis", 23)
  )

  val twentySomethings = for (user <- users if user.age >= 20 && user.age <= 30) yield user.name
  twentySomethings.foreach(name => println(name))

}

case class User(name: String, age: Int)
