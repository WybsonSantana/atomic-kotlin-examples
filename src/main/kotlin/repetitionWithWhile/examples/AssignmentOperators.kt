package repetitionWithWhile.examples

fun main() {
    var n = 10
    val d = 3
    print(n)
    while (n > d) {
        n -= d
        print(" - $d")
    }
    print(" = $n\n")

    var m = 10
    print(m)
    m %= d
    println(" % $d = $m")
}

/*
Output:
10 - 3 - 3 - 3 = 1
10 % 3 = 1
*/