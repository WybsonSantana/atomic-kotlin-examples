package introductionToObjects.testing.exercises

import atomictest.*

fun abs(number: Int): Int =
    if (number > 0) number else -number

fun main() {
    abs(0) eq  0
    abs(17) eq 17
    abs(-11) eq 11
}