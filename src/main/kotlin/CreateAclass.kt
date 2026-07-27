package org.example

class CreateAclass(val id: Int, var email : String)

    fun main() {
        val contact = CreateAclass(1, "abc@gmail.com")
        println(contact.email)

//       update the value of the email propert
        contact.email = "pqr@gmail.com"
        println(contact.email)
    }
