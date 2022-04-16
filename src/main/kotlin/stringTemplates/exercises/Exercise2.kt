package stringTemplates.exercises

fun record(index: Int, status: String, message: String): String =
    "$index [$status] $message \n"

fun main() {
    print(record(1, "Ok!", "Everything is fine."))
    print(record(2, "Fail!", "Something has broken."))

}

/*
Output:
1 [Ok!] Everything is fine.
2 [Fail!] Something has broken.
*/