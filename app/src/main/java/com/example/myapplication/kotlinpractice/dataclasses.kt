package com.example.myapplication.kotlinpractice


fun main() {
    val me = PersonDetails("Anil", "Patel")
    me.gender = "Male"
    println(me)

    val copyOfME = me.copy(lastName = "parmer")
    val (fname, lname) = copyOfME
    println("$fname $lname")

    val person1 = PersonData("Jim")
    person1.age = 12
    val person2 = PersonData("Jim")
    person2.age = 12
    println("person == person2: ${person1 == person2} ")

    val jack = user("jack", 22)
    val otherJack = jack.copy(age = 26)

    val jimmy = user("jimmy", 33)
    val (age, x) = jimmy
    println(" $age years of age")
}

data class PersonDetails(val firstName: String, val lastName: String) {
    var gender: String? = null
}

data class user(val name: String, val age: Int)
data class PersonData(val name: String) {
    var age: Int = 0
}
//fun copy(name: String = this.name, age: Int = this.age) = user(name, age)
data class NameAndAgeOfPerson(val name: String? = "Tirth", val Age: Int)