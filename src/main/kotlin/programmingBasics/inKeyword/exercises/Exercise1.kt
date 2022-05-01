package programmingBasics.inKeyword.exercises

fun getAlphabet(): String {
    var alphabet = ""
    for (i in 'a'..'z') {
        alphabet += i
    }
    return alphabet
}

fun main() {
    print(getAlphabet())
}

/*
Output:
abcdefghijklmnopqrstuvwxyz
*/