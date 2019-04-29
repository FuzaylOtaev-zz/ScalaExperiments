package com.theaa.case_classes

object MainObject3 extends App {

  def goIdle(device: Device): Unit = device match {
    case phone: Phone =>
      phone.screenOff
    case computer: Computer =>
      computer.screenSaverOn
    case _ =>
      println("No device found")
  }

}

abstract class Device {}

case class Phone(model: String) extends Device {
  def screenOff = "Turning screen off"
}

case class Computer(model: String) extends Device {
  def screenSaverOn = "Turning screen saver on..."
}
