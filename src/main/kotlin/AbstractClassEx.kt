package org.example

abstract class AbstractClassEx {

        abstract fun work()

        fun login() {
            println("Login Successful")
        }
    }

    class Developer : AbstractClassEx() {

        override fun work() {
            println("Developer is writing Kotlin code")
        }
    }

    fun main() {

        val developer = Developer()

        developer.login()

        developer.work()
    }
