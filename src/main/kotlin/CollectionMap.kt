package org.example

fun main() {
//    Real only map
    val readOnlyJuiceMenu = mapOf("Apple" to 100, "Banana" to 100, "Orange" to 199, "Kiwi" to 190, "Cherry" to 199, "Kiwi" to 190)
    println(readOnlyJuiceMenu)

//    Mutable map with explicit type declaration
    val juiceMenu : MutableMap<String, Int> = mutableMapOf("Apple" to 100, "Banana" to 100, "Orange" to 199, "Kiwi" to 190, "Cherry" to 199, "Kiwi" to 190)
    println(juiceMenu)

//    To access a value in a map, use the indexed access operator [] with its key:
    println("The value of apple juice is : ${readOnlyJuiceMenu["Kiwi"]}")

//  You can also use the indexed access operator [] to add items to a mutable map:
    juiceMenu["Coconut"] = 150
    println(juiceMenu)

//  To remove items from a mutable map, use the .remove() function:
    juiceMenu.remove("Orange")
    println(juiceMenu)

//  To get the number of items in a map, use the .count() function:
    println("The total number of juice menu is : ${readOnlyJuiceMenu.count()}")

//  To check if a specific key is already included in a map, use the .containsKey() function:
    println(readOnlyJuiceMenu.containsKey("Kiwi"))

//  To obtain a collection of the keys or values of a map, use the keys and values properties respectively:
    println(readOnlyJuiceMenu.keys)
    println(readOnlyJuiceMenu.values)

//  To check that a key or value is in a map, use the in operator:
    println("Kiwi" in readOnlyJuiceMenu.keys)
    println("Kiwi" in readOnlyJuiceMenu)
    println(200 in readOnlyJuiceMenu.values)
}

