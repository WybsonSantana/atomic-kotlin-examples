package programmingBasics.booleans.exercises

fun showAnd(first: Boolean, second: Boolean) {
    println("$first && $second == ${first && second}")
}

fun showOr(first: Boolean, second: Boolean) {
    println("$first || $second == ${first || second}")
}

fun showTruthTable() {
    showAnd(true, true)
    showAnd(true, false)
    showAnd(false, true)
    showAnd(false, false)
    print("\n")
    showOr(true, true)
    showOr(true, false)
    showOr(false, true)
    showOr(false, false)
}

fun main() {
    showTruthTable()
}

/*
Output:
true && true == true
true && false == false
false && true == false
false && false == false

true || true == true
true || false == true
false || true == true
false || false == false
*/