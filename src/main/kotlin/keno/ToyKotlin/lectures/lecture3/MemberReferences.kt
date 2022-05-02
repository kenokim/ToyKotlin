package keno.ToyKotlin.lectures.lecture3

class MemberReferences {
}

class Person(val name: String, val age:Int)

fun sample() {
    var p = Person("keno", 10)
    var l = listOf(p)
    l.maxByOrNull { it.age }
    l.maxByOrNull (Person::age)
}

fun isEven(i:Int):Boolean = i % 2 == 0

val predicate = isEven
val predicate2 = { i:Int -> isEven(i) }
