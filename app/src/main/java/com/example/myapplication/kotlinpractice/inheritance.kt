package com.example.myapplication.kotlinpractice

import android.content.Context
import android.util.AttributeSet
import android.view.View
import java.util.jar.Attributes.Name

fun main() {
    println("Hello there!")
    Derived("Hello", "World")
    val fr = FilledRectangle()
    fr.draw()
    fr.Filler()
    fr.Filler().fill()
    fr.Filler().drawAndFill()
    var lion = Lion()
    lion.AnimalType()
    println(Example().nameOne)
    Example().getName()

}

class MyView : View {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}

open class ShapeOne {
    open val vertexCount: Int = 0
    open fun draw() {
        println("This function is drawing")
    }

    fun fill() {
        println("This function is filling the shape")
    }
}

class Circle : ShapeOne() {
    override val vertexCount = 4
    override fun draw() {
        super.draw()
        println("The drawing function is override")
    }
}

interface ShapeTwo {
    val vertexCount: Int
}

class Hexagon(override val vertexCount: Int = 6) : ShapeTwo
class Octagon : ShapeTwo {
    override val vertexCount: Int = 8
}

open class Base(val name: String) {
    init {
        println("Initialization a base class ")
    }

    open val size: Int = name.length.also { println("Intializing size in the base class: $it") }
}

class Derived(
    name: String,
    val lastName: String,
) : Base(name.replaceFirstChar { it.uppercase() }
    .also { println("Argument for the base class: $it") }) {
    init {
        println("Initializing a derived class")
    }

    override val size: Int =
        (super.size + lastName.length).also { println("Initalizing size in derived class ") }
}

open class RectangleOne {
    open fun draw() {
        println("drawing the rectangle")
    }

    val borderColor: String get() = "black"
}

class FilledRectangle : RectangleOne() {
    override fun draw() {
        super.draw()

        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor

    inner class Filler {
        fun fill() {
            println("Filling from inner class")
        }

        fun drawAndFill() {
            super@FilledRectangle.draw()
            fill()
            println("Drawing and filled with color${super@FilledRectangle.borderColor}")
        }
    }
}

open class Zoo {
    open fun AnimalType() {
        println("The animal type function is called")
    }
}

interface TypeofAnimal {
    fun AnimalType() {
        println("The wild animal type function is called")
    }
}

class Lion : Zoo(), TypeofAnimal {
    override fun AnimalType() {
        super<Zoo>.AnimalType()
        super<TypeofAnimal>.AnimalType()
    }
}
class Example {
    var nameOne = "Tirth"
    fun getName( nameOne: String? = "Ankit") {
        this.nameOne = nameOne.toString()
        println("${this.nameOne}")

    }
}