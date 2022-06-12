package introductionToObjects.sets.exercises

import atomictest.eq

fun main() {
    val set = setOf(1, 5, 2, 1, 6, 3, 2)
    set.size eq 5
}