package programmingBasics.loopingAndRanges.examples

fun hasChar(string: String, char: Char): Boolean {
    for (letter in string) {
        if (letter == char) return true
    }
    return false
}

fun main() {
    println(hasChar("Kotlin", 't'))
    println(hasChar("Kotlin", 's'))
}

/*
Output:
true
false
*/