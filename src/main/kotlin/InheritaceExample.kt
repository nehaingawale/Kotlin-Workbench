package org.example

open class InheritaceExample {
    var name = ""

    fun walk() {
        println("$name is walking")
    }
}

class Student : InheritaceExample() {
    fun study() {
        println("$name studying kotlin")
    }
}

fun main() {
    val student = Student()
    student.name = "Neha"

    student.walk()
    student.study()
}