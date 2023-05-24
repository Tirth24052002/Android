package com.example.myapplication.kotlinpractice

fun main() {
    val num = mutableListOf("one", "two", "three", "four")
    println(num.size)
    println(num.get(2))
    println(num[2])
    println()
    num.add(4,"five")
    println(num)

    var cars = listOf("Buggati", "Ferrari", "Masarati", "Ford")
    printAll(cars)
    printAll(num)

    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWOrds = mutableListOf<String>()
    words.getShortWordsTo(shortWOrds, 3)
    println(shortWOrds)

    var numerList = mutableListOf(1, 2, 3, 4 ,5 , 12, 33)
    println(numerList.size)
    println(numerList.add(22))
    numerList.shuffle()
    println(numerList)
    numerList[0] = 0
    println(numerList)
    println(numerList.removeAt(2))
    println(numerList)

    var setNum = setOf<Int>(1, 2, 4, 5 , 12, 1 ,2 )
    println(setNum)
    println(setNum.size)
    println(setNum.last())
    println(setNum.first())

    val numMap = mapOf("key1" to 1, "key2" to 2, "key3 " to 3, "key4" to 4)
    println(numMap.keys)
    println(numMap.values)
    println(numMap.containsValue(1))
    println(numMap.keys)
    println(numMap)

    val numMapmutable = mutableMapOf("one" to 1, "two" to 2)
    println(numMapmutable.keys)
    println(numMapmutable.values)
    println(numMapmutable.put("Three", 3))
    println(numMapmutable)
    numMapmutable["two"] = 20
    println(numMapmutable)


    val map = buildMap {
        put("a", 1)
        put("b", 2)
        put("c", 4)
    }
    println(map.keys)
    println(map.values)
    println(map.get("c"))

    val empty = emptyArray<String>()
    println(empty.isEmpty())

    val doubled = List(3, {it * 2})
    println(doubled)

    val copy = numMapmutable.toList()
    println(copy)

    val numbers = listOf("one", "two", "three", "four")
    println(numbers.filter { it.length > 3 })

    val number = setOf(1, 2,  4)
    println(number.map { it * 3 })
    println(number.mapIndexed { idx, value -> value * idx})

    val numb = listOf("one", "Two", "three", "four")
    println(numb.associateWith { it.length })

    val numIterato = numb.iterator()
    while (numIterato.hasNext()) {
        println(numIterato.next())
    }

    numb.forEach {
        println(it)
    }
    val values = mutableListOf("one", "Two", "Three", "Four")
    val na =  values.listIterator()
    na.add("Five")
    na.forEach { println(it) }
    println(values)
}

fun printAll(strings: Collection<String>) {
    for(item in strings) {
        print(item)
        println()
    }
}

fun List<String>.getShortWordsTo(shortWOrds: MutableList<String>, maxlength: Int) {
    this.filterTo(shortWOrds) { it.length <= maxlength }
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWOrds -= articles
}
