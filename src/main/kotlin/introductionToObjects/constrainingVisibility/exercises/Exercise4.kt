package introductionToObjects.constrainingVisibility.exercises

fun printSum(x: Int) {
    if (x <= 0) {
        return println("Incorrect input: $x should be positive!")
    }
    return println((0..x).sum())
}

fun main() {
    printSum(-10)
    printSum(10)
}

/*
Output:
Incorrect input: -10 should be positive!
55
*/