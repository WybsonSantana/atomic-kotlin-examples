package introductionToObjects.constructors.exercises

class Robot1(var fieldSize: Int, var x: Int, var y: Int) {
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
    val robot = Robot1(10, 1, 1)
    println(robot.getLocation())
    robot.up(2)
    println(robot.getLocation())
    robot.left(10)
    println(robot.getLocation())
}

/*
Output:
(1, 1)
(1, 9)
(1, 9)
*/