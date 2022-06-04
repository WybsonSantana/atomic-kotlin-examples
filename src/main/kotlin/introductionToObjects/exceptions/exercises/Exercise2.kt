package introductionToObjects.exceptions.exercises

import atomictest.*

fun abort(message: String) {
    throw Exception(message)
}

fun main() {
    capture {
        abort("Stopped execution!")
    } eq "Exception: Stopped execution!"
}