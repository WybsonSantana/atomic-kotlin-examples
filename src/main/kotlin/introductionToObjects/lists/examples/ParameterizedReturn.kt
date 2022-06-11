package introductionToObjects.lists.examples

import atomictest.eq

// Return type is inferred:
fun inferred(p: Char, q: Char) =
    listOf(p, q)

// Explicit return type:
fun explicit(p: Char, q: Char): List<Char> =
    listOf(p, q)

fun main() {
    inferred('a', 'b') eq "[a, b]"
    explicit('c', 'd') eq "[c, d]"
}