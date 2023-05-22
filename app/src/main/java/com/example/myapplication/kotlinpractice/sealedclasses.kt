package com.example.myapplication.kotlinpractice

fun main() {
    var name = mutableMapOf<String, ArrayList<String>>("bane" to arrayListOf("anem", "one", "theeee"))
     var sosort = name["bane"]?.sorted()
    println(sosort)


}

sealed class Studentes {
    protected fun prt() {
        println("The Class is Sealed class")
    }
}
class UnderGraduate: Studentes()
class PostGraduate: Studentes()
class Doctorate: Studentes()
enum class Member(val nameof: String) {;
    fun prtName() {
    println(nameof)
    }
}
