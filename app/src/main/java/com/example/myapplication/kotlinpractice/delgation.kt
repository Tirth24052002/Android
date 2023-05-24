package com.example.myapplication.kotlinpractice

interface BasePrint {
    val message: String
    fun printMessage()
    fun printMessageLine()
}

class BaseImpl(val x: Int): BasePrint {
    override val message = "BaseImpl: x = $x"
    override fun printMessage() {
         println(x)
    }

    override fun printMessageLine() {
         println(x)
    }
}
class DerivedClass(b: BasePrint): BasePrint by b {
    override fun printMessage() {
        println("abc")
    }

    override val message = "Message of Derived"
}

interface Engine {
    fun runOn()
    fun getTransmissionType()
}
class ElectricEngine: Engine {
    override fun getTransmissionType() {
        println("This is automatic engine")
    }

    override fun runOn() {
         println("This car works on Electric engine")
    }
}
class TeslEngine(val engine: Engine): Engine by engine{
    override fun getTransmissionType() {
         println("The transmission is automatic type")
    }
}
fun main() {
     var stEn = TeslEngine(ElectricEngine())
    stEn.getTransmissionType()
    stEn.runOn()
    val b = BaseImpl(10)
    DerivedClass(b).printMessage()
    DerivedClass(b).printMessageLine()
    println(DerivedClass(b).message)
}