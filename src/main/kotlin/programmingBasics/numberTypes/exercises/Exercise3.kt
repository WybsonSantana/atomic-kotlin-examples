package programmingBasics.numberTypes.exercises

fun convertFahrenheitToCelsius(fahrenheit: Double): Double =
    (fahrenheit - 32) * 5 / 9

fun convertCelsiusToFahrenheit(celsius: Double): Double =
    celsius * 9 / 5 + 32

fun main() {
    println(convertFahrenheitToCelsius(68.0))
    println(convertCelsiusToFahrenheit(20.0))
}

/*
Output:
20.0
68.0
*/