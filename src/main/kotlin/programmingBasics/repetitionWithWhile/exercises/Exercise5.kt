package programmingBasics.repetitionWithWhile.exercises

fun showEven(number: Int) {
    var i = 0
    while (i <= number) {
        if (i % 2 == 0) {
            print("$i, ")
        }
        i++
    }
}

fun showOdd(number: Int) {
    var i = 0
    while (i <= number) {
        if (i % 2 != 0) {
            print("$i, ")
        }
        i++
    }
}

fun main() {
    showEven(10)
    println()
    showOdd(10)
}

/*
Output:
0, 2, 4, 6, 8, 10,
1, 3, 5, 7, 9,
*/