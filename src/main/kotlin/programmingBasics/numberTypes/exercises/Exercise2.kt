package programmingBasics.numberTypes.exercises

fun main() {
    val million = 1_000_000
    println(million)
    println("million type: ${million.javaClass.kotlin.simpleName}\n")

    val billion = 1_000_000_000
    println(billion)
    println("billion type: ${billion.javaClass.kotlin.simpleName}\n")

    val trillion = 1_000_000_000_000
    println(trillion)
    println("trillion type: ${trillion.javaClass.kotlin.simpleName}\n")

    val quadrillion = 1_000_000_000_000_000
    println(quadrillion)
    println("quadrillion type: ${quadrillion.javaClass.kotlin.simpleName}\n")

    val quintillion = 1_000_000_000_000_000_000
    println(quintillion)
    println("quintillion type: ${quintillion.javaClass.kotlin.simpleName}\n")
}

/*
Output:
1000000
million type: Int

1000000000
billion type: Int

1000000000000
trillion type: Long

1000000000000000
quadrillion type: Long

1000000000000000000
quintillion type: Long
*/