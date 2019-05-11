package com.theaa.upper_lower_type_bounds

object UpperTypeBoundsMain extends App {
  val dogContainer = new PetContainer[Dog](new Dog)
  val catContainer = new PetContainer[Cat](new Cat)
}

abstract class Animal {
  def name: String
}

abstract class Pet extends Animal {}

class Cat extends Pet {
  override def name: String = "Cat"
}

class Dog extends Pet {
  override def name: String = "Dog"
}

class Lion extends Animal {
  override def name: String = "Lion"
}

class PetContainer[P <: Pet](p: P) {
  def pet: Pet = p
}
