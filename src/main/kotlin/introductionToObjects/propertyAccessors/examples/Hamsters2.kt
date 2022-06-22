package introductionToObjects.propertyAccessors.examples

class Hamster2(val name: String)

class Cage2(private val maxCapacity: Int) {
    private val hamsters = mutableListOf<Hamster2>()
    fun capacity(): Int =
        maxCapacity - hamsters.size

    fun isFull(): Boolean =
        hamsters.size == maxCapacity
}

fun main() {

}