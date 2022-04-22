package booleans.examples

fun main() {
    val sunny = true
    val hoursSleep = 6
    val exercise = false
    val temperature = 35

    val happy1 = sunny && temperature >= 30 || exercise && hoursSleep >= 8
    println(happy1)

    val sameHappy1 =(sunny && temperature >= 30) || (exercise && hoursSleep >= 8)
    println(sameHappy1)

    val notSame = (sunny && temperature >= 30 || exercise) && hoursSleep >= 8
    println(notSame)
}

/*
Output:
true
true
false
*/