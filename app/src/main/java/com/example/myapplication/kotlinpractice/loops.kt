package com.example.myapplication.kotlinpractice

fun main() {
    forLoops()
    val array = arrayOf("a", "b", "c")
    for ((index, value ) in array.withIndex()) {
        println("The element at $index is $value")
    }
    for (i in array.indices) {
        println(array[i])
    }
    useWhen(2)
    rangeWhen(120)
    hasPrefix("apple")
    for (i in 6 downTo 50 step 5) {
        println(i)
    }
    var x = 12
    while (x > 0) {
        println(x)
        --x
    }
}
var item = listOf(1, 2, 3, 4, 5, 6, 7 , 8, 9 , 10)
fun forLoops() {
    for (i in item) {
        println(i)
    }
    for (i in 12 downTo 0 step 2) {
        println(i)
    }
}
fun useWhen (x: Any) {
    when (x) {
        1 -> println("x == 1 ")
        2 -> println("x == 2 ")
        else -> {
            println("The number is not in range")
        }
    }
}
fun rangeWhen (x: Any) {
    when(x) {
        in 1..10 -> println("The number is between 1 to 10")
        in 11..20 -> println("The number is between 11 to 20")
        !in 21..50 -> println("The number is far away")
        else -> println("The number is not within range")
    }
}
fun hasPrefix(x: Any) = when (x) {
    is String -> println(x.startsWith("a"))
    else -> false
}
