package introductionToObjects.creatingClasses.examples

class Cat {
    fun meow() = "Mrrrow!"
}

fun main() {
    val cat = Cat()
    val meow = cat.meow()
    println(meow)
}

/*
Output:
Mrrrow!
*/