package com.example.myapplication.kotlinpractice



fun main() {
    val nameof = Password("Kotlin")
    nameof.greet()
    println(nameof.length)

    val namecheck = Name("Football")
    namecheck.prettyPrint()
    println(namecheck.prettyPrint())

    val f = Foo(44)
    asInline(f)
    asGeneric(f)
    asInterface(f)
    asNullable(f)

    val c = id(f)

    val nameAlias: NameTypeAlias = ""
    val acceptInlineClass: NameInlineClass = NameInlineClass("")
    val string: String = ""

    accentNameTypeAlias(string)

    val my = MyInterfaceWrapper(object : MyInterfaceCheck {
        override fun bar() {
            println("The bat function")
        }
    })
    println(my.foo())

    displayTimePeriod("displaying time period", TimePeriod.millis(2000))
    displayTimePeriod("displaying time period", TimePeriod.seconds(2))

    val width = Width(100L)
    val height = Heigt(50L)
    var shape = Rectangle1(width,height)
    shape.printSpec()
}

inline class Width(val width: Long)
inline class Heigt(val height: Long)

class Rectangle1(width: Width, height: Heigt) {
    private val width: Width? = width
    private val height: Heigt? = height
    fun printSpec() {
        println("${this.width.hashCode()}, ${this.height.hashCode()}")
    }
}

@JvmInline
value class Password(private  val s: String){

    init {
        require(s.length > 0) {}
    }
    val length: Int
        get() = s.length

    fun greet() {
        println("Hello, $s")
    }
}
val securePassword = Password("Don't try this in production")

interface Printable {
    fun prettyPrint(): String
}

@JvmInline
value class Name(val s: String ): Printable {
    override fun prettyPrint(): String = "Let's $s"
}

interface I

@JvmInline
value class Foo(val i: Int): I

fun asInline(f: Foo) {}
fun <Z> asGeneric(x: Z) {}
fun asInterface(i: I) {}
fun asNullable(i : Foo?) {}

fun <T> id(x: T): T = x

@JvmInline
value class UserId<T>(val value: T)

fun compute(s: UserId<String>){}

@JvmInline
value class UInt(val x: Int)

fun compute(x: Int){}
fun compute(x: UInt){}

typealias NameTypeAlias = String

@JvmInline
value class NameInlineClass(val s: String)
fun accentNameTypeAlias(n: NameTypeAlias){}
fun acceptNameIntlineClass(p: NameInlineClass){}

interface MyInterfaceCheck {
    fun bar()
    fun foo() = "foo"
}

@JvmInline
value class MyInterfaceWrapper(val myInterface: MyInterfaceCheck): MyInterfaceCheck by myInterface

@JvmInline
value class TimePeriod private constructor(
    val timePeriod: Long
) {
    companion object {
        fun millis(millis: Long) = TimePeriod(millis)
        fun seconds(seconds: Long) = TimePeriod(seconds * 1000)
    }
}

fun displayTimePeriod(message: String, duration: TimePeriod) {
    println("Will show $message for ${duration.timePeriod} milliseconds")
    println("Hashcode of the time period ${duration.hashCode()}")
}
