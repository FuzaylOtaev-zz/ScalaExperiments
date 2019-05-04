package com.theaa.extractor_objects

/**
  * Created by: fuzayl
  * Date: 03 May, 2019
  * Company: Finnet Limited 
  */
object ExtractorObjectsMain3 extends App {

  val studentList = List(
    Student("Harris", List(Address("LosAngeles", "California"))),
    Student("Reena", List(Address("Houston", "Texas"))),
    Student("Rob", List(Address("Dallas", "Texas"))),
    Student("Chris", List(Address("Jacksonville", "Florida")))
  )

  val Texas = new StringSeqContains("Texas")
  val students = studentList collect {
    case student @ City(Texas()) => student.name
  }

  println(students)

}

case class Address(city: String, state: String)
case class Student(name: String, address: Seq[Address])

object City {
  def unapply(s: Student): Option[Seq[String]] = {
    Some(for (c <- s.address) yield c.state)
  }
}

class StringSeqContains(value: String) {
  def unapply(in: Seq[String]): Boolean = {
    in contains value
  }
}
