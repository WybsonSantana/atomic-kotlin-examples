package introductionToObjects.lists.exercises

import atomictest.eq

fun findMax(list: List<Int>): Int {
    var max = 0
    for (i in list) {
        if (max <= i || max == 0)
            max = i
    }
    return max
}

fun main() {
    val list1 = listOf(-5, -2, 0)
    findMax(list1) eq 0

    val list2 = listOf(11, 0, 17, -10)
    findMax(list2) eq 17

    val list3 = listOf(-5, -3, -1)
    findMax(list3) eq -1
}