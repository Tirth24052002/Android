package com.example.myapplication.kotlinpractice
open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4

    protected class Nested {
        public val e: Int = 5
    }
}

open class SubClass: Outer() {
    override val b = 5
    override val c = 55
}
private val naem: String = "THe private String "
class Unrelated(o: Outer): SubClass() {
     fun grtcal(){
        println()
    println(naem)
     }
}