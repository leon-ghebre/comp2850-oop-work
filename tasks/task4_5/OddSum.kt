// Task 4.5: summing odd integers with a for loop
fun main() {
    println("Please enter the upper limit of the for loop: ")
    var upper_limit = readln().toLong()
    var sum: Long = 0
    for (n in 1..upper_limit step 2) {
        sum += n
    }
    println("Sum: $sum")
}