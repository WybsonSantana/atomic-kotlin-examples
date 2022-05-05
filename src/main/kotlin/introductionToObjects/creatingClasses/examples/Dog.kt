package introductionToObjects.creatingClasses.examples

class Dog {
    fun bark() = "Yip!"
}

fun main() {
    val dog = Dog()
    println(dog.bark())
}

/*
Output:
Yip!
*/