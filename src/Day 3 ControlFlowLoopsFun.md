Control Flow

# if
Executes code when the condition is true.

# if-else

# else-if

Used to check multiple conditions.

# when

Used as an alternative to switch.

## Loops

# for Loop

Used to repeat code

# while Loop

Runs while the condition is true.

# do-while Loop

Runs at least once.

# break
Stops the loop immediately

# continue
Skips the current iteartion and continue with the next one

# Labels
Labels let you control nested loops

## Function :-
    Function is a reusable block of code that performs a specific task
    To declare a function we can use fun keyword

# 1] Basic function : fun greet() {}
# 2] Function with parameter : fun greet(name : String)
# 3] Function with return type : fun add(a : Int, b : Int): Int { return a + b }
# 4] Unit function : fun display() : Unit
# 5] Single expression functions : fun square(x : Int) = x * x 
# 6] Default parameters : fun greet(name : String = "Guest")
# 7] Named argument :  greet(name = "Neha")
# 8] Function Scope : (1) Local variables
                    (2) Global variables
                    (3) Visibility inside function
# 9] Function Overloading : Means having multiple functions with same name but different parameters
                          fun add(a: Int, b: Int) 
                          fun add(a: double, b: double)
# 10] Local function : A function can exist inside another function
            fun login() { fun validate() {  } }
# 11] Extension Function : let you add a new function to an existing class without modifying that class
    fun name = "Neha"
    println(name.length)
// Add your own function
    fun String.greet() {
        pritnln("Hello $this")
    }

// use it lilke this
    "Neha".greet()

For ex : suppose many screens need to capitalize menu, Instead of writing the same code
everywhere, create one extension function and reuse it



