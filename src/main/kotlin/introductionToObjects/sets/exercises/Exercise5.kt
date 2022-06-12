package introductionToObjects.sets.exercises

import atomictest.eq

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1)
    list.toSet() eq setOf(1, 2, 3, 4, 5)
}