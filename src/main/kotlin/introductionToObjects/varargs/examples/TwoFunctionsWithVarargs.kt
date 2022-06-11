package introductionToObjects.varargs.examples

import atomictest.eq

fun first(vararg numbers: Int): String {
    var result = ""
    for (i in numbers) {
        result += "[$i]"
    }
    return result
}

fun second(vararg numbers: Int) =
    first(*numbers)

fun main() {
    second(11, 17, 22) eq "[11][17][22]"
}