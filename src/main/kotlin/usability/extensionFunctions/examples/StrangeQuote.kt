package usability.extensionFunctions.examples

import atomictest.eq

// Apply two sets of single quotes:
fun String.strangeQuote() =
    this.singleQuote().singleQuote()

fun String.tooManyQuotes() =
    doubleQuote().doubleQuote()

fun main() {
    "Hi".strangeQuote() eq "''Hi''"
    "Hi".tooManyQuotes() eq "\"\"Hi\"\""
}