package introductionToObjects.exceptions.exercises

import atomictest.*

fun main() {
    capture {
        "Atomic Kotlin".toInt()
    } eq "NumberFormatException: For input string: \"Atomic Kotlin\""
}