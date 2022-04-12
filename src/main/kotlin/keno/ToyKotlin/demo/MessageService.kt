package keno.ToyKotlin.demo

import org.springframework.stereotype.Service

@Service
interface MessageService {
    fun findMessages(): List<Message>
    fun post(message: Message)
}
