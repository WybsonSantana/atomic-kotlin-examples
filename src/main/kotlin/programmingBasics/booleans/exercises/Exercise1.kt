package programmingBasics.booleans.exercises

fun main() {
    val a = (178 + 131 > 209 + 99) && false
    println(a)

    val b = 1 > 2 || 1 < 2
    println(b)

    val c = (111 - 101 >= 10) && (11.0 > 10.99) && true
    println(c)
}

/*
Output:
false
true
true
*/