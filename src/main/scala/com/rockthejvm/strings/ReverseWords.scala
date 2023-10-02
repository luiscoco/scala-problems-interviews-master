package com.rockthejvm.strings

object ReverseWords {

  /*
    "Alice loves Scala" => "Scala loves Alice"
    "    hello      world    " => "world hello"
   */
  def reverseWords(string: String): String =
    string.split(" ").filter(!_.isEmpty).reverse.mkString(" ")

  def main(args: Array[String]): Unit = {
    println(reverseWords("Alice loves Scala"))
    println(reverseWords("    hello      world    "))
  }
}
