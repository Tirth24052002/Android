package com.example.myapplication.kotlinpractice

import org.w3c.dom.Node
import java.time.Instant

fun main() {
    var a: String? = "abc"
    a = null
    println(a)
    var l = if (a != null) a.length else -1
    println(l)

    var b: String? = "Kotlin"
    if (b != null) {
        println("String is null ")
    } else {
        println("Empty String")
    }

    println(b?.length)
    println(a?.length)

    val listWithNull: List<String?> = listOf("Koltin", null)
    for(items in listWithNull) {
        items?.let { println("The item contained is $items") }
            items?.runCatching { println("This is null value") }
    }

    var timeStamp: Instant? = null
    val isoTimestamp = timeStamp?.toString()
    if (isoTimestamp == null) {
        println("The entered value is null")
    }
    //Elvis Operatoer
    var carName = "GTR"
    var carCheck = carName.length ?: -1
    println(carCheck)

    val fileName = "namOfperson"
    println(fileName!!.length)

    val aInt: Int? = 2.23 as? Int
    println(aInt)

    var nullableNameList: List<String?> = listOf("nameOne", "nameTwo", "nameThree", "nameFour", null, "nameFive")
    var nameListCheck: List<String> = nullableNameList.filterNotNull()
    println(nameListCheck)


 }

