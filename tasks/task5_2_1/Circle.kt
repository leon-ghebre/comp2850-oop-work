// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius
fun circleCircumference(radius: Double) = 2 * PI * radius
fun readDouble(prompt: String): Double {
    println(prompt)
    var radius = readln().toDouble()
    return radius
}

fun main() {
    var radius = readDouble("Please enter a value for the circle's radius: ")
    var area = circleArea(radius)
    var circumference = circleCircumference(radius)
    println("The circle's area is ${"%.4f".format(area)} and its circumference is ${"%.4f".format(circumference)}")
}

