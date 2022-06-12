package introductionToObjects.maps.examples

import atomictest.eq

fun main() {
    val map = mutableMapOf(5 to "five", 6 to "six")
    map[5] eq "five"

    map[5] = "Five"
    map[6] = "Six"
    map eq "{5=Five, 6=Six}"

    map.put(1, "One")
    map.put(2, "Two")
    map += 3 to "Three"
    map += 4 to "Four"
    map.toSortedMap() eq "{1=One, 2=Two, 3=Three, 4=Four, 5=Five, 6=Six}"


}