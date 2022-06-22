package introductionToObjects.propertyAccessors.examples

import atomictest.eq

class Data(var i: Int)

fun main() {
    val data = Data(10)
    data.i eq 10 // Read the "i" property
    data.i = 20 // Write the "i" property
    data.i eq 20
}