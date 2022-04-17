package numberTypes.exercises

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
    (((hours * 60 + minutes) * 60) + seconds) * 1000L

fun main() {
    println(convertToMilliseconds(1, 35, 45))
}

/*
Output:
5745000
*/