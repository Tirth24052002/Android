package com.example.myapplication.kotlinpractice

fun main() {
    val number = setOf("one", "two", "three", "four", "five")
    println(number union setOf("six"))
    println(setOf("seven", "eight") union  number)

    println(number intersect setOf("two", "ten"))
    println(number subtract setOf("one"))

    val list1 = listOf(1, 2, 4, 45 ,5 )
    val list2 = listOf(1, 2 , 1, 22, 3, 445, 45, 5)
    println(list1 intersect list2)
    println(list1 union list2)
    println(list1[0])
}