package introductionToObjects.objectsEverywhere.exercises

fun reverseInt(number: Int): Int =
    number.toString().reversed().toInt()

fun main() {
    println(reverseInt(1234))
}

/*
Output:
4321
*/