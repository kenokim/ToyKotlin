package keno.ToyKotlin.demo

import keno.ToyKotlin.chat.controller.MessageVM
import org.springframework.stereotype.Service

@Service
interface MessageService {
    fun findMessages(): List<Message>
    fun post(message: Message)
    fun post(message: MessageVM)
    fun latest(): List<MessageVM>
    fun after(lastMessageId: String): List<MessageVM>
}
