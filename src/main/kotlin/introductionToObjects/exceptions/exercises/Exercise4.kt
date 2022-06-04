package introductionToObjects.exceptions.exercises

import atomictest.capture
import atomictest.eq

fun sumPositiveNumbers(x: Int, y: Int): Int {
    if (x < 0 || y < 0)
        throw IllegalArgumentException("Numbers cannot be negatives, but was $x and $y")
    return x + y
}

fun main() {
    sumPositiveNumbers(2, 3) eq 5
    sumPositiveNumbers(0, 11) eq 11

    capture {
        sumPositiveNumbers(-2, 3)
    } eq "IllegalArgumentException: Numbers cannot be negatives, but was -2 and 3"

    capture {
        sumPositiveNumbers(11, -4)
    } eq "IllegalArgumentException: Numbers cannot be negatives, but was 11 and -4"
}