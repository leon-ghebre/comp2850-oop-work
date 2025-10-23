// Implement the six required functions here
import java.io.File

const val WORD_LENGTH = 5

fun isValid(word: String): Boolean {
    val trimmed = word.trim()
    return (trimmed.length == WORD_LENGTH) && (trimmed.all { it.isLetter() }) && (!trimmed.any { it.isWhitespace() })
}

fun readWordList(filename: String): MutableList<String> = File(filename).bufferedReader().useLines {
    it.toMutableList()
}

fun pickRandomWord(words: MutableList<String>): String {
    val randomWord = words.random()
    words.remove(randomWord)
    return randomWord
}

fun obtainGuess(attempt: Int): String {
    while (true) {
        println(" Attempt $attempt: ")
        var input = readln()
        if (isValid(input)) {
            return input
        } else {
            println("That is invalid input - please try again! ")
        }
    }
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    val matchList: MutableList<Int> = mutableListOf<Int>()
    for (i in 0 until WORD_LENGTH) {
        if (guess[i].lowercaseChar() == target[i].lowercaseChar()) {
            matchList.add(1)
        } else {
            matchList.add(0)
        }
    }
    return matchList.toList()
}

fun displayGuess(guess: String, matches: List<Int>) {
    val guessList: MutableList<Char> = mutableListOf<Char>()
    for (i in 0 until WORD_LENGTH) {
        if (matches[i] == 1) {
            guessList.add(guess[i])
        } else {
            guessList.add('?')
        }
    }
    println(guessList.joinToString(""))
}
