package programmingBasics.stringTemplates.exercises

fun show(id: Int, language: String, letter: Char, version: Double) {
    println("ID: $id")
    println("Language: $language")
    println("Letter: $letter")
    println("Version: $version \n")
}

fun main() {
    show(1, "Java", 'J', 17.0)
    show(2, "Kotlin", 'K', 1.6)

}

/*
Output:
ID: 1
Language: Java
Letter: J
Version: 17.0

ID: 2
Language: Kotlin
Letter: K
Version: 1.6

*/