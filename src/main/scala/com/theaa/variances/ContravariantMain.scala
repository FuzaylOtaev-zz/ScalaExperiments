package com.theaa.variances

/**
  * Created by: fuzayl
  * Date: 04 May, 2019
  * Company: Finnet Limited 
  */
object ContravariantMain extends App {
  val subType = new SubType
  val superType = new SuperType

  val typeCarer = new TypeCarer

  typeCarer.dipslay(subType)
  typeCarer.dipslay(superType)
}

abstract class Type[-T] {
  def typeName: Unit
}

class SuperType extends Type[AnyVal] {
  override def typeName: Unit = {
    println("SuperType")
  }
}

class SubType extends Type[Int] {
  override def typeName: Unit = {
    println("SubType")
  }
}

class TypeCarer {
  def dipslay(t: Type[Int]) = {
    t.typeName
  }
}
