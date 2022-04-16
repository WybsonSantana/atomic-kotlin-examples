package stringTemplates.examples

fun main() {
    val condition = true
    println("${if (condition) 'a' else 'b'}")
    val x = 17
    println("$x + 5 = ${x + 5}")

}

/*
Output:
a
17 + 5 = 22
*/