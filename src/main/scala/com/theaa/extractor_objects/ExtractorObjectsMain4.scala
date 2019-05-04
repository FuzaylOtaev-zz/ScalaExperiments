package com.theaa.extractor_objects

/**
  * Created by: fuzayl
  * Date: 03 May, 2019
  * Company: Finnet Limited 
  */
object ExtractorObjectsMain4 {
  def main(args: Array[String]): Unit = {
    println("Apply method : " + apply("Zara", "gmail.com"))
    println("Unapply method : " + unapply("Zara@gmail.com"))
    println("Unapply method : " + unapply("Zara Ali"))
  }

  def apply(user: String, domain: String) = {
    user + "@" + domain
  }

  def unapply(email: String): Option[(String, String)] = {
    val parts = email.split("@")
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }

}
