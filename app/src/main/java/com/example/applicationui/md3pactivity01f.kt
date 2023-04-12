package com.example.testgithub
//Activity 01 - F
//Scope : String, Loops
//Create an application that will accept 2 string inputs.
//Your application will print all unique characters in both Strings.
//Union of Unique characters in both Strings

fun main() {
    var uniqueChars = true

    // Prompts user to enter a text
    while (uniqueChars) {
        print("Enter first string: ")
        val str1 = readln().lowercase()
        print("Enter second string: ")
        val str2 = readln().lowercase()

        val unique = StringBuilder()

        // Check the unique character
        for (ch in str1 + str2) {
            if (!unique.contains(ch)) {
                unique.append(ch)
            }
        }

        println("Union of unique characters in both strings: $unique")
        println("Number of unique characters: ${unique.length}")

        // Added a loop to the code
        var validResponse = false
        var response: String
        while (!validResponse) {
            print("Enter another set of strings? (Y/N): ")
            response = readln().trim().uppercase()
            when (response) {
                "Y", "YES" -> {
                    validResponse = true
                }
                "N", "NO" -> {
                    validResponse = true
                    uniqueChars = false
                }
                else -> {
                    println("Invalid input. Please enter Y or N.")
                }
            }
        }
    }
}