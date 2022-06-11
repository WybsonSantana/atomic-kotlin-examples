package introductionToObjects.varargs.exercises

import atomictest.eq

fun printArgs(string: String, vararg numbers: Int) =
    "$string ${numbers.toList()}"

fun main() {
    printArgs("Numbers:", 1, 2, 3, 4, 5) eq "Numbers: [1, 2, 3, 4, 5]"
}