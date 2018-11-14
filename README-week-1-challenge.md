As we have decided to embark our initial learning kata journey to gain some understanding on Kotlin language, I have come up with below plan for our first week on Kotlin. You can start with setting up an initial hello world project and the topics to go through is listed below and at the end are the links to reference materials. Please feel free to comment on what you think about the plan and if you know of any other good materials, feel free to include them in the relevant section.

Setup and run a hello world project:

IntelliJ - https://kotlinlang.org/docs/tutorials/getting-started.html
Eclipse - https://kotlinlang.org/docs/tutorials/getting-started-eclipse.html
 

Basic Differences Between Kotlin and Java

- Kotlin Standard Library

- Variable Declarations

- Type Aliases

- Referential and Structural Equality

- Bit Operators and Smart Casting

- String Templates

- Raw Strings

- REPL (Read Eval Print Loop) (optional)

 

Exercise/Challenge part 1: (answer as much as you can)

1. Declare two immutable String variables called hello1 and hello2. Assign "Hello" to both variables.

2. Using one line of code, test whether hello1 and hello2 are referentially equal and print the result.

3. Using one line of code, test whether hello1 and hello2 are structurally equal and print the result.

4. Declare an immutable variable of type Any and assign to it the string "The Any type is the root of the Kotlin class hierarchy". Then, using a smart cast, print out the uppercased string.

5. Using one line of code, print out the following. Make sure your code is nicely indented:

          1
	
         11
	
        111
	
       1111

  

Data Types and Null Reference Handling:

- The Builtin Dataypes in Kotlin

- Arrays in Kotlin

- Null References

- Arrays and Null References

Exercise/Challenge part 2: (answer as much as you can)

1. Declare a non-nullable float variable two ways, and assign it the value -3847.384

2. Now change both of those variable declarations into nullable variables.

3. Now declare an array of type non-nullable Short. Make it size 5, and assign it the values 1, 2, 3, 4, and 5.

4. Now declare an array of nullable Ints and initialize it with the values 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.

5. You have to call a Java method with the following signature from Kotlin:

   public void method1(char[] charArray).

   Declare an array that you could pass to the method and initialize it with the values 'a', 'b', and 'c'.

6. Given the following code:

    val x: String? = "I AM IN UPPERCASE"

   Using one line of code, declare another string variable, and assign it x.toLowerCase() when x isn't null, and the string "I give up!" when x is null.

7. Now use the let function to (a) lowercase the string, and then (b) replace "am" with "am not" in the result

8. You're really, really confident that the variable myNonNullVariable can't contain null. Change the following code to assert that myNonNullVariable isn't null (and shoot yourself in the foot!)

 

References for above topics:

https://kotlinlang.org/docs/reference/

 

Paid courses:

https://www.udemy.com/kotlin-for-java-developers/learn/v4/overview

https://www.coursera.org/learn/kotlin-for-java-developers
