package org.example

import javax.annotation.processing.Messager


fun sum(x : Int, y : Int) : Int {
    return x + y
}

fun printMsgWithPrefix(message: String, prefix: String){
    println("[$prefix] $message")
}
fun greet(name : String)
{
    println("Hello $name")
}

fun roll(rollNo : Int)
{
    println("My Roll no is: $rollNo")
}

fun add(a:Int, b:Int) : Int {
    return a+b
}
fun square(x : Int) = x * x

fun main() {
    println(sum(29, 56))
    printMsgWithPrefix(prefix = "Log", message = "Hello")
    greet("Neha")
    roll(36)
    println(add(10, 20))
    println(square(5))
}
