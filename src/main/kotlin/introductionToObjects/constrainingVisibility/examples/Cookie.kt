package introductionToObjects.constrainingVisibility.examples

class Cookie(
    private var isReady: Boolean
) {
    private fun crumble() =
        println("Crumble")

    public fun bite() =
        println("Bite")

    fun eat() {
        isReady = true
        crumble()
        bite()
    }
}

fun main() {
    val x = Cookie(false)
    x.bite()
    // Can't access 'isReady': it is private in 'Cookie'
    // x.isReady
    // Can't access 'crumble': it is private in 'Cookie'
    // x.crumble()
    x.eat()
}

/*
Output:
Bite
Crumble
Bite
*/