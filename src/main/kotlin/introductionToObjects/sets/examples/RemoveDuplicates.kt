package introductionToObjects.sets.examples

import atomictest.eq
import introductionToObjects.varargs.exercises.listOfChunks

fun main() {
    val list = listOf(1, 2, 3, 1, 4, 2)
    list.toSet() eq setOf(1, 2, 3, 4)
    list.distinct() eq listOf(1, 2, 3, 4)

    "abbccddd".toSet() eq setOf('a', 'b', 'c', 'd')
}