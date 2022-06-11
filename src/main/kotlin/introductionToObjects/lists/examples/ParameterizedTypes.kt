package introductionToObjects.lists.examples

import atomictest.eq

fun main() {
// Type is inferred:
    val numbers1 = listOf(1, 2, 3, 4, 5)
    val strings1 = listOf("one", "two", "three", "four", "five")

    // Exactly the same, but with explicitly type:
    val numbers2: List<Int> = listOf(1, 2, 3, 4, 5)
    val strings2: List<String> = listOf("one", "two", "three", "four", "five")

    val numbers3 = listOf<Int>(1, 2, 3, 4, 5)
    val strings3 = listOf<String>("one", "two", "three", "four", "five")

    numbers1 eq numbers2
    strings1 eq strings2
    numbers1 eq numbers3
    strings1 eq strings3
}