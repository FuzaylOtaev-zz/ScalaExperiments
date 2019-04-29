package com.theaa.case_classes

object MainObject2 extends App {


//  val notification = Sms("123456", "Where are you ?")
//  println(showNotification(notification))

  val notification = Sms("998944511575", "Where are you ?")
  println(showImportantNotification(notification, Seq("998934511575", "998911639805")))

  def showNotification(notification: Notification): String = notification match {
    case Email(sender, title, _) =>
      s"you got email from $sender with title: $title"
    case Sms(caller, message) =>
      s"you got sms from $caller with message: $message"
    case VoiceRecording(contactName, link) =>
      s"you received a Voice Recording from $contactName! Click the link to hear it: $link"
  }

  def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
    notification match {
      case Email(sender, _,  _) if importantPeopleInfo.contains(sender) =>
        "You got an email from special someone!"
      case Sms(caller, _) if importantPeopleInfo.contains(caller) =>
        "You got an email from special someone!"
      case other =>
        showNotification(other)
    }
  }

}

abstract class Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class Sms(caller: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification
