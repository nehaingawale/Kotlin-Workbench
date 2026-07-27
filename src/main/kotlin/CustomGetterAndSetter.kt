package org.example

class CustomGetterAndSetter {

    var age = 0
        set(value)  {
            if (value >= 0) {
                field = value
            } else {
                println("Invalid age")
            }
        }

    var name = "neha"
        get() {
            return field.uppercase()
        }
    }

    fun main() {
        val student = CustomGetterAndSetter()
        student.age = 23
        println(student.age)

        student.age = -5

        println(student.name)
    }
