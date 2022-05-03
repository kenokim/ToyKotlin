package keno.ToyKotlin.chat.repository

import keno.ToyKotlin.app.ChatMessage
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface ChatMessageRepository: CrudRepository<ChatMessage, Long> {
    @Query("select m from ChatMessage as m")
    fun findLatest(): List<ChatMessage>

    @Query("select m from ChatMessage as m")
    fun findLatest(id: Long): List<ChatMessage>
}