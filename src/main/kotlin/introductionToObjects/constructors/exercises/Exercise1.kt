package introductionToObjects.constructors.exercises

class Floating(val number: Double) {
    override fun toString() = number.toString()
}

fun main() {
    val floating = Floating(1.6)
    println(floating)
}

/*
Output:
1.6
*/