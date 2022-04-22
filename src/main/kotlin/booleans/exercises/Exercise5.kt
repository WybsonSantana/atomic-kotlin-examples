package booleans.exercises

fun isPositive(number: Double): Boolean {
    return if (number > 0) true else false
}

fun main() {
    println(isPositive(17.0))
    println(isPositive(-1.6))
}

/*
Output:
true
false
*/