package ifExpressions.examples

fun trueOrFalse(condition: Boolean): String {
    if (condition)
        return "It's true!"
    return "It's false!"
}

fun main() {
    val x = 1
    println(trueOrFalse(x < 3))
    println(trueOrFalse(x >= 3))

}

/*
Output:
It's true!
It's false!
*/