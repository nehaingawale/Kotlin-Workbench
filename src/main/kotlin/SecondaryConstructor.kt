package org.example

class SecondaryConstructor {
    var name = ""
    var age = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun display() {
        println("Name : $name")
        println("Age : $age")
    }
}

fun main() {
    val student = SecondaryConstructor("Nita", 34)
    student.display()
}