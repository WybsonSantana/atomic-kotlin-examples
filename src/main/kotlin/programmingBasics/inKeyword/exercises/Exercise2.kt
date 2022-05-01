package programmingBasics.inKeyword.exercises

fun sumOfEven(number: Int): Int {
    var result = 0
    for (i in 0..number step 2) {
        result += i
    }
    return result
}

fun main() {
    println(sumOfEven(100))
}

/*
Output:
2550
*/