package com.example.myapplication.kotlinpractice

import com.google.firebase.database.core.utilities.TreeNode
import java.util.concurrent.locks.Lock

fun main() {
    fooOne()

}
inline fun ordinaryFunction(blok: () -> Unit) {
    println("hi!")
}
fun fooOne() {
    ordinaryFunction {
        return
    }
}

fun hasZeros(ints: List<Int>): Boolean {
    ints.forEach {
        if (it == 0) return true
    }
    return false
}

inline fun f(crossinline body: () -> Unit) {
    val f = object : Runnable {
        override fun run() = body()
    }
}

