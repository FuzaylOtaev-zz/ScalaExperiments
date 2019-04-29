package com.theaa.case_classes

object MainObject extends App {

  callCase(CaseClass1(10,10))
  callCase(CaseClass2(10))
  callCase(CaseObject)

  def callCase(obj: SuperTrait) = obj match {
    case CaseClass1(a, b) => println("a = " + a + " b = " + b)
    case CaseClass2(a) => println("a = " + a)
    case CaseObject => println("No argument")
  }
}

trait SuperTrait {}

case class CaseClass1(a: Int, b: Int) extends SuperTrait {}

case class CaseClass2(a: Int) extends SuperTrait {}

case object CaseObject extends SuperTrait {}
