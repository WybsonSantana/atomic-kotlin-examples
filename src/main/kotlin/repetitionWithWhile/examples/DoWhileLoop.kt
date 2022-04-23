package repetitionWithWhile.examples

fun conditionDoWhile(i: Int) = i < 100

fun main() {
    var i = 0
    do {
        print("Kotlin ")
        i += 10
    } while (conditionDoWhile(i))
}

/*
Output:
Kotlin Kotlin Kotlin Kotlin Kotlin Kotlin Kotlin Kotlin Kotlin Kotlin
*/