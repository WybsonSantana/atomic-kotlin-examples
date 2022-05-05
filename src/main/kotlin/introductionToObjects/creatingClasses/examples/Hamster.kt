package introductionToObjects.creatingClasses.examples

class Hamster {
    fun speak() = "Squeak! "
    fun exercise() =
        this.speak() +
            speak() +
            "Running on wheel"
}

fun main() {
    val hamster = Hamster()
    println(hamster.exercise())
}

/*
Output:
Squeak! Squeak! Running on wheel
*/