package com.example.myapplication.kotlinpractice

import kotlin.random.Random

fun main() {
    Perso("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }

    val alice = Perso("Alice", 22, "Amsterdam")
    println(alice)
    println(alice.moveTo("London"))
    println(alice.incrementAge())
    println(alice.editName("alice"))
    println(alice)

    val str = "Hello"
    str.run {
        println("The string's length: ${this.length}")
    }
    str.let {
        println("The string length is ${it.length}")
    }

    val admin = Perso("Adam").apply {
        this.age = 22
        this.city = "London"
    }
    println(admin)

    fun getRandomInt(): Int {
        return Random.nextInt(100).also { value ->
            writeToLog("getRandomInt() generated value $value")
        }
    }

    val i = getRandomInt()
    println(i)

    val numberList = mutableListOf<Double>()
    numberList.also { println("Population the List") }
        .apply {
            add(2.11)
            add(3.14)
            add(1.00)
        }
        .also {
            println("Sorting the list")
        }
        .sort()
    println(numberList)

    fun getRandomInts(): Int {
        return Random.nextInt(100).also {
            writeToLog("getRandomInt() generated value is $it")
        }
    }

    val p = getRandomInts()

    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count { it.endsWith("e") }
    }
    println("The are $countEndsWithE elements that end with e")

    with(numbers) {
        val firstItem = first()
        val lastItem = last()
        println("FirstItem :$firstItem, last item: $lastItem")
    }

    val resiltList = numbers.map { it.length }.filter { it > 3 }
    println(resiltList)
    numbers.map { it.length }.filter { it > 3 }.let { println(it) }
    numbers.map { it.length }.filter { it > 3 }.let(::println)

    val stri: String? = "Hello!"
    val length = stri?.let {
        println("let called in $it")
        it.length
    }

    val modifiedFirstItem = numbers.first().let {
        firstitem -> println("The first item of the list is $firstitem")
        if(firstitem.length >= 5) firstitem else "!" + firstitem + "!"
    }.uppercase()
    println("First item after modifications: $modifiedFirstItem")

    with(numbers) {
        println("'with' is calles with argument $this")
        println("It contains $size elements")
    }

    val firstAndLast = with(numbers) {
        "The first element is ${first()}" +
                "The last element is ${last()}"
    }
    println(firstAndLast)

    val service = MultiportService("https://example.kotlinlang.org", 80)
    val result = service.run {
        port = 8080
        query(prepareRequest() + "to port $port")
    }
    val letResult = service.let {
        it.port = 8080
        it.query(it.prepareRequest() + "to port ${it.port}")
    }
    println(result)
    println(letResult)

    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"
        Regex("[$sign]?[$digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+123 -FFF !%*& 88 XYZ")) {
        println(match.value)
    }

    val adam = Perso("Adam").apply {
        age = 21
        city = "London"
    }
    println(adam)

    numbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")
}
class MultiportService(var url: String,var port: Int) {
    fun prepareRequest():String = "Default request"
    fun query(request: String): String = "Result for query $request"
}

fun writeToLog(message: String) {
    println("INFO: $message")
}

data class Perso(var name: String, var age: Int = 0, var city: String = "") {
    fun moveTo(newCity: String) {
        city = newCity
    }

    fun incrementAge() {
        age++
    }

    fun editName(editedName: String) {
        name = editedName
    }
}