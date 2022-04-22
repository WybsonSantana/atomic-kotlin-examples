package booleans.examples

fun isClosed(hour: Int) {
    val open = 9
    val closed = 20
    println("Operating: $open - $closed")
    val status = hour < open || hour >= closed
println("Closed: $status")
}

fun main() = isClosed(8)

/*
Output:
Operating: 9 - 20
Closed: true
*/