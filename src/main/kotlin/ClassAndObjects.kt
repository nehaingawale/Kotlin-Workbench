package org.example

class ClassAndObjects {
    var name = "Neha"
    var age = 27

    // Member function
    fun study() {
        println("Study")
    }
}

fun main() {
    val student = ClassAndObjects()
    println(student.name)
    println(student.age)

    student.study()
}