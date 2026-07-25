package org.example

fun main() {
    val age = 20;

    //if statement
    if(age >= 18)
        println("Eligible")

    // if-else
    val marks = 45;

    if (marks >= 35 )
        println("Pass")
    else
        println("Fail")

    //else-if multiple condition check

    //When alternative to switch
    val day = 10;
    when(day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid")
    }
}