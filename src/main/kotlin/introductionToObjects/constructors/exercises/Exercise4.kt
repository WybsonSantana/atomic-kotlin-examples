package introductionToObjects.constructors.exercises

class Human(
    val name: String,
    val age: Int
) {
    override fun toString(): String =
        "Human(name='$name', age=$age)"
}

fun main() {
    val morgan = Human("Morgan", 89)
    println(morgan)
}

/*
Output:
Human(name='Morgan', age=89)
*/