package introductionToObjects.constrainingVisibility.exercises

class Robot2(
    private val fieldSize: Int,
    private var x: Int,
    private var y: Int
) {

    private fun crossBoundary(coordinate: Int): Int {
        val inBounds = coordinate % fieldSize
        return if (inBounds < 0) {
            fieldSize + inBounds
        } else {
            inBounds
        }
    }

    private fun checkSteps(steps: Int): Boolean {
        if (steps <= 0) {
            println("Steps arguments must be positive. Step: $steps")
            return true
        }
        return false
    }

    fun right(steps: Int) {
        if (checkSteps(steps)) return
        x += steps
        x = crossBoundary(x)
    }

    fun left(steps: Int) {
        if (checkSteps(steps)) return
        x -= steps
        x = crossBoundary(x)
    }

    fun up(steps: Int) {
        if (checkSteps(steps)) return
        y -= steps
        y = crossBoundary(y)
    }

    fun down(steps: Int) {
        if (checkSteps(steps)) return
        y += steps
        y = crossBoundary(y)
    }

    fun getLocation(): String = "($x, $y)"

    override fun toString() = "Robot(x=$x, y=$y)"
}

fun main() {
    val robot = Robot2(10, 1, 1)
    robot.right(-1)
}

/*
Output:
Steps arguments must be positive. Step: -1
*/