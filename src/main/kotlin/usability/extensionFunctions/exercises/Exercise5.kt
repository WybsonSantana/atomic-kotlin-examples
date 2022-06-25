package usability.extensionFunctions.exercises

import atomictest.eq

fun Int.inc10() = this + 10

fun Int.dec10() = this - 10

fun main() {
    5.inc10() eq 15
    5.dec10() eq -5
}