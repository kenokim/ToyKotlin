package keno.ToyKotlin.chat.service

import keno.ToyKotlin.chat.controller.MessageVM
import keno.ToyKotlin.chat.repository.ChatMessageRepository
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

//@Service @Primary
class ChatMessageService (
    val chatMessageRepository: ChatMessageRepository
): MessageService {

    override fun findMessages(): List<MessageVM> {
        TODO("Not yet implemented")
    }

    override fun post(messageVM: MessageVM) {
        TODO("Not yet implemented")
    }

    override fun latest(): List<MessageVM> {
        TODO("Not yet implemented")
    }

    override fun after(lastMessageId: String): List<MessageVM> {
        TODO("Not yet implemented")
    }
}