package introductionToObjects.lists.exercises

import atomictest.eq

fun main() {
    val list = listOf('a', 'b', 'c', 'd', 'e').subList(1, 4)
    list eq "[b, c, d]"
}