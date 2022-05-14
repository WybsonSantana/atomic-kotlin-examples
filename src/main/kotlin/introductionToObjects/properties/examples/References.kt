package introductionToObjects.properties.examples

class Kitchen {
    var table: String = "Round table"
}

fun main() {
    val kitchen1 = Kitchen()
    val kitchen2 = kitchen1
    println("Kitchen1; ${kitchen1.table} ")
    println("Kitchen2; ${kitchen2.table} ")
    kitchen1.table = "Square table"
    println("Kitchen1; ${kitchen1.table} ")
    println("Kitchen2; ${kitchen2.table} ")
}

/*
Output:
Kitchen1; Round table
Kitchen2; Round table
Kitchen1; Square table
Kitchen2; Square table
*/