package introductionToObjects.varargs.exercises

import atomictest.eq

fun flatten(listOfLists: List<List<String>>): List<String> {
    val result = mutableListOf<String>()
    for (list in listOfLists) {
        result.addAll(list)
    }
    return result
}

fun main() {
    val listOfLists = listOf(listOf("a", "b", "c"), listOf("d", "e", "f"), listOf("g"))
    flatten(listOfLists) eq listOf("a", "b", "c", "d", "e", "f", "g")
}