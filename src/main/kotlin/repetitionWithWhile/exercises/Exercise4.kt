package repetitionWithWhile.exercises

fun sumOfOdd(number: Int): Int {
    var result = 0
    var i = 0
    while (i <= number) {
        if (i % 2 != 0) {
            result += i
        }
        i++
    }
    return result
}

fun main() {
    println(sumOfOdd(10))
}

/*
Output:
25
*/