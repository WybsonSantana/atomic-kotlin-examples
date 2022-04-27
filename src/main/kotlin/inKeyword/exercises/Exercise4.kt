package inKeyword.exercises

fun isValidCharacter(char: Char): Boolean {
    return char == '_' || char in 'a'..'z' || char in 'A'..'Z' || char in '0'..'9'
}

fun isValidIdentifier(string: String): Boolean {
    if (string.isEmpty() || string[0] in '0'..'9') return false
    for (i in string) {
        if (!isValidCharacter(i)) return false
    }
    return true
}

fun main() {
    println(isValidIdentifier("name"))
    println(isValidIdentifier("0name"))
}

/*
Output:
true
false
*/