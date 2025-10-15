// Task 5.4.1: string extension function
var String.tooLong: Boolean get() = this.length > 20
fun main() {
    println("Please enter a string: ")
    var text = readln()
    if (text.tooLong){
        println("The string is greater than 20 characters! ")
    }
    else {
        println("The string is not less than 20 characters. ")
    }
}