package introductionToObjects.propertyAccessors.exercises

import atomictest.eq

class MessageStorage {
    private val messagesList = mutableListOf<String>()

    val messages: List<String>
        get() = messagesList

    fun addMessage(message: String) {
        messagesList += message
    }
}

fun main() {
    val messageStorage = MessageStorage()
    messageStorage.addMessage("First message")
    messageStorage.addMessage("Second message")
    messageStorage.messages eq listOf("First message", "Second message")
}