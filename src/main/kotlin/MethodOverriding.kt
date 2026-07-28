package org.example

open class MethodOverriding  {

    open fun sound() {
        println("Animal makes a sound")
    }
}

class Dog : MethodOverriding() {

    override fun sound() {
        println("Dog barks")
    }
}

fun main() {

    val dog = Dog()

    dog.sound()
}