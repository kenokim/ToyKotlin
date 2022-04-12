package keno.ToyKotlin.demo

import org.springframework.stereotype.Service

@Service
class MessageServiceImpl(val db: MessageRepository) : MessageService {
    override fun findMessages(): List<Message> = db.findAll() as List<Message>

    override fun post(message: Message) {
        db.save(message)
    }
}