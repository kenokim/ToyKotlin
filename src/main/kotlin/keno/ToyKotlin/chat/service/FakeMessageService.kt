package keno.ToyKotlin.chat.service

import keno.ToyKotlin.chat.controller.MessageVM
import keno.ToyKotlin.chat.controller.UserVM
import org.springframework.stereotype.Service
import java.net.URL
import java.time.Instant
import kotlin.random.Random

@Service
class FakeMessageService: MessageService {
    val users: Map<String, UserVM> = mapOf(
        "Shakespeare" to UserVM("Shakespeare", URL("https://blog.12min.com/wp-content/uploads/2018/05/27d-William-Shakespeare.jpg")),
        "RickAndMorty" to UserVM("RickAndMorty", URL("http://thecircular.org/wp-content/uploads/2015/04/rick-and-morty-fb-pic1.jpg")),
        "Yoda" to UserVM("Yoda", URL("https://news.toyark.com/wp-content/uploads/sites/4/2019/03/SH-Figuarts-Yoda-001.jpg"))
    )

    val usersQuotes: Map<String, () -> String> = mapOf(
        "Shakespeare" to { "Hello Shakespeare" },
        "RickAndMorty" to { "Hello Rick and Morty" },
        "Yoda" to { "Nice to meet you" }
    )

    override fun findMessages(): List<MessageVM> {
        TODO("Not yet implemented")
    }

    override fun post(messageVM: MessageVM) {
        TODO("Not yet implemented")
    }

    override fun latest(): List<MessageVM> {
        val count = Random.nextInt(1, 15)
        return (0..count).map {
            val user = users.values.random()
            val userQuote = usersQuotes.getValue(user.name).invoke()
            MessageVM(userQuote, user, Instant.now(), Random.nextBytes(10).toString())
        }
    }

    override fun after(lastMessageId: String): List<MessageVM> {
        return latest()
    }

}