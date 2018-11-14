package com.locusintellect

fun main(args: Array<String>) {

    // Declare two immutable String variables called hello1 and hello2. Assign "Hello" to both variables
    val hello1 = "Hello"
    val hello2 = "Hello"

    // Using one line of code, test whether hello1 and hello2 are referentially equal and print the result
    println("hello1 and hello2 are referentially equal: ${hello1 === hello2}")

    // Using one line of code, test whether hello1 and hello2 are structurally equal and print the result
    println("hello1 and hello2 are structurally equal: ${hello1 == hello2}")

    // Declare an immutable variable of type Any and assign to it the string "The Any type is the root of the Kotlin class hierarchy". 
    // Then, using a smart cast, print out the uppercased string
    val anyType: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (anyType is String) {
        println("uppercased output is: ${anyType.toUpperCase()}")
    }

    // Using one line of code, print out the following. Make sure your code is nicely indented
    println("""Formatted string 
        |   1
        |  11
        | 111
        |1111
    """.trimMargin())
    
}
