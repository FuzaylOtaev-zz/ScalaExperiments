package com.theaa.generics

/**
  * Created by: fuzayl
  * Date: 04 May, 2019
  * Company: Finnet Limited 
  */
object GenericsMain extends App {
  val stack = new Stack[Int]
  stack.push(1)
  stack.push(2)

  println(stack.pop)
  println(stack.pop)
}

class Stack[A] {
  private var elements: List[A] = Nil

  def push(value: A) {
    elements = value :: elements
  }

  def peek: A = {
    elements.head
  }

  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}


