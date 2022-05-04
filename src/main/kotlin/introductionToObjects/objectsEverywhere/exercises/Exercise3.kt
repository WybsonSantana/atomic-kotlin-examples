package introductionToObjects.objectsEverywhere.exercises

fun isPalindrome3(string: String): Boolean =
    string == string.reversed()

fun isPalIgnoreCase2(string: String): Boolean =
    isPalindrome3(string.toLowerCase())

fun isPalIgnoreSpecial(string: String): Boolean {
    var onlyLetters = ""
    for (char in string) {
        if (char in 'a'..'z' || char in 'A'..'Z') {
            onlyLetters += char
        }
    }
    return isPalIgnoreCase2(onlyLetters)
}

fun main() {
    println(isPalIgnoreSpecial("Was It A Rat I Saw? .."))
}

/*
Output:
true
*/