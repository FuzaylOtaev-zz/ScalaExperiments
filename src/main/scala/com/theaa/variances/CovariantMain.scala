package com.theaa.variances

/**
  * Created by: fuzayl
  * Date: 04 May, 2019
  * Company: Finnet Limited 
  */
object CovariantMain extends App {
  val puppy = new Puppy
  val dog = new Dog

  val puppyAnimal: Animal[Puppy] = new Animal[Puppy](puppy)
  val dogAnimal: Animal[Dog] = new Animal[Dog](dog)

  val dogCarer = new AnimalCarer(dogAnimal)
  val puppyCarer = new AnimalCarer(puppyAnimal)
}

class Animal[+T] (val animal: T)

class Dog
class Puppy extends Dog

class AnimalCarer(val dog: Animal[Dog])
