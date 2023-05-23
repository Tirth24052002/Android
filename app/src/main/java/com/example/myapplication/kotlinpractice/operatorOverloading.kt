package com.example.myapplication.kotlinpractice

fun main() {
println(-point)
    println(CheckEquality().check())
}
class CheckEquality() {
    fun check(){
       val  valueOne: Int = 21
       val  valueTwo: Int = valueOne
        if(valueOne === valueTwo){
            println("The value is equal")
        } else {
            println("Not Equal")
        }
    }
}

data class Point(val x: Int,val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)
val point = Point(10, 20)

interface IndexedContainer {
    operator fun get(index: Int)
}

class OrdersList: IndexedContainer {
    override fun get(index: Int) {

    }
}
