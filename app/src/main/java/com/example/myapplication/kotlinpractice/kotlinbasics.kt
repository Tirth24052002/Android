package com.example.myapplication.kotlinpractice

import android.provider.Telephony.MmsSms.PendingMessages

fun println(
    vararg messages: Any?,
    seperator: String = " ",
    terminator: String = "\n"
) {
    messages.forEach {
        print(it)
        print(seperator)
    }
    print(terminator)
}
fun main() {
    print("Hello World!")
    val countOfEvenNumbers: Int = 10
    val sumOfNumber = 0
    var countOfPrimeNumbers: Int
    countOfPrimeNumbers = 3
    countOfPrimeNumbers = 24
    val myByte: Byte = 10
    val myShort: Short = 125

    val myInt = 3000
    val myLong = 3000L

    val myFloat = 123.45f
    val myDouble = 321.45

    val hundredThousand = 100_000
    val oneMillion = 1_000_000

    val aTrueValue = true

    val letterChar = 'K'
    val digitalChar = '1'

    var basicKotlin = "Basic Kotlin"

    var number = arrayOf(1, 2, 3, 4, 5)
    var colors = arrayOf("red", "blue", "pink", "yellow")

    var myCharArray = charArrayOf('k', 'o', 't', 'i', 'n')
    var myIntArray = intArrayOf(1, 3, 5, 7, 9, 11)

    val numbersArray = Array(8, { i -> i * 2 })

    val firstWord = "Learn"
    val secondWord = "Kotlin"
    val bothWords = "$firstWord $secondWord"
    println(bothWords)
    println("$bothWords has ${bothWords.length} words")
    println(""""$bothWords" has ${bothWords.length}""")
    val numberz = -1
    val result = if (numberz > 0) {
        "Positive Number"
    } else if (numberz < 0) {
        "Negative Number"
    } else {
        "Zero"
    }
    println(result)
    val firstValue = 6
    val secondValue = 3
    val operator = "-"
    val resultOperation = when (operator) {
        "+" -> firstValue + secondValue
        "-" -> firstValue - secondValue
        "*" -> firstValue * secondValue
        "/" -> firstValue / secondValue
        else -> "$operator operator is invalid"
    }
    println(resultOperation)
    var age = 7
    when (age) {
        in 1..18 -> print("Age is in the range")
        !in 18..110 -> print("Age id outside the range")
        else -> print("None of the above")
    }
    var sum = 234
    when (sum) {
        is Int -> println("The sum is $sum")
        else -> println("It is not an Int")
    }
    for (index in 1..10) {
        println(index)
    }
    for (index in 12 downTo 0 step 2) {
        println(index)
    }
    var languages = arrayOf("Java", "Kotlin", "Scala", "C#")
    for (item in languages)
        println(item)
    var desserts = arrayOf("Cupcake", "Ice Cream", "Eclair", "Pie")
    for (item in desserts.indices) {
        if (desserts[item].length > 4)
            println(desserts[item])
    }
    val countries = setOf("Java", "JavaScript", "Swift")
    val neighbors = setOf("Swift", "JavaScript", "Java")
    println(countries == neighbors)
    println(countries === neighbors)

    val trainingName: String? = "Learn Kotlin in 45 minutes"
    if (trainingName != null && trainingName.isNotEmpty()) {
        print("String of length ${trainingName.length}")
    } else {
        print("Empty String")
    }
    val platform: String? = null
    val language = "Kotlin"

    println(platform?.length)
    println(language.length)

//    val lengthOfWord = platform!!.length
//    val numberOfLetters: Int? = lengthOfWord as? Int
    val name: String? = null
    val lengthOfName = name?.length ?: -1
    println(lengthOfName)
}