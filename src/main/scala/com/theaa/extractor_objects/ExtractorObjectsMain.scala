package com.theaa.extractor_objects

import scala.util.Random

/**
  * Created by: fuzayl
  * Date: 03 May, 2019
  * Company: Finnet Limited 
  */
object ExtractorObjectsMain extends App {

  val customerId = CustomerId("Sukyoung")
  customerId match {
    case CustomerId(name) => println(name)
    case _ => println("Could not extract a CustomerID")
  }

}

object CustomerId {

  def apply(name: String) = s"$name--${Random.nextLong}"

  def unapply(customerId: String): Option[String] = {
    val stringArray: Array[String] = customerId.split("--")
    if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }
}
