package introductionToObjects.lists.examples

import atomictest.eq

fun makeList(): List<Int> =
    mutableListOf(1, 2, 3)

fun main() {
    // makeList() produces a read only list:
    val list = makeList()

    // Unresolved reference: add
    // list.add(4)

    list eq listOf(1, 2, 3)
}