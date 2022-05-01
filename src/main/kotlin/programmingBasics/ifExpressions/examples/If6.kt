package programmingBasics.ifExpressions.examples

fun main() {
    val num1 = -11
    val num2 = 22

    val result1 = if (num1 < 0) "It's negative!" else "It's positive!"
    val result2 = if (num2 < 0) "It's negative!" else "It's positive!"

    println(result1)
    println(result2)

}

/*
Output:
It's negative!
It's positive!
*/