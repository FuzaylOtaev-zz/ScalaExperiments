package com.theaa.exercises

object ListStrings extends App {

//  println(max(List(1, 2, 3)))
//  println(reverse(List(1, 2, 3, 4, 5)))
//  println(isElementOccurs(List(10, 20, 30), 5))
//  println(getElementsOnOddPos(List(0, 1, 2, 3, 4, 5, 6, 7)))
//  println(sum(List(1, 2, 3, 4, 5)))
  println(isStringPalindrome(Option("civic")))

  def max[A <% Ordered[A]](collection: Traversable[A]): Option[A] = collection match {
    case Nil => None
    case List(single: A) => Some(single)
    case _ => collection.reduceLeftOption((prev, next) => if (prev > next) prev else next)
  }

  def reverse[A](list: List[A]): List[A] = list match {
    case Nil => List()
    case _ => list.reverse
  }

  def isElementOccurs[A](collection: Traversable[A], value: A): Boolean = collection match {
    case Nil => false
    case _=> collection.exists(_ equals value)
  }

  def getElementsOnOddPos[A](list: List[A]): List[A] = list match {
    case Nil => List()
    case List(single: A) => List()
    case _=> list.view.zipWithIndex.filter(_._2 % 2 == 1).map(_._1).toList
  }

  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tail => head + sum(tail)
  }

  def isStringPalindrome(value: Option[String]): Boolean = value match {
    case None => false
    case _=> value.get.equals(value.get.reverse)
  }




}
