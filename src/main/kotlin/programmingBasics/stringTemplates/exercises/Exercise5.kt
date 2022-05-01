package programmingBasics.stringTemplates.exercises

fun programmingLanguage(id: Int, name: String, version: String): String =
    """
        ID: $id
        Name: $name
        Version: $version
    """.trimIndent()

fun main() {
    println(
        programmingLanguage(
            id = 1,
            name = "Kotlin",
            version = "1.6.20"
        )
    )
}

/*
ID: 1
Name: Kotlin
Version: 1.6.20
*/