package com.theaa.singelton_objects

/**
  * Created by: fuzayl
  * Date: 30 Apr, 2019
  * Company: Finnet Limited 
  */
object SingeltonMainObject extends App {
  val project = new Project("TPS Reports", 1)
  Logger.info("Created Projects")
}

object Logger {
  def info(message: String): Unit = print(s"INFO: $message")
}

class Project(name: String, daysToComplete: Int) {}
