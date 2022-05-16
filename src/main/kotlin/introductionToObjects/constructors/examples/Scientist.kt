package introductionToObjects.constructors.examples

class Scientist(val name: String) {
    override fun toString(): String =
        "Scientist(name='$name')"
}

fun main() {
    val zeep = Scientist("Zeep Xanflorp")
    println(zeep)
}

/*
Output:
Scientist(name='Zeep Xanflorp')
*/