package com.example.myapplication.kotlinpractice

fun main(args: Array<String>) {

    println(args.contentToString())
    print("Hello")
    print("World")
    println("Hello")
    println("World")
    println(22)
    println(sum(2, 3))
    println("sum of 123 and 312 is ${sum(123, 321)}")
    printSum(12, 22)
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3
    println("a=$a, b=$b, c=$c")
    var x = 5
    x += 1
    println("x = $x")
    println("z =$x; PI = $PI")
    incrementX()
    println("incremetX()")
    println("x = $xa; Pi = $PI")
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
    var p = 1
    var s1 = "a is $p"
    p = 2
    var s2 = "${s1.replace("is", "was")}, but now is $p"
    println(s2)
    println("max of 123 and 321 is ${maxOf(123, 321)}")
    println(evenNumber(11))
    for (it in items) {
        println(it)
    }
    for (index in items.indices) {
        println("Item at $index is ${items[index]}")
    }
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
    val aa = 10
    val ab = 9
    if (aa in 1..ab+1) {
        println("fits in range")
    }
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
    for (i in 0..10 step 2) {
        println(i)
    }
    println()
    for (i in 15 downTo 0 step 3) {
        println(i)
    }
    for (item in items) {
        println(item)
    }
    val items = setOf("apple","banana", "kiwiFruit")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("An apple a day keep doctor away")
    }
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
       .forEach { println(it) }
    printProduct("2", "null")
    printProduct("a","7")
    printProduct("a", "b")
    printProducts("22", "a")
    printProducts("22", "2")
    fun printLength(obj: Any) {
        println("Getting the length of $obj. Result: ${getStringLength(obj) ?: "Error: The object is not the string "}")
    }
    printLength("name of the person")
    printLength(1000)
    printLength(listOf(Any()))
    val myTrue = true
    val myFalse = false
    val boolNull: Boolean? = null
    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)
    val achar: Char = 'a'
    println(achar)
    println('\n')
    println('\uFF00')
    demo("NameOFPErson")
    var xz = null
    val xa: String? = xz as? String
    loop@ for (i in 90..100){
        println(i)
    }
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (i%2 ==0) break@loop
        }
    }
    foo()
    foo1()
   val test =  TestLazy()
    println(test.foo2())
}
enum class Bit {
    ZERo, ONE
}

val PI = 3.14
var xa = 0
fun incrementX() {
    xa += 1
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

class Shape
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b
fun evenNumber(no: Int) = if (no % 2 == 0) no else null

val items = listOf("apple", "banana", "Kiwifruit")
var index = 0

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greetings"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }
val list = listOf("a", "b", "c")
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}
fun printProduct(arg1: String, arg2: String) {
    var x = parseInt(arg1)
    var y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    }
    else {
        println("$arg1 or $arg2 is not a number")
    }
}
fun printProducts(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if (x == null) {
        println("Invalid number foramt for arg1: $arg1")
        return
    }
    if (y == null) {
        println("Invalid number format in arg2: $arg2")
        return
    }
    println(x * y)
}
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}
fun demo(x: Any) {
    if (x is String) {
        print(x.length)
    }
}
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        print(it)
    }
    println("This Point is unreachable")
}
fun  foo1() {
    val x = run loop@ {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach
            print(it)
        }

        print("done with nested loop")
    }
}
class TestLazy {
    lateinit var nameOfPersones: String
    fun foo2(): Boolean {
        nameOfPersones = "nameGiven"
        return ::nameOfPersones.isInitialized
    }
}