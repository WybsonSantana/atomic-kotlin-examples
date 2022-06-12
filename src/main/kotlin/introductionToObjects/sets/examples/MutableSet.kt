package introductionToObjects.sets.examples

import atomictest.eq

fun main() {
    val mutableSet = mutableSetOf<Int>()

    mutableSet.add(11)
    mutableSet.add(17)
    mutableSet += 11
    mutableSet += 17
    mutableSet eq setOf(11, 17)

    mutableSet.remove(11)
    mutableSet.remove(17)
    mutableSet eq setOf<Int>()
}