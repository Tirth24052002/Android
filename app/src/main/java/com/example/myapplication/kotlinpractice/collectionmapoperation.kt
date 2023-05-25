package com.example.myapplication.kotlinpractice

fun main() {

    var numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3, "key11" to 11)

    println(numbersMap.get("one"))
    println(numbersMap["one"])
    println(numbersMap.getOrDefault("four", 10))
    println(numbersMap["five"])
    println(numbersMap.keys)
    println(numbersMap.values)

    val filterMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10 }
    println(filterMap)

    val filteKeysMap  = numbersMap.filterKeys { it.endsWith("1") }
    println(filteKeysMap)
    val filterValueMap = numbersMap.filterValues { it < 10 }
    println(filterValueMap)

    println(numbersMap + Pair("four", 4))
    println(numbersMap + Pair("one", 10))
    println(numbersMap + mapOf("five" to 5, "one" to 11))
    println(numbersMap - "one")
    println(numbersMap - listOf("two", "three"))

    val numMap = mutableMapOf("one" to 1, "two" to 2 )
    numMap.put("three", 3 )
    println(numMap)
    numMap.putAll(setOf("four" to 4 , "five" to 5))
    println(numMap)
    val previousValue = numMap.put("one", 11)
    println(previousValue)

    val mutMap = mutableMapOf("one" to 1 , "two" to 2)
    numMap["three"] = 3
    mutMap += mapOf("four" to 4 , "three" to 3 )
    println(mutMap)

    mutMap.remove("one")
    println(mutMap)
    mutMap.remove("two", 4)
    println(mutMap)

    mutMap -= "two"
    println(mutMap)
    mutMap -= "five"
    println(mutMap)
}