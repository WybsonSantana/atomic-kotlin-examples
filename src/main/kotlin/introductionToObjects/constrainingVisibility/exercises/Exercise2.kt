package introductionToObjects.constrainingVisibility.exercises

class Robot1(
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

    fun right(steps: Int) {
        x += steps
        x = crossBoundary(x)
    }

    fun left(steps: Int) {
        x -= steps
        x = crossBoundary(x)
    }

    fun up(steps: Int) {
        y -= steps
        y = crossBoundary(y)
    }

    fun down(steps: Int) {
        y += steps
        y = crossBoundary(y)
    }

    fun getLocation(): String = "($x, $y)"

    override fun toString() = "Robot(x=$x, y=$y)"
}

fun main() {
    val robot1 = Robot2(10, 1, 1)
    println(robot1.getLocation())
    robot1.up(1)
    robot1.right(7)
    println(robot1.toString())

// Cannot access 'x': it is private in 'Robot':
    // println(robot1.x)
}

/*
Output:
(1, 1)
Robot(x=8, y=0)
*/