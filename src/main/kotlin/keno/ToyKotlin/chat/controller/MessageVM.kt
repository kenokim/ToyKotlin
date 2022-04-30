package keno.ToyKotlin.chat.controller

import java.time.Instant

data class MessageVM(
    val content: String,
    val user: UserVM = anonyUserVM(),
    val sent: Instant,
    val id: String? = null
)