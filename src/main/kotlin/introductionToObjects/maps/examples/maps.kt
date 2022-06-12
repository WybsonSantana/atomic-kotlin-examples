package introductionToObjects.maps.examples

import atomictest.eq

fun main() {
    val constants = mapOf(
        "PI" to 3.141,
        "E" to 2.718,
        "PHI" to 1.618
    )

    constants eq "{PI=3.141, E=2.718, PHI=1.618}"

    // Look up a value from a key:
    constants["E"] eq 2.718
    constants.keys eq setOf("PI", "E", "PHI")
    constants.values eq "[3.141, 2.718, 1.618]"

    // Iterate through key-value pairs:
    var keyValue = ""
    for (entry in constants) {
        keyValue += "${entry.key}: ${entry.value}\n"
    }
    keyValue eq """
        PI: 3.141
        E: 2.718
        PHI: 1.618
    """.trimIndent()

    // Unpack during iteration:
    keyValue = ""
    for ((key, value) in constants) {
        keyValue += "$key: $value\n"
    }
    keyValue eq """
        PI: 3.141
        E: 2.718
        PHI: 1.618
    """.trimIndent()
}