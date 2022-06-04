package introductionToObjects.exceptions.examples

import atomictest.*

fun main() {
    capture {
        "1$".toInt()
    } eq """
        NumberFormatException: For input string: "1$"
    """.trimIndent()
}