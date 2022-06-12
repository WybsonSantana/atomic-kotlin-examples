package introductionToObjects.maps.exercises

import atomictest.capture
import atomictest.eq

class Hamster(
    val name: String
) {
    override fun toString() =
        "Hamster name: $name"
}

class Cage(
    private val maxCapacity: Int
) {
    private val hamsters = mutableListOf<Hamster>()

    fun put(hamster: Hamster): Boolean {
        if (hamsters.size == maxCapacity) {
            return false
        } else {
            hamsters += hamster
        }
        return true
    }

    fun get(name: String): Hamster {
        for (hamster in hamsters) {
            if (hamster.name == name) {
                return hamster
            }
        }
        throw NoSuchElementException("No hamster called $name")
    }
}

fun main() {
    val cage = Cage(2)
    cage.put(Hamster("Alice")) eq true
    cage.put(Hamster("Puff")) eq true
    cage.put(Hamster("Fliff")) eq false
    cage.get("Alice") eq "Hamster name: Alice"

    capture {
        cage.get("Bobby")
    } eq "NoSuchElementException: No hamster called Bobby"
}