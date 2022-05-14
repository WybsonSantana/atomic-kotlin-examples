package introductionToObjects.properties.examples

val constant = 17
var counter = 0

fun inc() = counter++

fun main() {
    println(inc())
}

/*
Output:
0
*/