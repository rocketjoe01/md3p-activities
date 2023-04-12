fun main() {
    val books = mutableMapOf(
        1 to Book("Learn Kotlin for Android Development: The Next Generation", "Peter Späth", "Learn Kotlin and build android apps", true),
        2 to Book("Kotlin in Action", "Dmitry Jemerov and Svetlana Isakova", "Learn how to write Kotlin applications", true),
        3 to Book("Programming Android with Kotlin", "Pierre-Olivier Laurence,Amanda Hinchman-Dominguez,Mike Dunn,G. Blake Meike", "Build beautiful, performant, and maintainable Android apps with Kotlin", true),
        4 to Book("Effective Kotlin: Best Practices", "Marcin Moskala", "Maximize your productivity with Kotlin", true),
        5 to Book("Beginner's Guide to Kotlin Programming", "John Hunt", "A comprehensive guide to learning Kotlin", true),
        6 to Book("Head First Kotlin: A Brain-Friendly Guide", "David Griffiths, Dawn Griffiths", "An easy-to-follow guide to learning Kotlin", true),
        7 to Book("Kotlin Programming: The Big Nerd Ranch Guide", "Josh Skeen, David Greenhalgh", "Learn Kotlin programming concepts and techniques", true),
        8 to Book("Atomic Kotlin", "Svetlana Isakova, Bruce Eckel", "A fast-paced guide to Kotlin programming", true),
        9 to Book("The Joy of Kotlin", "Pierre Yves Saumont", "Discover the joys of programming with Kotlin", true),
        10 to Book("Kotlin for Android App Development", "Peter Sommerhoff", "Build amazing Android apps with Kotlin", true)
    )

    println("Welcome to the Kotlin Library!")

    while (true) {
        println("")
        println(" ___________________________________________")
        println("|[L = Show the list of books in the library]| \n|[B = Borrow a book]                        | \n|[R = Return a book]                        | \n|[Q = Quit the program]                     |")
        println(" ___________________________________________")
        println("")
        when (readln().uppercase()) {
            "L" -> {
                println("Here is a list of our books:")
                books.forEach { (key, book) ->
                    val availability = if (book.available) "[Available]" else "[Unavailable]"
                    println("$key. ${book.title} - $availability")
                }
            }
            "B" -> {
                println("Enter the number of the book you'd like to borrow:")
                val selectedBook = books[readln().toInt()]
                if (selectedBook == null) {
                    println("Sorry, we don't have that book.")
                } else {
                    if (selectedBook.available) {
                        selectedBook.available = false
                        println("You have borrowed '${selectedBook.title}.' It is now unavailable.")
                        println("Author: ${selectedBook.author}")
                        println("Description: ${selectedBook.description}")
                    } else {
                        println("Sorry, this book is not available.")
                    }
                }
            }
            "R" -> {
                println("Enter the number of the book you'd like to return:")
                val selectedBook = books[readln().toInt()]
                if (selectedBook == null) {
                    println("Sorry, we don't have that book.")
                } else {
                    if (selectedBook.available) {
                        selectedBook.available = true
                        println("You have returned '${selectedBook.title}.' It is now available.")
                    } else {
                        println("This book is not borrowed, it is already available.")
                    }
                }
            }
            "Q" -> return
            else -> println("Invalid action.")
        }
    }
}

data class Book(var title: String, val author: String, val description: String, var available: Boolean)