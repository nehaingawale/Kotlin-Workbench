package org.example

open class PersonUsingSuperKey  {

    open fun display() {
        println("This is Person")
    }
}

class Student1 : PersonUsingSuperKey() {

    override fun display() {

        super.display()

        println("This is Student")
    }
}

fun main() {

    val student = Student1()

    student.display()
}