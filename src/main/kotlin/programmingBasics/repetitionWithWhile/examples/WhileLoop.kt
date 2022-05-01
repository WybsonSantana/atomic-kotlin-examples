package programmingBasics.repetitionWithWhile.examples

fun conditionWhile(i: Int) = i < 100

fun main() {
    var i = 0
    while (conditionWhile(i)) {
        print("Kotlin ")
        i += 10
    }
}

/*
Output:
Kotlin Kotlin Kotlin Kotlin Kotlin Kotlin Kotlin Kotlin Kotlin Kotlin
*/