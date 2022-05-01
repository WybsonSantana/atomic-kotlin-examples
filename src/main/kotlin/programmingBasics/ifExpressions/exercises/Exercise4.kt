package programmingBasics.ifExpressions.exercises

fun findMin(number1: Int, number2: Int): Int =
    if (number1 < number2) number1 else number2

fun main() {
    println(findMin(17, -11)) // -11
    println(findMin(8, 17)) // 8

}