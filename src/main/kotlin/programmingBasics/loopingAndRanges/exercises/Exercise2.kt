package programmingBasics.loopingAndRanges.exercises

fun factorial2(n: Int): Long {
    var result = 1L
    for (i in n downTo 1) {
        result *= i
    }
    return result
}

fun sumOfFactorials(n: Int): Long {
    var result = 0L
    for (i in n downTo 1) {
        result += factorial2(i)
    }
    return result
}

fun main() {
    println(sumOfFactorials(10))
}

/*
Output:
4037913
*/