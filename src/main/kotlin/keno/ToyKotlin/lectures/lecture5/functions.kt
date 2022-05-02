package keno.ToyKotlin.lectures.lecture5

class functions {
    fun getMail(): Email? {
        return null
    }

}

open class Email(val content: String?)

fun sendEmail(e: Email) {

}

fun main() {
    var f = functions()
    val email = f.getMail()
    if (email != null) {
        sendEmail(email)
    }
    email?.let { e -> sendEmail(e) }
    email?.let { sendEmail(it) }
}

interface EmailSession {
    val mail: Email
}

class SimpleEmail(content: String?) : Email(content) {

}

fun analyzeEmail(e: EmailSession) {
    val mail = e.mail
    if (mail is SimpleEmail) {
        print(mail)
    }
    (e.mail as? SimpleEmail)?.let { println(e.mail.content) }
}