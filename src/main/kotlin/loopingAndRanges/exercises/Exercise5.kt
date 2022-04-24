package loopingAndRanges.exercises

fun countChars(char: Char, string: String): Int {
    var result = 0
    for (i in 0..string.lastIndex) {
        if (char == string[i]) {
            result += 1
        }
    }
    return result
}

fun main() {
    println(countChars('t', "Atomic Kotlin"))
}

/*
Output:
2
*/