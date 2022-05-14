package introductionToObjects.properties.exercises

class Counter {
    var value = 0

    fun inc() {
        value += 10
        println(value)
    }

    fun dec() {
        value -= 10
        println(value)
    }
}

fun main() {
    val counter = Counter()
    counter.value = 22
    counter.inc()
    counter.dec()
}

/*
Output:
32
22
*/