package introductionToObjects.exceptions.examples.usingCapture

import atomictest.*

fun averageIncome(income: Int, months: Int) =
    income / months

fun main() {
    averageIncome(3300, 3) eq 1100

    capture {
        averageIncome(5500, 0)
    } eq "ArithmeticException: / by zero"
}