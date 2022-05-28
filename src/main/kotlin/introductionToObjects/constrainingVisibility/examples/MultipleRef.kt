package introductionToObjects.constrainingVisibility.examples

class Counter(var start: Int) {
    fun increment() {
        start += 1
    }

    override fun toString() = start.toString()
}

class CounterHolder(counter: Counter) {
    private val ctr = counter

    override fun toString() =
        "CounterHolder: $ctr"
}

fun main() {
    val c = Counter(11)
    val ch1 = CounterHolder(c)
    println(ch1)
    c.increment()
    println(ch1)
    val ch2 = CounterHolder(Counter(9))
    println(ch2)
}

/*
Output:
CounterHolder: 11
CounterHolder: 12
CounterHolder: 9
*/