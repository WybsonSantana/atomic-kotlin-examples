package usability.extensionFunctions.exercises

import atomictest.eq

class Book(val title: String)

fun Book.info(category: String, year: String) =
    """
        Title: $title
        Year: $year
        Category: $category
    """.trimIndent()

fun main() {
    val book = Book("Atomic Kotlin")
    book.info("Programming", "2021") eq """
        Title: Atomic Kotlin
        Year: 2021
        Category: Programming
    """.trimIndent()
}