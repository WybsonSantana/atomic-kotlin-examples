package introductionToObjects.exceptions.exercises

fun main() {
    println("Cannot be converte to Double: 1,2")
    // println("1,2".toDouble())

    println("12".toDouble())
    println("1.2".toDouble())
    println("1.2e0".toDouble())
    println("1.2e1".toDouble())
    println("1.2e2".toDouble())
    println("1.2e3".toDouble())
    println("1.2e10".toDouble())
    println(("12.3e10").toDouble())
    println("1.2e-1".toDouble())
    println("1.2e-10".toDouble())
}