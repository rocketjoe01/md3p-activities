fun main() {
    print("Welcome to Kodego Basic Grocery")
    print("\n =====================")
    print("\n1. View available products \n2. View Cart \n3. Check out and pay\n ===================== \n")
    print("")
    val groceryStore = setOf("bread", "milk", "eggs", "cheese", "yogurt", "chicken", "beef", "potatoes", "carrots", "onions")

    val prices = mapOf(
        "bread" to 2.99,
        "milk" to 3.49,
        "eggs" to 2.49,
        "cheese" to 4.99,
        "yogurt" to 1.99,
        "chicken" to 8.99,
        "beef" to 11.99,
        "potatoes" to 0.99,
        "carrots" to 1.49,
        "onions" to 0.99

    )

    val shoppingCart = mutableMapOf<String, Int>()
    var continueShopping = true

    while (continueShopping) {


        val input = readlnOrNull()
        if (input != null) {
            when (input) {
                "1" -> {
                    println("Here are our available items and prices:")
                    prices.forEach { (item, price) -> println("- $item : \$$price") }
                    println("\nPlease type the products that you will add to your kart.")
                }
                "2" -> {
                    if (shoppingCart.isNotEmpty()) {
                        println("Here is a summary of your shopping cart:")
                        shoppingCart.forEach { (item, quantity) -> println("- $quantity $item(s) \$${prices[item]} each = \$${prices[item]?.times(
                            quantity
                        )}") }
                        println("Your total cost is \$${shoppingCart.map { (item, quantity) -> prices[item]!! * quantity }.sum()}.")
                    } else {
                        println("Your shopping cart is currently empty.")
                    }
                }
                "3" -> {
                    continueShopping = false
                }
                else -> {
                    if (groceryStore.contains(input)) {
                        var validQuantity = false
                        var quantity: Int? = null
                        while (!validQuantity) {
                            print("Please enter the quantity of $input: ")
                            quantity = readln().toIntOrNull()
                            if (quantity != null) {
                                validQuantity = true
                            } else {
                                println("Sorry, that is not a valid quantity. Please try again.")
                            }
                        }
                        shoppingCart[input] = shoppingCart.getOrDefault(input, 0) + quantity!!
                        println("$quantity ${input}s have been added to your shopping cart. \n[1] = View available products, [2] = View cart, [3] = Check out and pay")
                    } else {
                        println("Sorry, that is not a valid input.")
                    }
                }
            }
        }
    }

    if (shoppingCart.isNotEmpty()) {
        println("Here is a summary of your shopping cart:")
        shoppingCart.forEach { (item, quantity) -> println("- $quantity $item(s) @ \$${prices[item]} each = \$${prices[item]?.times(
            quantity
        )}") }
        println("Your total cost is \$${shoppingCart.map { (item, quantity) -> prices[item]!! * quantity }.sum()}. \nThank you for shopping with us!")
    } else {
        println("You did not add any items to your shopping cart. \nThank you for visiting our store!")
    }
}