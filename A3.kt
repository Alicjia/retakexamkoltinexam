package com.example.myapplication.koltinquestions


fun foo(name: String = "", number: Int = 0, toUpperCase: Boolean = false) =
  (if (toUpperCase) name.uppercase() else name) + number

fun useFoo() = listOf(
  foo("a"),
  foo("b", number = 1),
  foo("c", toUpperCase = true),
  foo(name = "d", number = 2, toUpperCase = true)
)
fun main() {
  val result = useFoo()
  println(result)
}