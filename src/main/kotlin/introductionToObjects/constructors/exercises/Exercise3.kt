package introductionToObjects.constructors.exercises

class Robot2(var fieldSize: Int, var x: Int, var y: Int) {
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

    override fun toString(): String {
        return "Robot2(x=$x, y=$y)"
    }
}

fun main() {
    val robot = Robot2(10, 1, 1)
    println(robot)
}

/*
Output:
Robot2(x=1, y=1)
*/