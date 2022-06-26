package usability.namedAndDefaultArgs.exercises

import atomictest.eq

class SimpleTime(
    val hours: Int = 0,
    val minutes: Int = 0,
    val seconds: Int = 0,
    val nanoseconds: Int = 0
) {

    fun toSecondOfDay(): Int =
        ((hours * 60 + minutes) * 60) + seconds

    fun toNanoOfDay(): Long =
        (toSecondOfDay() * 1_000_000_000L) + nanoseconds
}

fun main() {
    val noon = SimpleTime(hours = 12)
    noon.toSecondOfDay() eq noon.hours.times(3600)

    val nanosecond = SimpleTime(nanoseconds = 1)
    nanosecond.toNanoOfDay() eq nanosecond.nanoseconds.toLong()

    val second = SimpleTime(seconds = 1)
    second.toNanoOfDay() eq second.seconds.times(1_000_000_000L)

    val halfPastSeven = SimpleTime(hours = 6, minutes = 30)
    halfPastSeven.toSecondOfDay() eq halfPastSeven.hours.times(3600).plus(halfPastSeven.minutes.times(60))
    halfPastSeven.toNanoOfDay() eq halfPastSeven.toSecondOfDay().times(1_000_000_000L)
}