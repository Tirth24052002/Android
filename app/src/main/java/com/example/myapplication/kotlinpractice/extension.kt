package com.example.myapplication.kotlinpractice

fun main() {

    println("Hello World!!!".formattedString())

    val list1 = mutableListOf("One", "Two", "Three")
    list1.swap(0, 2 )
    println(list1)


    open class Shape
    class Rectangle: Shape()

    fun Shape.getName() = "Shape"
    fun Rectangle.getName() = "Rectangle"

    fun printClassName(s: Shape) {
        println(s.getName())
    }
    printClassName(Rectangle())

    class Example {
        fun printFunctionType() { println("Class method") }
    }
    fun Example.printFunctionType() { println("Extension function") }
    Example().printFunctionType()

    fun Any?.toString(): String {
        if (this == null) return "null"
        return toString()
    }

    println(null.toString())
    MyClass1.printCompanion()

    val listColor = listOf("red", "green", "blue")
    listColor.getLongestString()

}
fun List<String>.getLongestString() {

}
class MyClass1 {
    companion object { }
}
fun MyClass1.Companion.printCompanion() {
    println("companion")
}
//fun MutableList<Int>.swap(index1: Int, index2: Int) {
//    val tmp = this[index1]
//    this[index1] = this[index2]
//    this[index2] = tmp
//}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
   val tmp = this[index1]
   this[index1] = this[index2]
   this[index2] = tmp

    calculateTimeAndRun {
        loop(10000)
    }
}

fun String.formattedString(): String {
    return "----------------------\n$this\n---------------------------"
}

inline fun calculateTimeAndRun(fn: () -> Unit) {
    val start: Long  = System.currentTimeMillis()
    fn()
    val end: Long = System.currentTimeMillis()
    println("Time taken ${end - start} ms")
}

fun loop(n: Long) {
    for (i: Long in 1..n) {

    }
}

