package com.example.myapplication.kotlinpractice

fun main() {
    println("is 7 is even? ${isEvenno.accept(7)}")

    println("Is 8 even? ${isEvenCheck(8)}")

}
fun interface KRunnabel {
    fun invoke()
}

val isEvenno = IntPredicate { it % 2 == 0}

interface Printer {
    fun print()
}

fun Printer(block: () -> Unit): Printer = object : Printer {
    override fun print() {
        block()
    }
}
typealias IntPredicates = (i: Int) -> Boolean
val isEvenCheck: IntPredicates = { it % 2 == 0 }
