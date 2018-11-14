package com.locusintellect

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
    println("Int array values -> ${intArray}")
    
    // You have to call a Java method with the following signature from Kotlin
    

}
