package ifExpressions.exercises

fun findMax(number1: Int, number2: Int): Int =
    if (number1 > number2) number1 else number2

fun main() {
    println(findMax(17, 11)) // 17
    println(findMax(8, 11)) // 11

}