package keno.ToyKotlin.security

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Account (

    @Id @GeneratedValue
    var id: Long? = null,

    var email: String,

    var password: String,

    @Enumerated(EnumType.STRING)
    var roles: Set<AccountRole>,

    var createAt: LocalDateTime = LocalDateTime.now()

)