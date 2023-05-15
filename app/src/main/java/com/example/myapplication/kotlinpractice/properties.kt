package com.example.myapplication.kotlinpractice

import java.lang.AssertionError
import javax.security.auth.Subject

fun main() {
    val rectangle = Box(2, 4)
    rectangle.area
    println("length:${rectangle.length}, bredth:${rectangle.bredth} is ${rectangle.area}")
    val p1 = PersonNamEAndAge("Uppercase ", 22)
    println("${p1.age},${p1.name}")
    p1.age = -123
    println(p1.name)
}

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "Londen"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    return result
}

class Box(val length: Int, val bredth: Int) {
    val area: Int
        get() = this.length * this.bredth
}

private var _table: Map<String, Int>? = null
const val SUBSYSTEM_DEPRECATED: String = "This system is deprecated"

class PersonNamEAndAge(namePara: String, agePara: Int) {
    var name: String = namePara
    get() {
     return field.uppercase()
    }
    var age: Int = agePara
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Age can't be negative")
            }
        }
    var email: String = ""
        get() = field
        set(value) {
            field = value
        }
}
