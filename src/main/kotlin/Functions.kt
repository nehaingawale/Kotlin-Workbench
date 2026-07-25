package org.example

import javax.annotation.processing.Messager


fun sum(x : Int, y : Int) : Int {
    return x + y
}

fun printMsgWithPrefix(message: String, prefix: String){
    println("[$prefix] $message")
}
fun main() {
    println(sum(29, 56))

    printMsgWithPrefix(prefix = "Log", message = "Hello")
}