package stringTemplates.exercises

fun findMax(number1: Int, number2: Int): Int =
    if (number1 > number2) number1 else number2

fun main() {
    val number1 = 17
    val number2 = 11
    println("The biggest between $number1 and $number2 is ${findMax(number1, number2)}.")
}

/*
Output:
The biggest between 17 and 11 is 17.
*/