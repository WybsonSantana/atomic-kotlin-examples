package introductionToObjects.lists.examples

import atomictest.eq

fun main() {
    val firstList = mutableListOf(1)
    val secondList: List<Int> = firstList

    secondList eq listOf(1)
    firstList.add(2)

    // second list sees the change:
    secondList eq listOf(1, 2)
}