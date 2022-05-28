package introductionToObjects.constrainingVisibility.examples

fun main() {
    // Can't access private members declared in another file
    // Can't access 'Animal': it is private in file
    // val rabbit = Animal("Rabbit")
    // Can't access 'recordAnimal': it is private in file
    // recordAnimal(rabbit)
    // Can't access 'index': it is private in file
    // index++

    recordAnimals()
    recordAnimalsCount()
}

/*
Output:
Animal #0: Tiger
Animal #1: Antelope
2 animals are here.
*/