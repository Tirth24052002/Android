package com.example.myapplication.kotlinpractice

fun main() {
    var a = 123
    var b = null
    println(a?.equals(b) ?: (b === null))
    compareAge(22, 22)

    var name  = "Tripper"
    var nameTwo = name
    println(name===nameTwo ?: 0)
}
fun compareAge(one: Int, two: Int){
    if(one == two) {
        println("The Entered value are equal")
    } else {
        println("The Entered value is not equal")
   }
}