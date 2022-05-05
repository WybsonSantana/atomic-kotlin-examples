package introductionToObjects.creatingClasses.exercises

class Hello {
    fun message(): String {
        return "Hello!"
    }
}

fun main() {
    val hello = Hello()
    println(hello.message().uppercase())
    println(hello.message().lowercase())
}

/*
Output:
HELLO!
hello!
*/