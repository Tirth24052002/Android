package com.example.myapplication.kotlinpractice
fun main() {
    println("Hello World!")
    val one = 1
    val threeBillion = 3000000000
    val oneLong  = 1L
    val oneByte: Byte = 1
    val pi = 3.14
    val oneDouble = 1.0
    val e = 2.124352542341423
    val eFloat = 2.1124143456789f
    fun printDouble(d: Double) { println(d) }
    val i = 0
    val d = 1.0
    val f = 1.0f
    printDouble(d)
    val oneMillion = 1_000_000
    val crediCard = 123_5678_9012_1234L
    val hexByte = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_100100100
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    val b: Int = 10000
    val boxedB: Int? = a
    val anotherBoxedB: Int? = b
    println(boxedA === anotherBoxedA)
    println(boxedB === anotherBoxedB)
    val c: Int? = 1
    val z: Byte = 1
    val i1: Int =  z.toInt()
    val l = 1L + 3
    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)
    val x = (1 shl 2) and 0x000FF000
    println(Double.NaN == Double.NaN)
    println(listOf(Double.NaN) == listOf(Double.NaN))
    println(0.0 == -0.0)
    println(listOf(Double.NaN) == listOf(-0.0))
    println(listOf(Double.NaN, Double.POSITIVE_INFINITY, 0.0, -0.0).sorted())
}
