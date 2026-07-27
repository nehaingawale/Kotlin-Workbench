package org.example

fun main() {

    // For loop
    for (i in 1..10){
        println(i)
    }

    println("---------")

    // While loop
    var i=1
    while(i<=5){
        println(i)
        i++
    }

    println("---------")

    // do-while loop
    do{
        println(i)
        i++
    }while(i<=5)

    // break
    for(i in 1 .. 10)
    {
        if(i == 5)
            break
        println(i)
    }

    // continue
    for ( i in 1..5)
    {
        if (i == 3)
            continue
        println(i)
    }

    // labels
    outer@ for (i in 1..3)
    {
        for (j in 1..3){
            if (j==2)
                break@outer
            println("$i, $j")
        }
    }

}