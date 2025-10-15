// Task 5.1.1: anagram checking using a function
infix fun String.anagramOf(second: String): Boolean {
    if (this.length != second.length) {
        return false
    }
    val firstChars = this.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main() {
    println("Please enter the first string: ")
    val string_one = readln()
    println("Please enter the second string: ")
    val string_two = readln()

    var are_anagrams: Boolean = string_one anagramOf string_two
    if (are_anagrams) {
        println("$string_one and $string_two are anagrams")
    } else {
        println("$string_one and $string_two are not anagrams")
    }

}