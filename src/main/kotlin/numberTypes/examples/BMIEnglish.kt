package numberTypes.examples

fun bmiEnglish(
    weight: Int,
    height: Int
): String {
    val bmi = weight / (height * height) * 703.07
    return if (bmi < 18.5) "Under weight!"
    else if (bmi < 25) "Normal weight!"
    else "Over weight!"
}

fun main() {
    val weight = 160
    val height = 68
    val status = bmiEnglish(weight, height)
    println(status)
}

/*
Output:
Under weight!
*/