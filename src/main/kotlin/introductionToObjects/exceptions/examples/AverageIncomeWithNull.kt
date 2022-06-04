package introductionToObjects.exceptions.examples.withNull

import atomictest.*

fun averageIncome(income: Int, months: Int) =
    if (months == 0)
        null
    else
        income / months

fun main() {
    averageIncome(3300, 3) eq 1100
    averageIncome(5500, 0) eq null
}