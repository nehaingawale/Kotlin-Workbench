package org.example

class PrimaryConstructor(var name : String, var age : Int) {

    fun display() {
        println("Name : $name")
        println("Age : $age")
    }

}

fun main() {
    val student = PrimaryConstructor("Neha", 27)
    student.display()
}