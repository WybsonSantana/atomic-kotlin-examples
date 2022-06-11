package introductionToObjects.lists.exercises

import atomictest.eq

fun checkAnagrams(string1: String, string2: String): Boolean {
    return string1.lowercase().toList().sorted() == string2.lowercase().toList().sorted()
}

fun main() {
    checkAnagrams("Thing", "Night") eq true
    checkAnagrams("Leader", "Dealer") eq true
    checkAnagrams("Sector", "Escort") eq true
    checkAnagrams("Tablet", "Battle") eq true
    checkAnagrams("Friend", "Finder") eq true
    checkAnagrams("Senator", "Treason") eq true
    checkAnagrams("Terrain", "Trainer") eq true
    checkAnagrams("Teaching", "Cheating") eq true

    checkAnagrams("Escort", "Sectors") eq false
    checkAnagrams("Sections", "Notices") eq false
}