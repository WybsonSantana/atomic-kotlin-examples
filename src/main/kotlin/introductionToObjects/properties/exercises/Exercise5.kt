package introductionToObjects.properties.exercises

class AnimalQuantities() {
    var dog = 0
    var cat = 0
    var bird = 0

    fun show(): String {
        return "Animal quantities:\n\tDog: $dog\n\tCat: $cat\n\tBird: $bird"
    }
}

fun main() {
    var animalQuantities = AnimalQuantities()
    animalQuantities.dog = 5
    animalQuantities.cat = 7
    animalQuantities.bird = 3
    println(animalQuantities.show())
}

/*
Output:
Animal quantities:
	Dog: 5
	Cat: 7
	Bird: 3
*/