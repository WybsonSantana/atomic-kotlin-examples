package introductionToObjects.lists.examples

import atomictest.capture

fun main() {
    val ints = listOf(1, 2, 3, 4, 5)
    capture {
        ints[5]
    } eq "ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5"
}