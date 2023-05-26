package com.example.myapplication.kotlinpractice

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(100)

    val evenOrNull = number.takeIf { it % 2 == 0 }
    val oddOrNull = number.takeUnless { it % 2 == 0 }
    println("even: $evenOrNull, odd: $oddOrNull")

    val str = "Hello!"
    val caps = str.takeIf { it.isNotEmpty() }?.uppercase()
    println(caps)

    fun displaySubstringPosition(input: String, sub: String) {
        input.indexOf(sub).takeIf { it >= 0 }?.let {
            println("The sibstring $sub is found in $input")
            println("Its start position is $it.")
        }
    }
    displaySubstringPosition("01000011", "11")
    displaySubstringPosition("011010011", "12")

    fun displaySubString(input: String, sub: String) {
        val idx = input.indexOf(sub)
        if(idx >= 0) {
            println("The substring $sub in $input")
            println("It's start position is $idx")
        }
    }
    displaySubString("0100000011", "11")
    displaySubString("0100000011", "12")

}

