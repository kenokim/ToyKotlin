package keno.ToyKotlin.lectures.lecture2

class CallingExtensions {
}

open class Parent()
class Child: Parent()

fun Parent.foo() = "parent"
fun Child.foo() = "child"

fun String.get(i:Int) = "*"

fun main() {
    var person: Parent = Child()
    println(person.foo())
    println("abc".get(1))
}

