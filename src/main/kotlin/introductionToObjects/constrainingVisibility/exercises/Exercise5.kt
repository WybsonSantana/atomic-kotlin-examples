package introductionToObjects.constrainingVisibility.exercises

class Person(
    private val firstName: String,
    private val lastName: String,
    private val email: String
) {

    override fun toString(): String {
        return "First name: $firstName\nLast name: $lastName\nE-mail: $email"
    }
}

fun main() {
    val person = Person("Kittie", "Phoenix", "kittiephoenix@mail.com")
    println(person.toString())
}

/*
Output:
First name: Kittie
Last name: Phoenix
E-mail: kittiephoenix@mail.com
*/