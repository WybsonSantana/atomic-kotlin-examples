package programmingBasics.loopingAndRanges.exercises

fun factorial1(n: Int): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main() {
    println(factorial1(5))
}

/*
Output:
120
*/