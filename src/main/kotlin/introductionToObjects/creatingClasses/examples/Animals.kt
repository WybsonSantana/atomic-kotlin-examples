package introductionToObjects.creatingClasses.examples

// Create some classes:
class Giraffe
class Bear
class Hippo

fun main() {
    val giraffe1 = Giraffe()
    val giraffe2 = Giraffe()
    val bear = Bear()
    val hippo = Hippo()

    // Each object() is unique:
    println(giraffe1)
    println(giraffe2)
    println(bear)
    println(hippo)
}

/*
Output:
Giraffe@511baa65
Giraffe@340f438e
Bear@30c7da1e
Hippo@5b464ce8
*/