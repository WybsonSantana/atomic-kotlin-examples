package numberTypes.examples

fun main() {
    val int = 0 // Infers Int
    val long1 = 0L // Creates Long
    val long2: Long = 0 // Explicit type
    println("$long1, $long2")
}

/*
Output:
0, 0
*/