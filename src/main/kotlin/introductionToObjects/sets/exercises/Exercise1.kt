package introductionToObjects.sets.exercises

import atomictest.eq

fun hasUniqueCharacters(string: String): Boolean {
    return string.toSet().size == string.length
}

fun main() {
    hasUniqueCharacters("AbCd") eq true
    hasUniqueCharacters("AAbbCCdd") eq false
}