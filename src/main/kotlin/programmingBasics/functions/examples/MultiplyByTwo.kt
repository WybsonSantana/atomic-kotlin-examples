package programmingBasics.functions.examples

fun multiplyByTwo(x: Int): Int {
    println("Inside function multiplyByTwo")
    return x * 2
}

fun main() {
    val result = multiplyByTwo(11)
    println(result)
}

/*
Output:
22
*/