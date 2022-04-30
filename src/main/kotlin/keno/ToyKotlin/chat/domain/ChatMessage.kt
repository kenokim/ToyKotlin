package keno.ToyKotlin.app

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class ChatMessage (
    var content: String,
    var createTime: LocalDateTime,
    var contentType: ContentType = ContentType.PLAIN,
    @Id @GeneratedValue var id: Long? = null
)

enum class ContentType {
    PLAIN
}