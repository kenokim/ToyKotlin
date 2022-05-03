package keno.ToyKotlin.app

import java.time.Instant
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class ChatMessage (
    var content: String,
    var contentType: ContentType = ContentType.PLAIN,
    var sent: Instant = Instant.now(),
    var username: String = "keno",
    var userAvatarImageLink: String = "https://media.istockphoto.com/vectors/keno-lottery-game-logo-vector-id1147844180?s=612x612",
    @Id @GeneratedValue var id: Long? = null
)

enum class ContentType {
    PLAIN
}