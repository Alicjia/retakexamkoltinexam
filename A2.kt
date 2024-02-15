package com.example.myapplication.koltinquestions

class DataToCreate(val value: Int) {
  init {
    println("I'm getting created")
  }
}

class LazyProperty {
  val lazyValue: DataToCreate by lazy {
    DataToCreate(1)
  }
}

fun main() {
  val prop = LazyProperty()

  println("Program start")

  println(prop.lazyValue.value)
}
