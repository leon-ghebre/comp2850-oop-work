fun main() {
    println("PIZZA MENU")
    println(" ")
    println("(a) Margherita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood")
    println("(d) Hawaiian")

    println("Choose your pizza (a-d): ")
    val input = readln().lowercase()

    if (input.length == 1 && input[0] in 'a' .. 'd') {
        println("Order Accepted!")
    }
    else {
        println("Invalid Choice!")
    }
}