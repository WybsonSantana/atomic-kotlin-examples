package introductionToObjects.varargs.examples

fun variable(string: String, vararg double: Double) {}

fun main() {
    variable("abc", 1.0, 2.0)
    variable("xyz", 1.0, 2.0, 3.0)
    variable("xpto", 1.0, 2.0, 3.0, 4.0)
}