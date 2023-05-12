package com.example.myapplication.kotlinpractice

fun main() {
    InitOrderDemo("Hello")
    Customer("mangoes")
    Constructors(1)
    var Rec = Rectangles()
    println(Rec.draw())
}

class InitOrderDemo(name: String) {
    val firstProperty = "First Property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer blocks that prints ${name.length}")
    }
}
class Customer(name: String) {
    val customerKey = name.uppercase().also(::println)
}
class Person(val pets: MutableList<Pet> = mutableListOf())
class Pet {
    constructor(owner: Person) {
        owner.pets.add(this)
    println("The class is printed")
    }
}

class Constructors {
    init {
        println("Init block")
    }
    constructor(i: Int) {
        println("Constructor $i")
    }
}
abstract class Polygon {
    abstract fun draw(): String
    fun funny(name: String):String {
        return name
    }
}
class Rectangles: Polygon() {
    override fun draw(): String {
        return "The method is override"
    }
}
 open class Shapes(naem:String){
    open fun addFeatures(feature: String): String {
        return feature
    }
}
abstract class Square(naem: String): Shapes(naem) {
    override fun addFeatures(feature: String): String {
        return super.addFeatures(feature)
        println("The Open Class Method is Override")
    }
}

