import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    // Write your tests here
    "Guess is less than 5 characters" {
        withClue("Less than 5 characters") { isValid("Hero") shouldBe false }
        withClue("Less than 5 characters") { isValid("Yo") shouldBe false }
    }
    "Guess is 5 characters" {
        withClue("5 characters") { isValid("Spook") shouldBe true }
    }
    "Guess is more than 5 characters" {
        withClue("More than 5 characters") { isValid("Spooky") shouldBe false }
        withClue("More than 5 characters") { isValid("Century") shouldBe false }
    }
    "Guess ignores case" {
        withClue("Uppercase characters") { isValid("SPOOK") shouldBe true }
    }
    "Guess does not contain internal whitespaces or non-alphabetic characters" {
        withClue("non-trailing whitespaces") { isValid("Spoo k") shouldBe false }
        withClue("non-alphabetic letters") { isValid("Pr1ck") shouldBe false }
    }
    "Guess ignores leading/trailing whitespaces" {
        withClue("Leading whitespaces") { isValid("   Spook") shouldBe true }
        withClue("Trailing whitespaces") { isValid("Spook   ") shouldBe true }
    }

    "Read from file and created a list" {
        withClue("There are 2315 items in the wordList") {
            val wordList: MutableList<String> = readWordList("data/words.txt")
            wordList.size shouldBe 2315
        }
    }

    "pickRandomWord removes a word from the wordList" {
        withClue("pickRandomWord removes a word from the wordList") {
            val wordList: MutableList<String> = readWordList("data/words.txt")
            val word = pickRandomWord(wordList)
            wordList.size shouldBe 2314
        }
    }
    "pickRandomWord returns a 5 letter string" {
        withClue("pickRandomWord returns a 5 letter string from the wordList") {
            val wordList: MutableList<String> = readWordList("data/words.txt")
            val word = pickRandomWord(wordList)
            word.length shouldBe 5
        }
    }
    "evaluateGuess compares two strings and correctly returns a list of their comparisons" {
        withClue("evaluateGuess compares two identical strings and returns a list of their comparisons") {
            val guess = "Spook"
            val target = "Spook"
            val matches = evaluateGuess(guess, target)
            matches shouldBe listOf(1, 1, 1, 1, 1)
        }
        withClue("evaluateGuess compares two similar strings and returns a list of their comparisons") {
            val guess = "Spook"
            val target = "Crook"
            val matches = evaluateGuess(guess, target)
            matches shouldBe listOf(0, 0, 1, 1, 1)
        }
        withClue("evaluateGuess compares two completely different strings and returns a list of their comparisons") {
            val guess = "Spook"
            val target = "Thief"
            val matches = evaluateGuess(guess, target)
            matches shouldBe listOf(0, 0, 0, 0, 0)
        }
    }
})
