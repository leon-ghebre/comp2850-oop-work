// Task 5.3.2: dice rolling simulation
import kotlin.random.Random

fun rollDice(sides: Int=6, dice: Int=1){
    var total = 0
    for (i in 1..dice){
        if (sides in setOf(4, 6, 8, 10, 12, 20)) {
            println("Rolling a d$sides...")
            val result = Random.nextInt(1, sides + 1)
            total += result
            println("Total was $total")
        }
        else {
            println("Error: cannot have a $sides-sided die")
        }
    }
}

fun main() {
    rollDice(dice = 100)

}