package numberTypes.examples

fun bmiMetric(
    weight: Double,
    height: Double
): String {
    val bmi = weight / (height * height)
    return if (bmi < 18.5) "Under weight!"
    else if (bmi < 25) "Normal weight!"
    else "Over weight!"
}

fun main() {
val weight = 72.57
    val height = 1.727
    val status = bmiMetric(weight, height)
    println(status)
}

/*
Output:
Normal weight
*/