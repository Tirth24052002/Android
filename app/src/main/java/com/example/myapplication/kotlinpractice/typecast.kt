package com.example.myapplication.kotlinpractice

fun main() {
    println("Hello")
    if (obj !is String) {
        println("Not a String")
    }
    else {
        print(obj.length)
    }
    demos("awe")
    demoOne("myFunction")
    doSomething(1.321)
    println(max)

}

val obj: Any? = null
fun demos(x: Any) {
    if (x is String) {
        println(x.length)
    }
}

fun demoOne(x: Any) {
    if (x is String && x.length > 0) {
        println(x.length)
    }
}

fun doSomething(x: Any) {
    when (x) {
        is Int -> println("The ENtered data is in integer")
        is Double -> println("The entered data is in Double")
        is String -> println("The Entered data is a String")
        is IntArray -> println("The Entered data  is integer array")
    }
}
val one = 123
val two = 312
val max = if (one > two) {
    one
} else {
    two
}
