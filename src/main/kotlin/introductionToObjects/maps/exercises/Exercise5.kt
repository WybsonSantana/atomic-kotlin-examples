package introductionToObjects.maps.exercises

import atomictest.eq

fun main() {
    val map = mutableMapOf<String, List<Map<String, String>>>()
    map.put(
        "Sabrinne", listOf(
            mapOf("Name" to "Sabrinne"),
            mapOf("Gender" to "female"),
            mapOf("Age" to "22"),
            mapOf("Phone" to "(11) 3333-6969"),
            mapOf("Email" to "sabrinne@mail.com")
        )
    )

    map.getOrDefault("Sabrinne", "Not found!") eq
            "[{Name=Sabrinne}, {Gender=female}, {Age=22}, {Phone=(11) 3333-6969}, {Email=sabrinne@mail.com}]"
}