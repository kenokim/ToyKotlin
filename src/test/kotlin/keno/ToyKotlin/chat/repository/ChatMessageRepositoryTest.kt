package keno.ToyKotlin.chat.repository

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    properties = [
        "spring.datasource.url=jdbc:h2:mem:testdb"
    ]
)
class ChatMessageRepositoryTest(
    @Autowired var repo: ChatMessageRepository
) {
    @Test
    fun simpleTest() {
        print(repo.findAll())
    }
}