package ifExpressions.exercises

fun authorization(pin: Int): String {
    val code = 1911
    if (pin == code)
        return "Authorized!"
    return "Not authorized!"
}

fun main() {
    println(authorization(1234)) // Not authorized!
    println(authorization(1911)) // Authorized!

}