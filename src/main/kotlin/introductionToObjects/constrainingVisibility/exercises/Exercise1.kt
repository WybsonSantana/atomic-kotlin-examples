package introductionToObjects.constrainingVisibility.exercises

class Alien(
    val name: String,
    val species: String,
    private var planet: String
) {

    fun movePlanet(newPlanet: String) {
        planet = newPlanet
    }

    override fun toString() =
        "Alien: $name, $species: $planet"

}

fun main() {
    val alien1 = Alien("Arthricia", "Cat Person", "PurgeWorld")
    println(alien1)
    alien1.movePlanet("Earth C-137")
    println(alien1)

    println()

    val alien2 = Alien("Dale", "Giant", "Gearworld")
    println(alien2)
    alien2.movePlanet("Parblesnops")
    println(alien2)
}

/*
Output:
Alien: Arthricia, Cat Person: PurgeWorld
Alien: Arthricia, Cat Person: Earth C-137

Alien: Dale, Giant: Gearworld
Alien: Dale, Giant: Parblesnops
*/