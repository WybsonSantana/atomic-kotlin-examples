package introductionToObjects.properties.exercises

class Robot1 {
    var x = 0
    var y = 0

    fun right(steps: Int) {
        x += steps
    }

    fun left(steps: Int) {
        x -= steps
    }

    fun up(steps: Int) {
        y -= steps
    }

    fun down(steps: Int) {
        y += steps
    }

    fun getLocation(): String = "($x, $y)"
}

fun main() {
    val robot = Robot1()
    println(robot.getLocation())
    robot.right(3)
    println(robot.getLocation())
    robot.down(2)
    println(robot.getLocation())
}

/*
Output:
(0, 0)
(3, 0)
(3, 2)
*/