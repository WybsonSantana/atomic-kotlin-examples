package introductionToObjects.constructors.examples

fun main() {
    val krombopulosJordan = AlienSpecies("Gromflomite", 2, 2, 2)
    println(krombopulosJordan)
    println(krombopulosJordan.describe())
}

/*
Output:
AlienSpecies@58372a00
Gromflomite with 2 eyes, 2 hands and 2 legs.
*/