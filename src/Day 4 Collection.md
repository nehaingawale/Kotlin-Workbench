#Colllection

List : Lists store items in the order that they are added, and allow for duplicate items.
   To create a read-only list (List), use the listOf() function.
   To create a mutable list (MutableList), use the mutableListOf() function.
   Lists are ordered so to access an item in a list, use the indexed access operator []
   To get the first or last item in a list, use .first() and .last() functions respectively:
   To check that an item is in a list, use the in operator:
   To get the number of items in a list, use the .count() function:

Mutable list : To add or remove items from a mutable list, use .add() and .remove() functions respectively:


Set : Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.
   To create a read-only set (Set), use the setOf() function.
   To create a mutable set (MutableSet), use the mutableSetOf() function.
   To get the number of items in a set, use the .count() function:
   To check that an item is in a set, use the in operator:
   As sets are unordered, you can't access an item at a particular index.


Map : Maps store items as key-value pairs. You access the value by referencing the key.
   Every key in a map must be unique so that Kotlin can understand which value you want to get.
   You can have duplicate values in a map.
   To create a read-only map (Map), use the mapOf() function.
   To create a mutable map (MutableMap), use the mutableMapOf() function.
   To access a value in a map, use the indexed access operator [] with its key:
   You can also use the indexed access operator [] to add items to a mutable map:
   To remove items from a mutable map, use the .remove() function:
   To get the number of items in a map, use the .count() function:
   To check if a specific key is already included in a map, use the .containsKey() function:
   To obtain a collection of the keys or values of a map, use the keys and values properties respectively:
   To check that a key or value is in a map, use the in operator:








