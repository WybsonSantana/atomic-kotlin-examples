package introductionToObjects.maps.exercises

import atomictest.eq

fun main() {
    val contacts = mutableMapOf<String, List<String>>()
    contacts.put(
        "Samantha", listOf("(11) 2222-1122", "(11) 2222-2233")
    )

    contacts.put(
        "Kittie", listOf("(11) 3333-4455", "(11) 3333-5566")
    )

    contacts.getOrDefault("Samantha", "Contact not found!") eq "[(11) 2222-1122, (11) 2222-2233]"
    contacts.getOrDefault("Kittie", "Contact not found!") eq  "[(11) 3333-4455, (11) 3333-5566]"
    contacts.getOrDefault("Cindy", "Contact not found!") eq "Contact not found!"
}