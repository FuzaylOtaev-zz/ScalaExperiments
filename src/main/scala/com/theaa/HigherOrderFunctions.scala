package com.theaa

object HigherOrderFunctions extends App {

//  val salaryRaiser = new SalaryRaiser()
//  salaryRaiser.showSalaries()

//  val urlBuilder = new UrlBuilder()
//  urlBuilder.showUrl()

  val functions = new Functions()
  println(functions.doubleValue(List(1, 2, 3)))
  println(functions.addition((x: Int, y: Int) => x + y, 10, 20))
  println(functions.applyPatternToText((value: String) => value.reverse, "Hello Scala"))
  println(functions.operateList(List(1, 2, 3), (a: Int, b: Int) => a + b, "sum"))

}

class UrlBuilder {

  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }

  def getURL(ssl: Boolean, domainName: String) = urlBuilder(ssl, domainName)

  def showUrl(): Unit = {
    val domainName = "www.example.com"
    val getUrl = getURL(ssl = true, domainName)
    val endpoint = "users"
    val query = "id=1"
    val url = getUrl(endpoint, query)

    println(url)
  }
}

class SalaryRaiser {

  def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] = {
    salaries.map(promotionFunction)
  }

  def showSalaries(): Unit = {
    val salaries: List[Double] = List(1, 2, 3)
    println(promotion(salaries, _ * 2))
  }
}

class Functions {

  def doubleValue(list: List[Int]): List[Int] = {
    list.map(_ * 2)
  }

  def addition(func: (Int, Int) => Int, x: Int, y: Int): Int = {
    func(x, y)
  }

  def applyPatternToText(func: String => String, value: String): String = {
    func(value)
  }

  def operateList(list: List[Int], func: (Int, Int) => Int, operation: String): Int = {
    def inner(list: List[Int], result: Int): Int = {
      list match {
        case head :: tail => inner(tail, func(head, result))
        case Nil => result
      }
    }

    operation.toLowerCase match {
      case "product" => inner(list, 1)
      case "sum" => inner(list, 0)
    }
  }

}
