package usability.extensionFunctions.exercises

import atomictest.eq

fun Int.isOdd(): Boolean = this % 2 == 1

fun Int.isEven(): Boolean = !isOdd()

fun main() {
    3.isOdd() eq true
    6.isEven() eq true
}