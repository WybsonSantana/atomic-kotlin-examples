package usability.namedAndDefaultArgs.examples

import atomictest.eq

fun color(red: Int, green: Int, blue: Int) =
    "($red, $green, $blue)"

fun main() {
    color(1, 2, 3) eq "(1, 2, 3)"

    color(
        red = 76,
        green = 89,
        blue = 135
    ) eq "(76, 89, 135)"

    color(17, 22, blue = 0) eq "(17, 22, 0)"
}