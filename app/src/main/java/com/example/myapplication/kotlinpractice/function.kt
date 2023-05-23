package com.example.myapplication.kotlinpractice

fun main() {
    println(double(12))
    println(BClass().foo())
   foo(1) { println("Hello!!!") }
  reformat("String!",
      false,
      upperCaseFirstLetter = false,
      divideByCamelHumps = true,
      '-')
reformat("This is just a string ")

    foo1(strings = *arrayOf("a", "b", "c"))

    printhello("Pikachu")
    printhello(null)

    println(threeTimes(12))
    val a = arrayOf(1, 2, 4)
    println(asList(2,1,11,33,4,*a ,2))

    highOrder(10, 20, 30, ::myfunction)
}
fun myfunction(num1: Int, num2: Int, num3: Int): Int{
    return ((num1 + num2 + num3)/ 3)
}
fun highOrder(num1: Int, num2: Int, num3: Int, funcName: (Int, Int, Int) -> Int){
    println(funcName(num1, num2,num3))
}
val eps = 1E-10
tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))


infix fun Int.shl(x: Int): Int {return 2}

fun <T> asList(vararg ts: T): List<T>{
    var result = ArrayList<T>()
    for (t in ts)
        result.add(t)
    return result
}

fun reformat( str: String,
normalizeCase: Boolean = true,
upperCaseFirstLetter: Boolean = true,
divideByCamelHumps: Boolean = false,
wordSeperator: Char = ' '){}

fun double(x: Int): Int {
    return 2 * x
}

open class AClass {
    open fun foo(i: Int = 11){}
}

class BClass: AClass() {
    override fun foo(i: Int) {
    }
}

fun foo(bar: Int = 0 ,
        baz: Int = 1,
        qux: () -> Unit,){}
fun foo1(vararg strings: String){}

fun printhello(name: String?): Unit{
    name?.let {
        println("Hello $name")
    }?.runCatching {
        println("Hi there!")
    }
}

fun threeTimes(i: Int): Int = i * 3

