// Task 7.7.2: contact database, using a map
fun readData() = buildList {
    var loopOn = true
    while (loopOn) {
        println("Please enter a floating point value")
        val input = readln()
        if (input.isBlank()) {
            loopOn = false
            break
        } 
        val number = input.toDoubleOrNull()
        if (number!=null){
            add(number)
        } else {
            println("Invalid number - please try again! ")
        }
    }
}

fun median(list: List<Double>): Double{
    val sorted = list.sorted()
    val size = list.size
    if (size % 2 == 0) {
        val medianPosition = size / 2
        return sorted[medianPosition - 1]
    } else if (size == 1){
        val medianPosition = 0
        return sorted[medianPosition]
    } else {
        val medianPosition = (size + 1) / 2
        return sorted[medianPosition - 1]
    }
}

fun stats(list: List<Double>):List<Double>{
    val sorted = list.sorted()
    val size = list.size
    val median = median(list)
    val min = list.min()
    val max = list.max()
    val sum = list.sum()
    val average = list.average()
    val returnList = listOf(median, min, max, sum, average)
    return returnList
    
}

fun main(){
    val list = readData()
    val stats = stats(list)
    println(stats)
}