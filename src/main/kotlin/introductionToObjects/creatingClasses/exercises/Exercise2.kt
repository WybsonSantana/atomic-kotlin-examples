package introductionToObjects.creatingClasses.exercises

class Giraffe {
    fun displayId() {
        println(toString().substringAfter('@'))
    }
}

fun main() {
    val giraffe1 = Giraffe()
    val giraffe2 = Giraffe()
    val giraffe3 = Giraffe()

    println(giraffe1)
    println(giraffe2)
    println(giraffe3)
}

/*
Output:
Giraffe@36d64342
Giraffe@39ba5a14
Giraffe@511baa65
*/