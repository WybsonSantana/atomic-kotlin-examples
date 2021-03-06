package introductionToObjects.sets.examples

import atomictest.eq

fun main() {
    val set = setOf(1, 1, 2, 3, 9, 9, 4)

    // No duplicates:
    set eq setOf(1, 2, 3, 4, 9)

    // Element order is unimport:
    setOf(1, 2, 3) eq setOf(3, 2, 1)

    // Set membership:
    (9 in set) eq true
    (99 in set) eq false

    set.contains(9) eq true
    set.contains(99) eq false

    // Does this set contains another set?
    set.containsAll(setOf(1, 9, 2)) eq true

    // Set union:
    set.union(setOf(3, 4, 5, 6)) eq setOf(1, 2, 3, 4, 5, 6, 9)

    // Set intersection:
    set.intersect(setOf(0, 1, 2, 7, 8)) eq setOf(1, 2)

    // Set difference:
    set.subtract(setOf(0, 1, 9, 10)) eq setOf(2, 3, 4)
}