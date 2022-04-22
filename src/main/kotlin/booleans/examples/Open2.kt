package booleans.examples

fun isOpen2(hour: Int) {
    val open = 9
    val closed = 20
    println("Operating: 9 - 20")
    val status = hour >= open && hour < closed
    println("Open: $status")
}

fun main() = isOpen2(17)

/*
Output:
Operating: 9 - 20
Open: true
*/