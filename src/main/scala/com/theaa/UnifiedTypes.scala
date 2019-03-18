package com.theaa

object UnifiedTypes extends App {

  val list: List[Any] = List(
    "string",
    732,
    'c',
    true,
    () => "an anonymous function returning a string"
  )

  list.foreach(el => {
    println(el)
  })
}
