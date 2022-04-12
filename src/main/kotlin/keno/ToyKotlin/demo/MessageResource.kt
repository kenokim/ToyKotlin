package keno.ToyKotlin.demo


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@RestController
class MessageResource(val service: MessageService) {
    @GetMapping
    fun index(): List<Message> = listOf(
        Message(1L, "Hello")
    )

    @GetMapping("/all")
    fun getAll(): List<Message> = service.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }
}

@Entity
data class Message(@Id val id: Long, val text: String?)
