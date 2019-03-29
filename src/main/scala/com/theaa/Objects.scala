package com.theaa

object Objects extends App {
//  println(Movie.academyAwardBestMoviesForYear(1932).get.name)

  val clark = new Person("Clark Kent", "Superman")
  val peter = new Person("Peter Parker", "Spider-Man")

  println(Person.showMeInnerSecret(clark))
  println(Person.showMeInnerSecret(peter))
}

class Movie(val name: String, val year: Short) {

}

object Movie {
  def academyAwardBestMoviesForYear(x: Short) = {
    x match {
      case 1930 ⇒ Some(new Movie("All Quiet On the Western Front", 1930))
      case 1931 ⇒ Some(new Movie("Cimarron", 1931))
      case 1932 ⇒ Some(new Movie("Grand Hotel", 1932))
      case _ ⇒ None
    }
  }
}

class Person(val name: String, private val superheroName: String) {

}


object Person {
  def showMeInnerSecret(x: Person) = x.superheroName
}

