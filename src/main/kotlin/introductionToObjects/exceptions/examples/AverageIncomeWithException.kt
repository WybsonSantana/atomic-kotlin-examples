package introductionToObjects.exceptions.examples.properException

import atomictest.*

fun averageIncome(income: Int, months: Int) =
    if (months == 0)
        throw IllegalArgumentException(
            "Months cannot be zero"
        )
    else
        income / months

fun main() {
    averageIncome(3300, 3) eq 1100

    capture {
        averageIncome(5500, 0)
    } eq "IllegalArgumentException: Months cannot be zero"
}