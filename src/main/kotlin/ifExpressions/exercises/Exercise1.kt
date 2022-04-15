package ifExpressions.exercises

fun checkSign(number: Int): String =
    if (number > 0)
        "The number is positive!"
    else if (number < 0)
        "The number is negative!"
    else
        "The number is zero!"

fun main() {
    println(checkSign(17))
    println(checkSign(0))
    println(checkSign(-11))

}