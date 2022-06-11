package introductionToObjects.lists.examples

import atomictest.eq

fun main() {
    // Mutable List assigned to a "val" or "var":
    val list1 = mutableListOf('A') // or "var"
    list1 += 'A' // is the same:
    list1.plusAssign('A')

    // Immutable List assigned to a "val":
    val list2 = listOf('B')
    // list2 += 'B' // is the same:
    // list2 = list2 + 'B'

    // Immutable List assigned to a "var":
    var list3 = listOf('C')
    list3 += 'C' // is the same:
    val newList = list3 + 'C'
    list3 = newList

    list1 eq "[A, A, A]"
    list2 eq "[B]"
    list3 eq "[C, C, C]"
}