package com.example.myapplication.kotlinpractice

fun main() {

    //Map
    val setOfNum = setOf(1, 2, 3, 54, 6, 634)
    println(setOfNum.map { it % 2 == 0 })
    println(setOfNum.map { it * 3 })
    println(setOfNum.mapIndexed { index, value -> index * value })

    println(setOfNum.mapNotNull { if (it == 2) null else it * 3 })
    println(setOfNum.mapIndexedNotNull { index, value -> if (index == 1) null else value * index })

    val numMap = mapOf("key" to 1, "Key2" to 2, "Key3" to 3, "key11" to 4)
    println(numMap.mapKeys { it.key.uppercase() })
    println(numMap.mapValues { it.value + it.key.length })

    //Zip
    val colors = listOf("Red", "Yellow", "Blue", "Orange")
    val animals = listOf("fox", "cow", "Ox", "Zebra")
    println(colors.zip(animals))
    val twoAnimals = listOf("fox", "bear")
    println(colors.zip(twoAnimals))

    println(colors.zip(animals) { colors, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $colors" })

    val numPair = listOf("onwe" to 1, "Two" to 2, "Three" to 3, "Four" to 4)
    println(numPair.unzip())

    val strNo = listOf("one", "Two", "Three", "Four")
    println(strNo.associateWith { it.length })
    println(strNo.associateBy { it.first().uppercaseChar() })
    println(
        strNo.associateBy(
            keySelector = { it.first().uppercaseChar() },
            valueTransform = { it.length })
    )

    val numberSets = listOf(setOf(1, 3, 4 ), setOf(5 ,6 , 7), setOf(8,9))
    println(numberSets.flatten())

    val number = listOf("one", "Two", "Three", "Four")
    println(number)
    println(number.joinToString())

    val listString = StringBuffer("The list of numbers")
    number.joinToString(listString)
    println(listString)

    println(number.joinToString(separator = "|", prefix = "start:", postfix = ": end"))

    val num = (1..100).toList()
    println(num.joinToString(limit = 10, truncated = "..."))

    println(number.joinToString { "Element: ${it.uppercase()}" })

    //Filter
    val longerthan2 = number.filter { it.length > 2 }
    println(longerthan2)

    val numberMap = mapOf("Key1" to 1, "Key2" to 2, "key3" to 3, "Key11" to 11)
    val filterMap = numberMap.filter { (key, value) -> key.endsWith("1") && value > 10}
    println(filterMap)

    val filterIdx = number.filterIndexed { index, s -> (index != 0) && (s.length) < 5  }
    val filterNot = number.filterNot { it.length <= 3 }

    println(filterIdx)
    println(filterNot)

    val numberNull = listOf(null, 1, "two", 1.123, "four")
    println("All string elements in upper case")
    numberNull.filterIsInstance<String>().forEach {
        println(it.uppercase())
    }
    println(numberNull)

    //Partition
    val (match, rest) = number.partition { it.length > 3 }
    println(match)
    println(rest)

    println(number.any { it.endsWith("e") })
    println(number.none { it.endsWith("a") })
    println(number.all { it.endsWith("e") })

    println(emptyList<Int>().all { it > 5})

    val empty = emptyList<String>()
    println(number.any())
    println(empty.any())
    println(number.none())
    println(empty.none())

    val numerStr = listOf("One", "Two", "Three", "Four", "Five")
    val addSix = numerStr + "Six"
    println(addSix)
    val minusList = addSix - listOf("One", "Three")
    println(minusList)

    //Groping
    println(number.groupBy { it.first().uppercase() })
    println(number.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()} ))
    println(number.groupBy { it.first()})

    //Slice
    println(number.slice(1..3))
    println(number.slice(0..3 step 2))
    println(number.slice(setOf(3, 0)))

    //Take and Drop
    println(number.take(2))
    println(number.takeLast(1))
    println(number.drop(1))
    println(number.dropLast(3))

    val strNum = listOf("one", "two", "three", "four", "five", "six")
    println(strNum.takeWhile { !it.startsWith('f') })
    println(strNum.takeLastWhile { it != "three" })
    println(strNum.dropWhile { it.length == 3 })
    println(strNum.dropLastWhile { it.contains('i') })

    //Chunked
    val  rangeNum = (0..13).toList()
    println(rangeNum.chunked(3))
    println(rangeNum.chunked(3) {it.sum()})

    //Windowed
    println(strNum.windowed(3))
    println(rangeNum.windowed(3, step = 2, partialWindows =  true))
    println(rangeNum.windowed(3) {it.sum()})

    println(strNum.zipWithNext())
    println(strNum.zipWithNext() {s1, s2 -> s1.length > s2.length})

    val no = linkedSetOf("one", "two", "three", "four")
    println(no.elementAt(2))
    println(no.first())
    println(no.last())
    println(no.elementAtOrNull(5))
    println(no.elementAtOrElse(5) {index -> "The value for $index is not defined"})
    println(no.first { it.length > 3 })
    println(no.last { it.startsWith("f") })
    println(no.firstOrNull{ it.length >6 })

    val list = listOf(0, "true", false)
    val longEnough = list.firstNotNullOf { item -> item.toString().takeIf { it.length > 4 } }
    println(longEnough)
    println(no.random())
    println(no.contains("one"))
    println("one" in strNum)
    println(strNum.containsAll(listOf("one", "three")))
    println(no.isEmpty())
    println(no.isNotEmpty())
    println(empty.isEmpty())
    println(empty.isNotEmpty())

    println(listOf("aaa", "bb", "c").sortedWith(compareBy { it.length  }))
    println(strNum.sorted())
    println(strNum.sortedDescending())
    println(strNum.sortedBy { it.length })
    println(strNum.sortedByDescending { it.last() })
    println(strNum.sortedWith(compareBy { it.length }))
    println(strNum.reversed())
    println(strNum.asReversed())

    val lineList = mutableListOf("one", "two", "three", "four")
    val reversedNumber = lineList.asReversed()
    println(reversedNumber)
    lineList.add("five")
    println(reversedNumber)
    println(lineList.shuffled())

    //Aggreate Operations
    val nums = listOf(1, 2 ,4 ,5)
    println(nums.count())
    println(nums.maxOrNull())
    println(nums.minOrNull())
    println(nums.average())
    println(nums.sum())

    println("___________")
    val minthreeRim = nums.minByOrNull { it % 3 }
    println(minthreeRim)
    val logestString = strNo.maxWithOrNull(compareBy { it.length })
    println(logestString)
    println(nums.sumOf { it * 2 })
    println(nums.sumOf { it.toDouble() / 2 })
    println()

    val simeplSum = nums.reduce { sum, element -> sum + element }
    println(simeplSum)
    val sumDoubled = nums.fold(100) { sum, element -> sum + element * 2}
    println(sumDoubled)

    val sumDoubleRight = nums.foldRight(10) { elemenet, sum -> sum + elemenet}
    println(sumDoubleRight)

    val sumEven = nums.foldIndexed(0) { idx, sum, element -> if(idx % 2 == 0) sum + element else sum  }
    println(sumEven)

    val sumEvenRight = nums.foldRightIndexed(0) { idx, element, sum -> if (idx % 2 ==0) sum + element else sum }
    println(sumEvenRight)

    val runReduceSUm = nums.runningReduce { sum, item -> sum + item  }
    println(runReduceSUm)
    val runningfoldsum = nums.runningFold(10) { sum , item -> sum + item }
    println(runningfoldsum)

    val numberlist = mutableListOf(1 ,2 , 3, 4, 5)
    println(numberlist.retainAll { it >= 1 })
    numberlist.add(22)
    println(numberlist)
    println()
    println(numberlist.clear())


}