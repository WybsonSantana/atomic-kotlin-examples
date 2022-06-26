package usability.namedAndDefaultArgs.exercises

import atomictest.eq

class Rectangle(
    val side1: Double = 1.0,
    val side2: Double = 2.0,
    val color: String = "yellow"
) {

    override fun toString() =
        "$color rectangle $side1 x $side2"
}

fun main() {
    Rectangle() eq "yellow rectangle 1.0 x 2.0"

    // Without argument names
    Rectangle(1.1) eq "yellow rectangle 1.1 x 2.0"
    Rectangle(1.1, 2.2, "blue") eq "blue rectangle 1.1 x 2.2"

    // Mixed positional and named arguments
    Rectangle(1.1, 2.2, color = "red") eq "red rectangle 1.1 x 2.2"
    Rectangle(side1 = 1.1, side2 = 2.2, "orange") eq "orange rectangle 1.1 x 2.2"

    // Names for all arguments
    Rectangle(side1 = 1.1, side2 = 2.2, "green") eq "green rectangle 1.1 x 2.2"
}