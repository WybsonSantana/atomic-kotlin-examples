package introductionToObjects.lists.examples

import atomictest.eq

fun main() {
    var list = listOf('x') // Immutable list
    list += 'y' // Appears to be mutable

    list eq listOf('x', 'y')
}