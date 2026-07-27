package org.example

class ConstructorWithInitBlock(var name : String, var age : Int) {
    init {
        println("Student object created")
    }
        fun display() {
            println("Name: $name")
            println("Age: $age")
        }

    fun main() {
        val student = ConstructorWithInitBlock("Ajay", 29)
        student.display()
    }
}