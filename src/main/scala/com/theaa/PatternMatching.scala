package com.theaa

object PatternMatching extends App {
//  val stuff = "blue"
//  val myStuff = stuff match {
//    case "red" ⇒ (255, 0, 0)
//    case "green" ⇒ (0, 255, 0)
//    case "blue" ⇒ (0, 0, 255)
//    case _ ⇒ println(stuff); 0
//  }
//
//  println(myStuff)


  def goldilocks(expr: Any) = expr match {
    case ("porridge", _) ⇒ "eating"
    case ("chair", "Mama") ⇒ "sitting"
    case ("bed", "Baby") ⇒ "sleeping"
    case _ ⇒ "what?"
  }

  println(goldilocks(("porridge", "")))
}
