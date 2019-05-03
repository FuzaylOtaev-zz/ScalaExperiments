package com.theaa.singelton_objects

/**
  * Created by: fuzayl
  * Date: 30 Apr, 2019
  * Company: Finnet Limited 
  */
object SingeltonMainObject3 extends App {
  val scalaCenterEmail = Email.fromString("scala.center@epfl.ch")
  scalaCenterEmail match {
    case Some(email) => print(s"""Registered an email|Username: ${email.userName}|Domain name: ${email.domainName}""")
    case None => println("Error: could not parse email")
  }
}

class Email(val userName: String, val domainName: String) {}

object Email {
  def fromString(emailString: String): Option[Email] = {
    emailString.split('@') match {
      case Array(userName, domainName) => Some(new Email(userName, domainName))
      case _ => None
    }
  }
}
