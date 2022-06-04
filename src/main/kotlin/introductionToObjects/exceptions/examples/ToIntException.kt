package introductionToObjects.exceptions.examples

fun erroneousCode() {
    // Uncomment this line to get an exception:
    // val i = "1$".toInt() // Exception in thread "main" java.lang.NumberFormatException: For input string: "1$"
}

fun main() {
    erroneousCode()
}