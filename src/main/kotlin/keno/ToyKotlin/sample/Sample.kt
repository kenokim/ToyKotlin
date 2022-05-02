package keno.ToyKotlin.sample

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Sample(
    var name: String = "keno",
    @Id @GeneratedValue var id: Long? = null
) {
    fun updateName(name: String) {
        this.name = name;
    }
}