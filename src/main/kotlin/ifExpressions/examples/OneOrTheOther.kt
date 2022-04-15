package ifExpressions.examples

fun oneOrTheOther(condition: Boolean): String =
    if (condition)
        "It's true!" // No 'return' necessary
    else
        "It's false!"

fun main() {
    val x = 1
    println(oneOrTheOther(x == 1))
    println(oneOrTheOther(x == 2))

}

/*
Output:
Its true!
It's false!
*/