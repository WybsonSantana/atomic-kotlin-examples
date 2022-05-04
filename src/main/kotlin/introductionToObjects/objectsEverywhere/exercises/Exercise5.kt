package introductionToObjects.objectsEverywhere.exercises

fun upperLower(string: String): String {
    var i = 0
    var stringUpperLower = ""
    for (char in string) {
        if (i % 2 == 0) {
            stringUpperLower += char.uppercase()
        }
        if (i % 2 != 0) {
            stringUpperLower += char.lowercase()
        }
        i++
    }
    return stringUpperLower
}

fun main() {
    println(upperLower("Atomic Kotlin!"))
}

/*
Output:
AtOmIc kOtLiN!
*/