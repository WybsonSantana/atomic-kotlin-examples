package introductionToObjects.objectsEverywhere.exercises

fun isPalindrome2(string: String): Boolean =
    string == string.reversed()

fun isPalIgnoreCase1(string: String): Boolean =
    isPalindrome2(string.toLowerCase())

fun main() {
    println(isPalIgnoreCase1("Mom"))
    println(isPalIgnoreCase1("Atomic"))
}

/*
Output:
true
false
*/