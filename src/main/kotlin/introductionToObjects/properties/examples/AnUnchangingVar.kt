package introductionToObjects.properties.examples

class Sofa {
    val cover: String = "Loveseat cover"
}

fun main() {
    var sofa = Sofa()
    // Not allowed:
    // sofa.cover = "new cover" // Val cannot be reassigned

    sofa = Sofa()
    println(sofa.cover)
}

/*
Output:
Loveseat cover
*/