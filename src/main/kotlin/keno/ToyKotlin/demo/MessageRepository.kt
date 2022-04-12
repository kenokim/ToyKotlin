package keno.ToyKotlin.demo

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, Long> {

}
