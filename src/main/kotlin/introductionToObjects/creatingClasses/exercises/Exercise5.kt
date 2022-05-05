package introductionToObjects.creatingClasses.exercises

class Message() {
    fun capitalize(string: String): String {
        return string.capitalize()
    }
}

fun main() {
    val message = Message()
    println(message.capitalize("kotlin"))
}

/*
Output:
Kotlin
*/