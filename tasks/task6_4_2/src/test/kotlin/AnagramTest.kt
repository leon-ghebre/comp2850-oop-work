// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

@Suppress("unused")
class AnagramTest: StringSpec({
    "Two strings of different lengths are not anagrams" {
        withClue("Second word is longer") { 
            val firstWord = "abcd" 
            val secondWord = "abcdef" 
            firstWord.anagramOf(secondWord) shouldBe false}
        withClue("First word is longer") { 
            val secondWord = "abcd" 
            val firstWord = "abcdef" 
            firstWord.anagramOf(secondWord) shouldBe false}
        }
    "An empty string is not an anagram of itself" {
        withClue("Empty string is not an anagaram of itself") {
            "".anagramOf("") shouldBe false}
        }
    "A non-empty string is an anagram of itself" {
        withClue("First string == Second string") {
            val firstWord = "ana" 
            val secondWord = "ana" 
            firstWord.anagramOf(secondWord) shouldBe true}
        }
    "Two strings are anagrams if they contain the same characters in a different order" {
        withClue("Same characters but different order") {
            val firstWord = "leon"
            val secondWord = "noel"
            firstWord.anagramOf(secondWord) shouldBe true}
        }
    "Letter case is disregarded when comparing character sequences" {
        withClue("Different letter cases") {
            val firstWord = "LeOn"
            val secondWord = "noeL"
            firstWord.anagramOf(secondWord) shouldBe true}
        }
    })
