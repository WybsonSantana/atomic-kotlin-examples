package programmingBasics.inKeyword.examples

fun main() {
    val values = 1..3
    for (i in values) {
        println("Iteration $i")
    }
    val i = 2
    if (i in values)
        println("$i is a member of $values")
}

/*
Output:
Iteration 1
Iteration 2
Iteration 3
2 is a member of 1..3
*/