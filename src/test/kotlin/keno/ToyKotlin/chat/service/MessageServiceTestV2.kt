package keno.ToyKotlin.chat.service

import keno.ToyKotlin.app.ChatMessage
import keno.ToyKotlin.app.ContentType
import keno.ToyKotlin.chat.repository.ChatMessageRepository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.web.client.RestTemplate
import java.time.Instant

@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    properties = [
        "spring.datasource.url=jdbc:h2:mem:testdb"
    ]
)
class MessageServiceTestV2 {
    @Autowired lateinit var messageService: MessageService
    @Autowired lateinit var messageRepository: ChatMessageRepository
    @Autowired lateinit var client: TestRestTemplate

    val now: Instant = Instant.now()
    var lastMessageId: Long? = null

    @BeforeEach
    fun setUp() {
        val secondBeforeNow = now.minusSeconds(1)
        val twoSecondsBeforeNow = now.minusSeconds(2)

        val savedMessages = messageRepository.saveAll(listOf(
            ChatMessage("Hello Test message 1", ContentType.PLAIN, secondBeforeNow, "keno", "none"),
            ChatMessage("Hello Test message 2", ContentType.PLAIN, secondBeforeNow, "keno", "none"),
            ChatMessage("Hello Test message 3", ContentType.PLAIN, secondBeforeNow, "keno", "none")
        ))
        lastMessageId = savedMessages.firstOrNull()?.id
    }

    @Test
    fun simpleMessageTest() {
        println("Hello")
    }
}