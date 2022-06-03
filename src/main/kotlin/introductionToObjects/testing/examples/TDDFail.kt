package introductionToObjects.testing.examples.testing1

import atomictest.*

fun main() {
    // Only the first passes:
    calculateBMI(160, 68) eq "Normal weight"
    calculateBMI(100, 68) eq "Underweight"
    calculateBMI(200, 68) eq "Overweight"
}

fun calculateBMI(lbs: Int, height: Int) =
    "Normal weight"