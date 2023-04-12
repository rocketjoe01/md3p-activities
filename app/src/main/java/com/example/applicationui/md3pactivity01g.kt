package com.example.testgithub

//Activity 01 - G
//Create an application that will accept 1 string.
//Your application will print “Palindrome” if the string is a palindrome.
//Scope :String, Loops

fun main() {

    while (true) {
        // Prompts user to enter a text
        print("Enter a text: ")
        val inputString = readln().uppercase()
        var isPalindrome = true

        // Checks the character
        for (i in 0 until inputString.length / 2) {
            if (inputString[i] != inputString[inputString.length - 1 - i]) {
                isPalindrome = false
                break
            }
        }

        // Shows the result
        if (isPalindrome) {
            println("$inputString is a palindrome")
        } else {
            println("$inputString is not a palindrome")
        }

        // Asks user if they want to continue
        print("Do you want to check another text? \n \n[Y = Continue] \n[Any Key = Stop] \n")
        val answer = readln()

        // If user does not want to continue, break out of the loop
        if (answer.lowercase() != "y") {
            break
        }
    }
}