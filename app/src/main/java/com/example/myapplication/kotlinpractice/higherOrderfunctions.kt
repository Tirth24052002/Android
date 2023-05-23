package com.example.myapplication.kotlinpractice

fun main() {
    val itemes = listOf(1, 2, 3, 4, 5)
    itemes.fold(0, { acc: Int, i: Int ->
        print("acc = $acc, i = $i")
        val result = acc + i
        println("result = $result")
        result
    })
    val joinedToString = itemes.fold("Elements:", { acc, i -> acc + "" + i })
    val product = itemes.fold(1, Int::times)
    println(joinedToString)
    println(product)

    val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
    val twoParameters: (String, Int) -> String = repeatFun

    fun runTrasformation(f: (String, Int) -> String): String {
        return f("Hello", 3)
    }

    val result = runTrasformation(repeatFun)
    println(result)

    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus.invoke("Hello,", "World!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3))

    println(compare("one", "Thirteen"))

    html{
        body()
    }

}

class HTML {
    fun body() {}
}
fun html(init: HTML.() -> Unit): HTML{
    val html = HTML()
    html.init()
    return html
}

fun compare(a: String, b: String): Boolean = a.length < b.length

class IntTransformer : (Int) -> Int {
    override fun invoke(p1: Int): Int = TODO()
}

val intFunction: (Int) -> Int = IntTransformer()
val a = { i: Int -> i + 1 }

fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}