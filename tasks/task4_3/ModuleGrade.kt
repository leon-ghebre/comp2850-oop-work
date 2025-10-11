import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Please enter the correct input!")
        exitProcess(1)
    }
    else {
        val mark_one = args[0].toInt()
        val mark_two = args[1].toInt()
        val mark_three = args[2].toInt()
        val sum_of_marks = mark_one + mark_two + mark_three
        var average_mark = sum_of_marks / 3.0
        val grade = when (average_mark.roundToInt()) {
            in 0..39    -> "Fail"
            in 40..69   -> "Pass"
            in 70..100  -> "Distinction"
            else        -> "?"
        }
        val message = ("Your grade was a $grade - you got ${average_mark.roundToInt()} ! ")
        println(message)
    }

}