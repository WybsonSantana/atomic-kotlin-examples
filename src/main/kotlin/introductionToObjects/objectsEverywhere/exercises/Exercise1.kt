package introductionToObjects.objectsEverywhere.exercises

fun isPalindrome1(string: String): Boolean =
    string == string.reversed()

fun main() {
    println(isPalindrome1("mom"))
    println(isPalindrome1("atomic"))
}

/*
Output:
true
false
*/