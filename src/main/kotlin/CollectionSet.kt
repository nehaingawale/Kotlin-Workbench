package org.example

fun main() {
//    Read only set
    var readOnlyFruit = setOf("Apple", "Banana", "Cherry", "Cherry")
    println(readOnlyFruit)

//    Mutable set with explicit type declaration
    var fruit :MutableSet<String> = mutableSetOf("Apple", "Banana", "Cherry", "Cherry")
    println(fruit)

//  To get the number of items in a set, use the .count() function:
    println("The total number of item is set is : ${readOnlyFruit.count()}")

//    To check that an item is in a set, use the in operator:
    println("Apple" in readOnlyFruit)

//    To add or remove items from a mutable set, use .add() and .remove() functions respectively:
//    Add "Orange" in the set
    fruit.add("Orange")
    println(fruit)

//    Remove "Orange" in set
    fruit.remove("Orange")
    println(fruit)





}