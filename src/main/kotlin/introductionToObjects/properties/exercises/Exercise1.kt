package introductionToObjects.properties.exercises

class SomeInts {
    val a = 22
    val b = 17
    var c: Int = 0

    fun add(): Int {
        c = a + b
        return c
    }
}

fun main() {
    val numbers = SomeInts()
    println(numbers.add())
}

/*
Output:
39
*/