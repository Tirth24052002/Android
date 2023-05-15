package com.example.myapplication.kotlinpractice

import android.icu.text.Transliterator.Position

fun main() {
    val d = D()
    d.bar()
    d.foo()
    println("is 6 even? - ${isEven.accept(6)}")
}

interface MyInterface {
    fun bar()
    fun foo() {
        println("The function with body")
    }
}

class Child: MyInterface {
    override fun bar() {
        println("The bar function is callled")
    }
}
interface MyInterfaceOne {
    val prop: Int
    val propertyWithImplementation: String
        get() = "foo"
    fun foo() {
        println(prop)
    }
}
class Childs: MyInterfaceOne {
    override val prop: Int = 29
}
interface Named {
    val name: String
}
interface Persons: Named {
    val firstName: String
    val lastName: String
    override val name: String
        get() = "$firstName $lastName"
}
data class Employee( val position: Position,
                    override val firstName: String,
                    override val lastName: String
): Persons
interface A {
    fun foo() { print("A") }
    fun bar()
}
interface B {
    fun  foo() { print("B") }
    fun bar() { print("bar") }
    }
class C: A {
    override fun bar() {
        println("Bar")
    }
}
class D: A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }
    override fun bar() {
        super.bar()
    }
}
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}
val isEven = object: IntPredicate {
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }
}
val isEvens = IntPredicate {  it % 2 == 0 }