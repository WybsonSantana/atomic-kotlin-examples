package usability.extensionFunctions.examples

import atomictest.eq
import usability.extensionFunctions.examples.doubleQuote
import usability.extensionFunctions.examples.singleQuote

fun main() {
    "Single".singleQuote() eq "'Single'"
    "Double".doubleQuote() eq "\"Double\""
}