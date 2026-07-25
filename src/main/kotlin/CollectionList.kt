package org.example

fun main() {

//  Read only list
    var readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

//  Lists are ordered so to access an item in a list, use the indexed access operator []
    println("The second item in the list is: ${readOnlyShapes[1]}")

//To get the first or last item in a list, use .first() and .last() functions respectively:
    println("The first item in the list is : ${readOnlyShapes.first()}")
    println("The last item in the list is : ${readOnlyShapes.last()}")

//  To check that an item is in a list, use the in operator:
    println("circle" in readOnlyShapes)

//  To get the number of items in a list, use the .count() function:
    println("The list has ${readOnlyShapes.count()} items")

//  Mutable list with explicit type declaration
    var shapes: MutableList<String>  = mutableListOf("triangle", "square", "circle")
    println(shapes)

//  To add or remove items from a mutable list, use .add() and .remove() functions respectively:
//   Add "pentagon to the list"
    shapes.add("pentagon")
    println(shapes)

//  Remove the first "pentagon" from the list
    shapes.remove("pentagon")
    println(shapes)




}