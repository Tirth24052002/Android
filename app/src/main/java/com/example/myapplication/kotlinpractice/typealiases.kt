package com.example.myapplication.kotlinpractice

fun main() {
    val f: (Int) -> Boolean = { it > 0}
    println(foo(f))

    val p: Predicat<Int> = {it > 0}
    println(listOf(1, -2).filter(p))
}

class Aclass  {
    inner class Inner
}
class Bclass {
    inner class Inner
}
typealias AInner = Aclass.Inner
typealias BInner = Bclass.Inner

typealias Predicat<T> = (T) -> Boolean

fun foo(p: Predicat<Int>) = p(42)
