package numberTypes.examples

fun main() {
    val i: Int = Int.MAX_VALUE
    println(0L + i + i) // the resulti is a Long
    println(1_000_000 * 1_000_000L) // The result is a Long
}

/*
Output:
4294967294
1000000000000
*/