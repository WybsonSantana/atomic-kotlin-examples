package introductionToObjects.varargs.examples

import atomictest.eq

fun main() {
    val array = intArrayOf(4, 5)
    sum(1, 2, 3, *array, 6) eq 21

    // Type mismatch: inferred type is IntArray but Int was expected:
    // sum(1, 2, 3, 4, array, 6)

    val list = listOf(9, 10, 11)
    sum(*list.toIntArray()) eq 30
}