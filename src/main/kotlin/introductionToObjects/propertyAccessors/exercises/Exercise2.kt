package introductionToObjects.propertyAccessors.exercises

import atomictest.eq

class Accessible {
    var mutable: String = ""
        get() {
            println("mutable:get")
            return field
        }
        set(value) {
            println("mutable:set")
            field = value
        }

    val readOnly: String
        get() {
            println("readOnly:get")
            return mutable
        }
}

fun main() {
    val accessible = Accessible()
    accessible.mutable = "abc"
    accessible.readOnly eq "abc"
}