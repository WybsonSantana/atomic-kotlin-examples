package usability.namedAndDefaultArgs.exercises

import atomictest.eq

fun sum(n1: Int, n2: Int) = n1 + n2

fun main() {
    sum(n1 = 5, n2 = 12) eq 17
}