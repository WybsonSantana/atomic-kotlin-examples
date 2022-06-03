package introductionToObjects.testing.examples

import atomictest.*

fun main() {
    trace("Hello")
    trace(17)
    trace("Kotlin!")
    trace eq """
        Hello
        17
        Kotlin!
    """.trimIndent()


}