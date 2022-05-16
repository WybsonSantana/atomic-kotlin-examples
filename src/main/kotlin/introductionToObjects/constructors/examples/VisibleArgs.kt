package introductionToObjects.constructors.examples

class MutableNameAlien(var name: String)

class FixedNameAlien(val name: String)

fun main() {
    val alien1 = MutableNameAlien("Reverse Giraffe")
    val alien2 = FixedNameAlien("Krombopulos Jordan")

    alien1.name = "Parasite"
    println(alien1.name)

    // Can't do this:
    // alien2.name = "Parasite"
}

/*
Output:
Parasite
*/