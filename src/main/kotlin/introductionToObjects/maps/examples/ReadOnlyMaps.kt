package introductionToObjects.maps.examples

import atomictest.eq

fun main() {
    val map = mapOf(1 to "one", 2 to "two")
    map[1] eq "one"

    // map += 3 to "Three" // fails
    // map += 4 to "four" // fails

    val newMap = map + (3 to "three")

    newMap eq mapOf(1 to "one", 2 to "two", 3 to "three")
}