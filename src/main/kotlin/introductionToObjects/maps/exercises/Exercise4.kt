package introductionToObjects.maps.exercises

import atomictest.eq

fun main() {
    val map = mapOf(1 to "Samantha", 2 to "Kittie", 3 to "Cindy")
    map.values eq "[Samantha, Kittie, Cindy]"
    map.values.toList().sorted() eq "[Cindy, Kittie, Samantha]"
}