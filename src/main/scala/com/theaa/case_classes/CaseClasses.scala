package com.theaa.case_classes

object CaseClasses extends App {

//  playWithCaseClasses()


  def playWithCaseClasses(): Unit = {
    val message1 = Message("Fuzayl", "Firdavs", "Hello")
    val message2 = Message("Fuzayl", "Firdavs", "Hello")
    println(message1 == message2)

    val message3 = message1.copy(sender = "Amigo")
    println(message3.sender)
  }

}

case class Message(sender: String, recipent: String, body: String) {

}
