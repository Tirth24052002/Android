package com.example.myapplication.kotlinpractice

import kotlin.math.sign

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.get(0))
    println(numbers[2])
    println(numbers.getOrNull(5))
    println(numbers.getOrElse(5, { it }))

    val rangeNumbers = (0..10).toList()
    println(rangeNumbers.subList(3, 6))

    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))

    println(numbers.indexOfFirst { it % 2 == 1 })
    println(numbers.indexOfFirst { it > 4 })

    val number = mutableListOf("one", "two", "three", "four", "five", "six")
    number.sort()
    println(number)
    println(number.binarySearch("two", 0, 2))
    number[3] = "Insert"
    println(number)


    val productList = listOf(
        Product("Webstorm", 43.0),
        Product("AppCode", 33.4),
        Product("DotTrace", 123.3),
        Product("Resharper", 149.0)
    )

    println(
        productList.binarySearch(
            Product("AppCode", 33.4),
            compareBy<Product> { it.price }.thenBy { it.name })
    )

    println(productList.binarySearch { priceComparison(it, 149.0) })

    val numbersz = mutableListOf("one", "two", "three", "four")
    numbersz.sort()
    println(numbersz)
    numbersz.sortDescending()
    println(numbersz)
    numbersz.sortBy { it.length }
    println(numbersz)
    numbersz.sortByDescending { it.last() }
    println(numbersz)
    numbersz.sortWith(compareBy<String> { it.length }.thenBy { it })
    println(numbersz)
    numbersz.shuffle()
    println(numbersz)
    numbersz.reverse()
    println(numbersz)
    numbersz.reversed()
    println(numbersz)
    val listOfNumbers = listOf("one" to 1 , "two" to 2 , "three" to 3 , "four" to 4, "four" to 4)
    println(listOfNumbers.groupBy { it.second})
}
data class Product(val name: String, val price: Double)
fun priceComparison(product: Product, price: Double) = sign(product.price - price).toInt()