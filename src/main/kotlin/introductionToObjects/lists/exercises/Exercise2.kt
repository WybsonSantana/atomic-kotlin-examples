package introductionToObjects.lists.exercises

import atomictest.eq

fun findMin(list: List<Int>): Int? {
    return list.minOrNull()
}

fun main() {
    val list1 = listOf(5, 3, 4, 2, 0, 1)
    findMin(list1) eq 0

    val list2 = listOf(-2, 17, -5, 11, 0)
    findMin(list2) eq -5

    val list3: List<Int> = emptyList()
    findMin(list3) eq null
}