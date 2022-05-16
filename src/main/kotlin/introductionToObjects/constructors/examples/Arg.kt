package introductionToObjects.constructors.examples

class Alien(name: String) {
    val greeting = "Poor, $name!"
}

fun main() {
    val alien = Alien("Reticulum")
    println(alien.greeting)

    // alien.name // Error
}

/*
Output:
Poor, Reticulum!
*/