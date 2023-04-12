package com.example.testgithub
////Activity 01 - D
//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
//The total of the 5  inputs will be divided by the answer in the second question input.
//Note: Error checking must be done.

fun main() {
    println("Kotlin Application Calculator v9000")

    println("")
    // Prompt user to enter 5 numbers
    println("Enter 5 monetary amounts to total:")
    println("")
    var input1: Int? = readln().toIntOrNull()
    while (input1 == null) {
        println("Invalid input. Please enter a valid integer.")
        input1 = readln().toIntOrNull()
    }

    var input2: Int? = readln().toIntOrNull()
    while (input2 == null) {
        println("Invalid input. Please enter a valid integer.")
        input2 = readln().toIntOrNull()
    }

    var input3: Int? = readln().toIntOrNull()
    while (input3 == null) {
        println("Invalid input. Please enter a valid integer.")
        input3 = readln().toIntOrNull()
    }

    var input4: Int? = readln().toIntOrNull()
    while (input4 == null) {
        println("Invalid input. Please enter a valid integer.")
        input4 = readln().toIntOrNull()
    }

    var input5: Int? = readln().toIntOrNull()
    while (input5 == null) {
        println("Invalid input. Please enter a valid integer.")
        input5 = readln().toIntOrNull()
    }

    // Compute the total and display the result
    val total = input1 + input2 + input3 + input4 + input5
    println("The total is $total")

    // Prompt user to enter the division factor
    println("Enter the number to divide the total by:")
    var divisor: Int? = readln().toIntOrNull()
    while (divisor == null || divisor == 0) {
        println("Invalid input. Please enter a valid integer that is not zero.")
        divisor = readln().toIntOrNull()
    }

    // Divide the total by the divisor to get the result
    val result = total.toFloat() / divisor
    println("The result is $result")
}