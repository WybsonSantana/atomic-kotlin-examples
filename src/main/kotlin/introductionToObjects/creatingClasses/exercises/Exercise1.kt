package introductionToObjects.creatingClasses.exercises

class SomeClass {
    fun a() {
        println("Atomic Kotlin")
    }

    fun b() {
        a()
    }

    fun c() {
        this.b()
    }
}

fun main() {
    SomeClass().c()
}

/*
Output:
Atomic Kotlin
*/