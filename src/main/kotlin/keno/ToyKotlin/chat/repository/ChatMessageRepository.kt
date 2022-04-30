package keno.ToyKotlin.chat.repository

import keno.ToyKotlin.app.ChatMessage
import org.springframework.data.repository.CrudRepository

interface ChatMessageRepository: CrudRepository<ChatMessage, Long> {
}