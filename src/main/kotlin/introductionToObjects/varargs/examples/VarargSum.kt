package introductionToObjects.varargs.examples

import atomictest.eq

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (i in numbers) {
        result += i
    }
    return result
}

fun main() {
    sum(11, 17, 19, 22) eq 69
    sum(1, 3, 5, 7, 11) eq 27
    sum() eq 0
}