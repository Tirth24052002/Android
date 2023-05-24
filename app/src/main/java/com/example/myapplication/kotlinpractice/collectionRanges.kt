package com.example.myapplication.kotlinpractice

import android.os.Build.VERSION

fun main() {
    val i = 9
    if ( i  in 1..10) {
        println(i)
    }
    for(i in 1..11){
        println(i)
    }

    for(i in 20 downTo 0 step 5){
        println(i)
    }

    for(i in 0 until 10) {
        println(i)
    }

    val versionRange = Version(1, 11).. Version(1, 30)
    println(Version(0, 9) in versionRange)
    println(Version(1, 20) in versionRange)

    for(i in (1..3).reversed()) {
        println(i)
    }

    println((1..15).filter{ it % 2 == 0})

    for (num in 1.rangeTo(12)) {
        println(num)
    }
}

class Version(val major: Int, val minor: Int): Comparable<Version> {
    override fun compareTo(other: Version): Int {
         if (this.major != other.major) {
             return this.minor - other.major
         }
        return this.minor - other.minor
    }
}