package com.example.myapplication.kotlinpractice

fun main() {
    fun printLine() { println("Top-level function") }
   class A {
       fun printLine() { println( "Member function") }
       fun invokePrintline(omitThis: Boolean = false) {
           if(omitThis) printLine()
           else this.printLine()
       }
   }
    A().invokePrintline()
    A().invokePrintline(omitThis = true)
}
class ParentClass {
    inner class ChildClass {
        fun Int.foo() {
            val a = this@ParentClass
            val b = this@ChildClass

            val c = this
            val c1 = this@foo

            val funLit = lambda@ fun  String.() {
                val d = this
            }
            val funLit2 = { s: String ->
                val d1 = this
            }
        }
    }
}