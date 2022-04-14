package dataTypes.exercises

fun main() {
    val int: Int = 17
    val double: Double = 1.6
    val boolean: Boolean = false
    val string: String = "Kotlin "
    val character: Char = 'k'

    // Can be combined:
    // String can be combined with every other types:

    val si: String = string + int
    println(si)

    val sd: String = string + double
    println(sd)

    val sb: String = string + boolean
    println(sb)

    val sc: String = string + character
    println(sc)

    val d1: Double = int + double
    println(d1)

    val d2: Double = double + int
    println(d2)

    val s1: String = character + string
    println(s1)

    val c1: Char = character + int
    println(c1)

    println(
        "The type that can be combined " +
        "with every other types using '+':"
    )
    println("String")

    // val bb = boolean + boolean
    // val ic = int + character
    // val ds = double + string
}