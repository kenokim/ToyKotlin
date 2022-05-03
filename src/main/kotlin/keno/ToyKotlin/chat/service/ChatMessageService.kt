package keno.ToyKotlin.chat.service

import keno.ToyKotlin.app.ChatMessage
import keno.ToyKotlin.app.ContentType
import keno.ToyKotlin.chat.controller.MessageVM
import keno.ToyKotlin.chat.controller.UserVM
import keno.ToyKotlin.chat.repository.ChatMessageRepository
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service
import java.net.URL
import java.time.Instant

@Service @Primary
class ChatMessageService (
    val chatMessageRepository: ChatMessageRepository
): MessageService {

    override fun findMessages(): List<MessageVM> = latest()

    override fun post(messageVM: MessageVM) {
        chatMessageRepository.save(
            with (messageVM) {
                ChatMessage(content, ContentType.PLAIN, Instant.now(), user.name, user.url.toString())
            }
        )
    }

    override fun latest(): List<MessageVM> =
        chatMessageRepository.findLatest().map {
            with (it) {
                MessageVM(content, UserVM(username, URL(userAvatarImageLink)), sent, id?.toString())
            }
        }
    /*{
    return chatMessageRepository.findLatest().map {
                m -> MessageVM(m.content, UserVM(m.username, URL(m.userAvatarImageLink)), m.sent, m.id?.toString())
        }
    }*/

    override fun after(lastMessageId: String): List<MessageVM> = latest()
}