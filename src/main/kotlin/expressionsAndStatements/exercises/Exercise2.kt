package expressionsAndStatements.exercises

fun f(i: Int, j: Int) = i + j

fun g(s1: String, s2: String) = s1 + s2

fun h() = println("h()")

fun main() {
    val fVal: Int = f(1, 2)
    val gVal: String = g("a", "bc")
    val hVal: Unit = h()

    println(fVal)
    println(gVal)
    println(hVal)
}

/*
Output:
3
abc
kotlin.Unit
*/