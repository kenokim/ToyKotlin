package keno.ToyKotlin.chat.service

import keno.ToyKotlin.app.ChatMessage
import keno.ToyKotlin.app.ContentType
import keno.ToyKotlin.chat.repository.ChatMessageRepository
import org.springframework.stereotype.Component
import java.time.Instant
import javax.annotation.PostConstruct

@Component
class DataCreateService(
    val messageRepository: ChatMessageRepository
) {
    @PostConstruct
    fun createData() {
        val now = Instant.now()
        val secondBeforeNow = now.minusSeconds(1)
        val twoSecondsBeforeNow = now.minusSeconds(2)

        val savedMessages = messageRepository.saveAll(listOf(
            ChatMessage("Hello Test message 1", ContentType.PLAIN, secondBeforeNow, "keno", "none"),
            ChatMessage("Hello Test message 2", ContentType.PLAIN, secondBeforeNow, "keno", "none"),
            ChatMessage("Hello Test message 3", ContentType.PLAIN, secondBeforeNow, "keno", "none")
        ))
    }
}