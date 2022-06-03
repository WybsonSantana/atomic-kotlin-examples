package introductionToObjects.testing.examples.testing2

import atomictest.*

fun main() {
    // Everything fails:
    calculateBMI(160, 68) eq "Normal weight"
    calculateBMI(100, 68) neq "Underweight"
    calculateBMI(100, 68) eq "Overweight"
}

fun calculateBMI(lbs: Int, height: Int): String {
    val bmi = lbs / (height * height) * 703.07

    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}