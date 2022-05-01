package expressionsAndStatements.examples

fun unitFun() = Unit

fun main() {
    println(unitFun())
    val u1: Unit = println(42)
    println(u1)
    val u2 = println(10) // Type inference
    println(u2)
}

/*
Output:
kotlin.Unit
42
kotlin.Unit
10
kotlin.Unit
*/