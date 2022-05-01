package programmingBasics.repetitionWithWhile.exercises

fun displayContent(string: String) {
    var i = 0
    while (i < string.length) {
        println(string[i])
        i++
    }
}

fun main() {
    displayContent("Kotlin")
}

/*
Output:
K
o
t
l
i
n
*/