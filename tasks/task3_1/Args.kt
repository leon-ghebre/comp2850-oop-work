// Task 3.1: command line arguments
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: Two arguments are required!")
        exitProcess(1)
    }
    println(args[0])Í
    println(args[1])
}


