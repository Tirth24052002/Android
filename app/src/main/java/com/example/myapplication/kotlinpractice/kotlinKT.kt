package com.example.myapplication.kotlinpractice

fun main() {
    //1.)Lambadas are inline functions!!!!
    //no lamdas are not inline function
    //function that takes closure as argument

    //2.) Sealed keyword not understood
    //Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance.

    //3.)Data class not understood
    //It is not unusual to create classes whose main purpose is to hold data. In such classes, some standard functionality and some utility functions are often mechanically derivable from the data. In Kotlin, these are called data classes and are marked with data

    //4.) Interfaces can not have private methods!!
    // Private method can be made in java  but it's must contain the body. the private method cannot be overrided.
    GetRequirements().name("Some")

    //5.)Kotlin interfaces can not have method definitions
    //Kotlin interfaces can have method implementation and if the implementation is given than it
    //will not be complusory to implement in the class in which it is implemented

    //6.)Declaration and deification diff not known
    // Declaration means that the variable is only declared and the memory is allocated but the value is not set.
    // Definition means the variables has been initialized

    //7.)Method and function diff not know
    //function:  It is called by its own name/independently.
    //As it is called independently it means the data is passed explicitly or externally.
    //Method: It is called by its object’s name/referenced.
    //As it is called dependently which means the data is passed implicitly or internally.

    //8.)Kotlin does not have exceptions it has error handling
    //exception handlin is there in kotlin error handling is not possible in any case

    //9.) Kotlin have checked exceptions!!!
    //Kotlin does not have any checked exception

    //10.) Else not understood in when
    //The else branch is evaluated if none of the other branch conditions are satisfied.
    val day = "SomeDay"
    when(day) {
        "Friday" -> println("Today is last working day")
        "Saturday" -> println("Thoday is Weekend")
        "Sunday" -> println("Today is the rest day")
        "Monday" -> println("The first working day")
        "Tuesday" -> println("The work continues")
        "Wednesday" -> println("The Wednesday it is")
        "Thursday" -> println("The day is thursday")
        else -> println("Enter the valid day name")
    }
}

interface requirements {
    fun name(perssonName:String)
    private fun personId(perId: Int) {
        println("The id of person is $perId")
    }
    fun perAge(age: Int) {
        println("The age of person is $age")
    }
}
class GetRequirements: requirements {
    override fun name(perssonName: String) {
         println("The name of person is $perssonName ")
    }

}