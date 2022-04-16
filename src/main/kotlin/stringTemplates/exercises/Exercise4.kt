package stringTemplates.exercises

fun findMin(number1: Int, number2: Int): Int =
    if (number1 < number2) number1 else number2

fun main() {
    val number1 = 17
    val number2 = 11
    println("The smallest between $number1 and $number2 is ${findMin(number1, number2)}.")

}

/*
Output:
The smallest between 17 and 11 is 11.
*/