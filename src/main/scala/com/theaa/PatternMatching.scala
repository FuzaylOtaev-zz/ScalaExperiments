package com.theaa

object PatternMatching extends App {


  def matchTest(value: Int): String = value match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

}
