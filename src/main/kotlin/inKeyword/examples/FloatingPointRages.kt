package inKeyword.examples

fun inFloatRange(number: Double) {
    val range = 1.0..10.0
    println("$number in $range? ${number in range}")
}

fun main() {
    inFloatRange(0.999999)
    inFloatRange(1.6)
    inFloatRange(10.0)
    inFloatRange(10.000001)
}

/*
Output:
0.999999 in 1.0..10.0? false
1.6 in 1.0..10.0? true
10.0 in 1.0..10.0? true
10.000001 in 1.0..10.0? false
*/