# Class
    Class is blueprint for creating object

# Object
    Object is an instace of a class

# Member Function
    Means function inside a class


## Constructor :-
                A Constructor is a special part of a class that runs automatically when an object is created
1] Primary Constructor : class Student(var name : String, var age : Int)

Init block : The init block run immediately after the primary construcotr 
    class Student(var name: String) {
        init {
                println("Strudent created)
             }
        }

2] Secondary constructor : Declared inside the class using the constructor keyword and is used when  additional initialization
options are needed.


## this keyword :- this refer to the current object and is used to dictinguish
object properties from constructor parameters or local variables with same name

## Getters and setters :- 
        Getter : A getter is a function that returns the value of a property.
        Setter : A setter is a function that changes the value of a property.


## Inheritance : Inheritance means one class can acquire the properties and functions of another class.

# Override : override is used in a child class to provide a new implementation of a parent class's open function or property.

# Super : super is used to access the parent class's constructor, properties, or functions.

1] Single inheritance
2] Mutilevel inheritance
3] Hierarchical Inheritance 
4] Multiple Inheritance Using Interfaces 

## Abstract Class :- An abstract class is a class that cannot be used to create an object directly.
            A class that cannot be instantiated and may contain both abstract and concrete members.

Abstract Class vs Open Class
Open Class                       Abstract Class
--------------------------------------------------------
Object can be created	       | Object cannot be created
All methods have implementation| Can have abstract methods
Used for inheritance	       | Used as a base template

## Interface :- A contract that defines methods a class must implement. Interfaces can also contain default method implementations.
    interface Animal {
    fun sound()
}

Abstract Class       vs           Interface
---------------------------------------------
Abstract Class	                | Interface
Uses abstract class	            | Uses interface
Can have constructor	        | Cannot have constructor
Can store state (properties     | Cannot store state with backing fields
with backing fields)	
Single inheritance	            | Multiple interfaces can be implemented
Used for closely related classes|Used to define capabilities or behavior

## Data Class :- Used to store the data
    Automatically Genertes the Constructor, toString(), equals(), hashCOde(), copy()