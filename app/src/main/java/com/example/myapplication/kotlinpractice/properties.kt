package com.example.myapplication.kotlinpractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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
    Human()
    Human().age
    var human = Human()
    human.age.get(0)
    println(human.age.get(0))
    var changeAge = HumanBeing()
    changeAge.age = 22
    println(changeAge.age)
    var studentHobby = Student()
    studentHobby.addHobby("Cricket")
    studentHobby.addHobby("Football")
    studentHobby.addHobby("Badminton")
    println(studentHobby.hobbies)
    println(studentHobby.hobbies.isEmpty())
//    studentHobby.hobbies.remove("Cricket")
//    println(studentHobby.hobbies)
    Z().printX()
    Country().setup()
    var area = pi * 4 * 4
    println(area)
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

class Human {
    private var _age: MutableList<Int> = mutableListOf(3, 33, 12, 123, 55)
    val age: List<Int> get() = _age
    fun addElement() {
        _age.add(2)
    }
//    var age = 60
//        get() {
//            println("Age is: $field")
//            return field
//        }
//    var name: String = "Ramesh"
//    val isOld: Boolean
//        get() = age >= 50
}

class HumanBeing {
    private var _age: Int = 0
    var age: Int
        get() {
            return _age
        }
        set(value) {
            _age = value
        }
}

class Student {
    private val _hobbies = mutableListOf<String>()
    public val hobbies: List<String>
        get() = _hobbies

    fun addHobby(hobbyName: String) {
        _hobbies.add(hobbyName)
    }
}
var helloWorld = object {
    val hello = "Hello"
    val world = "World"
    override fun toString() = "$hello $world"
}
open class X(x: Int) {
    public open val y: Int = x
}
class Z {
    private fun getObject() = object {
        val x: String = "x"
    }
    fun printX() {
        println(getObject().x)
    }
}
interface P {
    fun funFromP() {}
}
interface Q
class R {
    fun getObject() = object {
        val x: String = "x"
    }
    fun getObjectP() = object: P {
        override fun funFromP() {
            val x: String = "x"
        }

        fun getObjectQ(): Q = object: P, Q {
            override fun funFromP() {
                val x: String = "x"
            }
        }
    }
}
class Country {
    lateinit var name: String
    fun setup() {
        name = "India"
        println("The name of Country is $name")
    }
}
val pi: Float by lazy {3.14f}