package com.example.myapplication.kotlinpractice

fun main() {
    val numbers = sequenceOf("four", "three", "two", "one")
    val numberSequeces = numbers.asSequence()

    val oddNumbers = generateSequence(1) { it + 2}
    println(oddNumbers.take(7).toList())

    val oddNolessthanTen = generateSequence(1) { if (it < 10) it + 2 else null }
    println(oddNolessthanTen.count())

    val oddNumber = sequence { yield(1)
    yieldAll(listOf(3, 5))
    yieldAll(generateSequence(7){ it + 2 })}
    println(oddNumber.take(5).toList())

    val worlds = "The quick brown fox jumps over the lazy dog".split(" ")
    val lengthsList = worlds.filter { println("filterL: $it"); it.length> 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(4)
    println("Length of first 4 words longer than 3 chars:")
    println(lengthsList)

    val word = "The quick brown foc jumps over the lazy dog".split(" ")
    val wordsSeq = word.asSequence()

    val lengthsSequence = wordsSeq.filter { println("filter: $it"); it.length > 3   }
        .map { println("length: ${it.length}"); it.length }
        .take(4)

    println("Length of first 4 words longer than 3 chars")
    println(lengthsSequence.toList())
}