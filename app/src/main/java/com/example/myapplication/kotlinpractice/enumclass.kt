package com.example.myapplication.kotlinpractice

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

fun main() {

    val a = 123
    val b = 321
    for (f in IntArithmetics.values()) {
        println("$f($a, $b) = ${f.apply(a, b)}")
    }
    for (color in Color.values()) {
        println(color)
        println("valu of first color: ${Color.valueOf("RED")}")
    }
    println(RGB.RED.name)
    println(RGB.RED.ordinal)

}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00ff00),
    BLUE(0x0000FF)
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };
    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}

enum class RGB {
    RED, BLACK, VIOLET, PURPLE
}

inline fun <reified T: Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}
var test = arrayListOf("Test")
enum class CardType(val color: ArrayList<String>) {
    SILVER(test),
}
