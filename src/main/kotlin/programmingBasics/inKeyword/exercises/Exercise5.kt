package programmingBasics.inKeyword.exercises

fun isConsonant(char: Char): Boolean {
    for (i in 'a'..'z') {
        if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
            continue
        if (char == i)
            return true
    }
    return false
}

fun main() {
    println(isConsonant('a'))
    println(isConsonant('b'))
}

/*
Output:
false
true
*/