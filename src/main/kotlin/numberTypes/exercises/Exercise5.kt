package numberTypes.exercises

fun main() {
    val x = 17L
    val y = 1.6F
    val sum = x + y
    println(sum)
    println(sum.javaClass.kotlin.simpleName)
}

/*
Output:
18.6
Float
*/