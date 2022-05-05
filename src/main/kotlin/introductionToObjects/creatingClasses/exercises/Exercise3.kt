package introductionToObjects.creatingClasses.exercises

class Robot {
    fun right(steps: Int) {
        println("Right $steps steps!")
    }

    fun left(steps: Int) {
        println("Left $steps steps!")
    }

    fun down(steps: Int) {
        println("Down $steps steps!")
    }

    fun up(steps: Int) {
        println("Up $steps steps!")
    }
}

fun main() {
    val robot = Robot()
    robot.up(11)
    robot.left(1)
    robot.right(22)
    robot.down(2)
}

/*
Output:
Up 11 steps!
Left 1 steps!
Right 22 steps!
Down 2 steps!
*/