package keno.ToyKotlin.chat.controller

import java.net.URL

data class UserVM (
    val name: String,
    val url: URL
)

fun anonyUserVM(): UserVM {
    return UserVM("keno", URL("hello"))
}