// Task 5.1.1: anagram checking using a function
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main() {
    println("Please enter the first string: ")
    val string_one = readln()
    println("Please enter the second string: ")
    val string_two = readln()

    var are_anagrams: Boolean = anagrams(string_one, string_two)
    if (are_anagrams) {
        println("$string_one and $string_two are anagrams")
    } else {
        println("$string_one and $string_two are not anagrams")
    }

}