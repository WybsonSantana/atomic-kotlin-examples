package introductionToObjects.constructors.exercises

class Person(
    val firstName: String,
    val lastName: String,
    val birthDate: String,
    val email: String
) {
    override fun toString(): String =
        """
            First name: $firstName
            Last name: $lastName
            Birth date: $birthDate
            E-mail: $email
        """.trimIndent()
}

fun main() {
    val morgan = Person(
        firstName = "Morgan",
        lastName = "Pool",
        birthDate = "1959-12-03",
        email = "morgan@pool.com"
    )

    println(morgan)
}

/*
Output:
First name: Morgan
Last name: Pool
Birth date: 1959-12-03
E-mail: morgan@pool.com
*/