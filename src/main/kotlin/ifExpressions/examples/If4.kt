package ifExpressions.examples

fun main() {
    val x: Int = -11
    if (x > 0)
        println("It's positive!")
    else if (x == 0)
        println("It's zero!")
    else
        println("It's negative!")

}

/*
Output:
It's negative!
*/