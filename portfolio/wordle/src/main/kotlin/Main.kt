private const val ALLOWED_ATTEMPTS = 10

fun main() {
    var attempt = 1
    val wordList: MutableList<String> = readWordList("data/words.txt")
    val word = pickRandomWord(wordList)
    while (attempt <= ALLOWED_ATTEMPTS) {
        val guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, word)
        displayGuess(guess, matches)
        if (guess.lowercase() == word.lowercase()) {
            println("Congratulations, you have successfully guessed the word!")
            break
        }
        attempt += 1
        if (attempt > ALLOWED_ATTEMPTS) {
            println("You have run out of attempts! ")
            println("The word was $word")
        }
    }
}
