package introductionToObjects.objectsEverywhere.examples

fun fraction(numerator: Long, denominator: Long) =
    numerator.toDouble() / denominator

fun main() {
    val num = 1
    val den = 2
    val result = fraction(num.toLong(), den.toLong())
    println(result)
}

/*
Output:
0.5
*/