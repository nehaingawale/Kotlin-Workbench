package org.example

data class DataClass (
    val name : String,
    val age : Int
)

fun main() {
    val student = DataClass("Neha", 26)
    println(student)
}
