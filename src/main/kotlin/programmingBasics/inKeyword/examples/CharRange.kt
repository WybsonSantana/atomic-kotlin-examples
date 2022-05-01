package programmingBasics.inKeyword.examples

fun isDigit(char: Char): Boolean {
    return char in '0'..'9'
}

fun isNotDigit(char: Char) = char !in '0'..'9'

fun main() {
    println(isDigit('K'))
    println(isDigit('5'))
    println(isNotDigit('k'))
}

/*
Output:
false
true
true
*/