package org.example

class MultipleObject {

    var name = ""
    var age = 0

    fun display() {
        println("Name : $name")
        println("Age : $age")
        println()
    }
}

fun main() {
    val student1 = MultipleObject()
    student1.name = "Neha"
    student1.age = 23

    val student2 = MultipleObject()
    student2.name = "Prashaant"
    student2.age = 28

    student1.display()
    student2.display()
}