package loopingAndRanges.exercises

fun showHaveTriangle(n: Int) {
    for (i in 1..n) {
        repeat(i) {
            print("#")
        }
        println()
    }
}

fun main() {
    showHaveTriangle(5)
}

/*
Output:
#
##
###
####
#####
*/