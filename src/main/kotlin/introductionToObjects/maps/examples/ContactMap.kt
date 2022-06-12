package introductionToObjects.maps.examples

import atomictest.eq

class Contact(
    val name: String,
    val phone: String
) {
    override fun toString() =
        "Contact: $name, $phone"
}

fun main() {
    val miffy = Contact("Miffy", "(11) 2222-3333")
    val kitty = Contact("Kitty", "(11) 3333-4444")

    val contacts = mapOf(
        miffy.phone to miffy.name,
        kitty.phone to kitty.name
    )

    contacts["(11) 2222-3333"] eq "Miffy"
    contacts["(11) 3333-4444"] eq "Kitty"
    contacts["(11) 4444-5555"] eq null
}