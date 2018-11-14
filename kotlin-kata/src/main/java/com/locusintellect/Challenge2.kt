package com.locusintellect

import java.util.*

fun main(args: Array<String>) {

    // Declare a non-nullable float variable two ways, and assign it the value -3847.384
    val float = -3847.384F
    val float1 = (-3847.384).toFloat()

    // Now change both of those variable declarations into nullable variables
    val floatNullable: Float? = -3847.384F
    val float1Nullable: Float? = (-3847.384).toFloat()

    // Now declare an array of type non-nullable Short. Make it size 5, and assign it the values 1, 2, 3, 4, and 5
    val shortValuesPrimitive = shortArrayOf(1, 2, 3, 4, 5)
    val shortValues: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    // Now declare an array of nullable Ints and initialize it with the values 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200
    val intArray = Array<Int?>(40) { i -> (i + 1) * 5 }
    println("Int array values -> ${Arrays.toString(intArray)}")

    // You have to call a Java method with the following signature from Kotlin
    // Declare an array that you could pass to the method and initialize it with the values 'a', 'b', and 'c'
    JavaClass().method1(charArrayOf('a', 'b', 'c'))

    // Using one line of code, declare another string variable, and assign it x.toLowerCase() when x isn't null, and the string "I give up!" when x is null
    val x: String? = "I AM IN UPPERCASE"
    val anotherString = x?.toLowerCase() ?: "I give up!"
    println("another string is: $anotherString")

    // Now use the let function to (a) lowercase the string, and then (b) replace "am" with "am not" in the result
    x?.let { println("lower case and replace string: ${it.toLowerCase().replace("am", "am not")}") }

    // You're really, really confident that the variable myNonNullVariable can't contain null.
    // Change the following code to assert that myNonNullVariable isn't null (and shoot yourself in the foot!)
    val myNonNullVariable: Int? = null
    myNonNullVariable?.toDouble()

    //myNonNullVariable!!.toDouble()
}
