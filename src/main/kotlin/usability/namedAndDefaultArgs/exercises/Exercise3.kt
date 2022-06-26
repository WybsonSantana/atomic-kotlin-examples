package usability.namedAndDefaultArgs.exercises

import atomictest.eq

fun joinComments(s: String): String =
    s.trimMargin("// ").lines().joinToString("; ")

fun main() {
    val string = """
        // first
        // second
        // third
    """

    joinComments(string) eq "first; second; third"
}