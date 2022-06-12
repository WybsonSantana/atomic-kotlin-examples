package introductionToObjects.maps.exercises

import atomictest.eq

class Contact(
    val name: String,
    val phone: String
) {
    override fun toString() =
        "Contact: $name - $phone"
}

fun buildNumberToContactMap(contactList: List<Contact>): Map<String, Contact> {
    val map = mutableMapOf<String, Contact>()
    for (contact in contactList) {
        map[contact.phone] = contact
    }
    return map

}

fun main() {
    val contactList = listOf(
        Contact("Miffy", "(11) 2222-3333"),
        Contact("Kitty", "(11) 3333-4444")
    )

    val contactsByPhone = buildNumberToContactMap(contactList)
    contactsByPhone eq "{(11) 2222-3333=Contact: Miffy - (11) 2222-3333, (11) 3333-4444=Contact: Kitty - (11) 3333-4444}"
}