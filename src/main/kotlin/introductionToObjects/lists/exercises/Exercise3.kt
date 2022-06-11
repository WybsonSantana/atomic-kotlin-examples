package introductionToObjects.lists.exercises

import atomictest.eq

fun countOccurrences(list: List<Int>, number: Int): Int {
    var occurrences = 0
    for (i in list) {
        if (i == number)
            occurrences++
    }
    return occurrences
}

fun main() {
    val list = listOf(17, 11, 3, 17, 18, 19, 17, 11)
    countOccurrences(list, 17) eq 3
    countOccurrences(list, 11) eq 2
    countOccurrences(list, -2) eq 0
}