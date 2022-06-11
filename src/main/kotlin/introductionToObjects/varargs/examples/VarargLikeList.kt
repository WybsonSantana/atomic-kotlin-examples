package introductionToObjects.varargs.examples

import atomictest.eq

fun evaluate(vararg numbers: Double) =
    """
        Size: ${numbers.size}
        Sum: ${numbers.sum()}
        Average: ${numbers.average()}
    """.trimIndent()

fun main() {
    evaluate(10.0, -5.0, 11.0, 17.0, -3.0) eq """
        Size: 5
        Sum: 30.0
        Average: 6.0
    """.trimIndent()
}