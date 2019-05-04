package com.theaa.extractor_objects

/**
  * Created by: fuzayl
  * Date: 03 May, 2019
  * Company: Finnet Limited 
  */
object ExtractorObjectsMain2 extends App {

  println(Name.apply("Fuzayl", "Otaev"))
  println(Name.unapply("Fuzayl Otaev"))
}

object Name {

  def apply(firstName: String, lastName: String) = {
    firstName + " " + lastName
  }

  def unapply(value: String): Option[(String, String)] = {
    val pts = value.split(" ")
    if (pts.length == 2) Some(pts(0), pts(1)) else None
  }

}
