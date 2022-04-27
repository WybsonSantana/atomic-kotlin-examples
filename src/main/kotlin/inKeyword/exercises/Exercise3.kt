package inKeyword.exercises

fun isLowerCase(char: Char) = char in 'a'..'z'

fun main() {
    println("is lower case? ${isLowerCase('A')}")
    println("is lower case? ${isLowerCase('b')}")
}

/*
Output:
is lower case? false
is lower case? true
*/