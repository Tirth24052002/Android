package com.example.myapplication.kotlinpractice

import android.graphics.Rect

fun main() {

    var priceOfCars = mutableListOf(123, 321, 432, 654, 765)
    priceOfCars.swapNo(2, 3)
    println(priceOfCars)
    var nameOfCars = mutableListOf("Porsche", "Bugatti", "GTR", "Supra")
    nameOfCars.swapNo(0, 3)
    println(nameOfCars)

    open class Shape
    class Rectangle : Shape()

    fun Shape.getName() = "name"
    fun Rectangle.getName() = "Rectangle Name"

    fun printClassName(s: Shape) {
        println(s.getName())
    }
    printClassName(Rectangle())
    class Example1() {
        fun printFunctionType() {
            println("CLass Method")
        }
    }

    fun Example1.printFunctionType(i: Int) {
        println("Extension Function #$i")
    }
    Example1().printFunctionType(123)

    fun Any.toString(): String {
        if (this == null) return "null"
        return toString()
    }

    var price = null
    println(price.toString())

    var values = listOf(12, 22, 33, 44, 12)
    println(values.lastIndex)
    MyClass0.create()

    Connection(Host("Kotlins"), 442).connect()

    BaseCaller().call(Bases())
    DerivedCaller().call(Bases())
    DerivedCaller().call(Deriveds())

    val  passStudent = Studen().isPassed(22)
    println(passStudent)
    val excellentStudent = Studen().isExcellent(91)
    println(excellentStudent)
}

val <T> List<T>.lastIndex: Int
    get() = size - 1

fun <T> MutableList<T>.swapNo(one: Int, two: Int) {
    var temp = this[one]
    this[one] = this[two]
    this[two] = temp
}

class MyClass0 {
    companion object Factory {
        fun create(): MyClass0 = MyClass0()
    }
}

class Host(val hostname: String) {
    fun printHostName() {
        print(hostname)
    }
}

class Connection(val host: Host, val port: Int) {
    fun printport() {
        print(port)
    }

    fun Host.printConnectionString() {
        printHostName()
        print(":")
        printport()
    }

    fun connect() {
        host.printConnectionString()
    }
}

open class Bases {}

class Deriveds : Bases() {}

open class BaseCaller {
    open fun Bases.printFunctionInfo() {
        println("Base extension function in BaseCaller")
    }

    open fun Deriveds.printFunctionInfo() {
        println("Derived extension function is BaseCaller")
    }

    fun call(b: Bases) {
        b.printFunctionInfo()
    }
}

class DerivedCaller: BaseCaller() {
    override fun Bases.printFunctionInfo() {
        println("Base extension function is Derived caller")
    }

    override fun Deriveds.printFunctionInfo() {
        println("Derived extension function in DerivedCaller")
    }
}
//--------------------Out of Lms -------------//
class Studen {
    fun isPassed(mark: Int): Boolean {
        return mark > 40
    }
}
fun Studen.isExcellent(mark: Int): Boolean {
    return mark > 90
}

