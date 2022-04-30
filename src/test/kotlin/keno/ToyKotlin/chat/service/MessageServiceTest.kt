package keno.ToyKotlin.chat.service

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    properties = [
        "spring.datasource.url=jdbc:h2:mem:testdb"
    ]
)
class MessageServiceTest (
    @Autowired var messageService: MessageService
) {
    @Test
    fun simpleMessageTest() {
        var messages = messageService.latest()
        messages.forEach {
                it -> println(it)
        }
    }
}