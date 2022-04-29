package keno.ToyKotlin.lectures.lecture3

data class Hero(
    val name: String,
    val age: Int,
    val gender: Gender?
)
enum class Gender { MALE, FEMALE }

val heroes = listOf(
    Hero("The captain", 60, Gender.MALE),
    Hero("Frenchy", 42, Gender.MALE),
    Hero("First Mate", 29, Gender.MALE),
    Hero("Lady Lauren", 29, Gender.FEMALE),
    Hero("The Kid", 9, null)
)

fun lastHero() {
    print(heroes.last().name)
}

fun main() {
    print(heroes.last().name)
    //print(heroes.firstOrNull { it.age == 20 }?.name)
    //print(heroes.first { it.age == 20 }.name)
    heroes.map { it.age }
    heroes.map { it.age }.distinct()
    heroes.filter { it.age < 30 }.size
    val (kid, olds) = heroes.partition { it.age < 30 }
    heroes.maxByOrNull { it.age }?.name
    heroes.all { it.age < 30 }
    heroes.any { it.age < 30 }
}
