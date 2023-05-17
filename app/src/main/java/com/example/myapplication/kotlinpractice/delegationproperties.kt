package com.example.myapplication.kotlinpractice

import androidx.appcompat.app.ActionBarDrawerToggle.Delegate
import java.lang.reflect.Member
import java.sql.Ref
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main() {
    val student = Students()
    student.firstName = "Tirth"
    student.lastName = "Purohit"
    println(student.toString())

    val delegateExample = Examples()
    println(delegateExample.p)

    println(lazyValue)
    println(lazyValue)

    val user = User()
    user.name = "first"
    user.name = "second"

//    val userOne = Users(mapOf("name" to "John Doe", "age" to 25))
//    println(userOne.name)
//    println(userOne.age)
    var userTwo = MutableUser(mapOf("name" to "Vinit", "age" to 22))
    println(userTwo.age)
    println(userTwo.name)

    val downloader = VideoDownloader("Downloading file")
    val uploader = VideoUploader("uploading file")
    val filehandler = Filehandler(downloader, uploader)
    filehandler.upload()
    filehandler.download()

    val exampleDelegate = ExampleDelegate()
    exampleDelegate.m = 15
    println(exampleDelegate.n)
    val exampleTwo = ExampleDelegate()
    exampleDelegate.n = 13
}

class Students {
    var firstName: String? by NameDelegate()
    var lastName: String? by NameDelegate()
    override fun toString(): String {
        return "$firstName, $lastName"
    }
}

class NameDelegate {
    var formattedValue: String? = null

    operator fun setValue(
        thisRef: Any?, property: KProperty<*>, value: String?
    ) {
        if (value != null && value.length >= 5) {
            formattedValue = value.trim().uppercase()
        }
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String? {
        return formattedValue
    }
}

class Examples {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegation '${property.name}\' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String?) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

val lazyValue: String by lazy {
    println("computed")
    "Hello!!!"
}

class User {
    var name: String by Delegates.observable("<no name>") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

var topLevelInt: Int = 0

class ClassWithDelegate(val anotherClassInt: Int)
class MyClass(var memberInt: Int, val anotherClassInstance: ClassWithDelegate) {
    var delegatedToMember: Int by this::memberInt
    var delegatedToTopLevel: Int by ::topLevelInt
    val delegateToAnotherClass: Int by anotherClassInstance::anotherClassInt
}

var MyClass.extDelegated: Int by ::topLevelInt

//class Users(val map: Map<String, Any?>) {
//    val name: String by map
//    val age: Int by map
//}
class MutableUser(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

class Resource

class Owner {
    val valResource: Resource by ResourceDelegate()
}

class ResourceDelegate(private var resource: Resource = Resource()) {
    operator fun getValue(thisRef: Owner, property: KProperty<*>): Resource {
        return resource
    }

    operator fun setValue(thisRef: Owner, property: KProperty<*>, value: Any?) {
        if (value is Resource) {
            resource = value
        }
    }
}

interface Downloader {
    fun download()
}

interface Uploader {
    fun upload()
}

class VideoDownloader(val fileName: String) : Downloader {
    override fun download() {
        println("file name: $fileName is downloaded")
    }
}

class VideoUploader(val fileName: String) : Uploader {
    override fun upload() {
        println("file name: $fileName is uploaded")
    }
}

class Filehandler(val downloader: Downloader, val uploader: Uploader) : Downloader by downloader,
    Uploader by uploader {
}

class ExampleDelegate {
    val l: Int by lazy { 5 }

    var m: Int by Delegates.observable(0) { property, oldValue, newValue ->
        println("Old Value : $oldValue")
        println("New Value : $newValue")
    }

    var n: Int by Delegates.vetoable(12) { property, oldValue, newValue ->
        println("Old Value: $oldValue")
        println("New Value: $newValue")
        newValue > 33
    }
}