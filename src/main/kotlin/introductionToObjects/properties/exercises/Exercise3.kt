package introductionToObjects.properties.exercises

class Robot2 {
    var x = 0
    var y = 0
    val fieldSize = 100

    fun crossBoundary(coordinate: Int): Int {
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
}

fun main() {
    val robot = Robot2()
    println(robot.getLocation())
    robot.up(5)
    println(robot.getLocation())
    robot.left(20)
    println(robot.getLocation())
}

/*
Output:
(0, 0)
(0, 95)
(80, 95)
*/