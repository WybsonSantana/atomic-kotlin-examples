package introductionToObjects.testing.exercises

import atomictest.*

fun sum(x: Int, y: Int, z: Int) = x + y + z

fun main() {
    sum(1, 1, 1) eq 3
    sum(1, 2, 3) eq 6
    sum(1, 2, 3) neq 5
    sum(-1, -10, -100) eq -111
    sum(2131, 81783, 16085) eq 99999

}