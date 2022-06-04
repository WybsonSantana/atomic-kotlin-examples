package introductionToObjects.exceptions.exercises

import atomictest.*

fun repeatChar(char: Char, i: Int): String {
    if (i <= 0)
        throw IllegalArgumentException("Count 'i' cannot be negative, but was $i")
    var string = ""
    repeat(i) {
        string += char
    }
    return string
}

fun main() {
    repeatChar('a', 5) eq "aaaaa"

    capture {
        repeatChar('x', 0)
    } eq "IllegalArgumentException: Count 'i' cannot be negative, but was 0"

    capture {
        repeatChar('c', -3)
    } eq "IllegalArgumentException: Count 'i' cannot be negative, but was -3"
}