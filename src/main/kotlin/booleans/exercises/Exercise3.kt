package booleans.exercises

fun and(b1: Boolean, b2: Boolean): Boolean =
    if (b1) b2 else false

fun or(b1: Boolean, b2: Boolean): Boolean =
    if (b1) true else b2

fun main() {
    println(and(true, true))
    println(and(true, false))
    println(or(true, true))
    println(or(true, false))
}

/*
Output:
true
false
true
true
*/