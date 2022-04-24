package loopingAndRanges.exercises

fun sumOfEven(number: Int): Int {
    var result = 0
    for (i in 1..number) {
        if (i % 2 == 0) {
            result += i
        }
    }
    return result
}

fun main() {
    println(sumOfEven(10))
}

/*
Output:
30
*/