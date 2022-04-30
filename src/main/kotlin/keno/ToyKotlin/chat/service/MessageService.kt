package keno.ToyKotlin.chat.service

import keno.ToyKotlin.chat.controller.MessageVM

interface MessageService {
    fun findMessages(): List<MessageVM>
    fun latest(): List<MessageVM>
    fun after(lastMessageId: String): List<MessageVM>
    fun post(messageVM: MessageVM): Unit
}