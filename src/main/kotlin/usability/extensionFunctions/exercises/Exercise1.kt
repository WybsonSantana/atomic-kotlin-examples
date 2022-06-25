package usability.extensionFunctions.exercises

import atomictest.eq

fun String.wrapInTag(tagName: String): String = "<$tagName>$this</$tagName>"

fun main() {
    "Cat".wrapInTag("Animal") eq "<Animal>Cat</Animal>"
}