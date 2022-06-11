package introductionToObjects.lists.examples

import atomictest.eq

fun main() {
    val doubles = listOf(1.1, 2.2, 3.3, 4.4, 5.5)
    doubles.sum() eq 16.5

    val strings = listOf("one", "two", "three", "four", "five")
    strings eq listOf("one", "two", "three", "four", "five")
    strings.sorted() eq listOf("five", "four", "one", "three", "two")
    strings.reversed() eq listOf("five", "four", "three", "two", "one")
    strings.first() eq "one"
    strings.last() eq "five"
    strings.take(2) eq listOf("one", "two")
    strings.takeLast(2) eq listOf("four", "five")
}