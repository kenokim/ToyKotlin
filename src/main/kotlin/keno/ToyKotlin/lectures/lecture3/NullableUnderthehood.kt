package keno.ToyKotlin.lectures.lecture3

fun foo():String = "foo"
fun bar():String? = "bar"

fun fooList(list1: List<Int?>) {
    list1.size
    val i: Int? = list1.get(0)
}

fun barList(list2: List<Int>?) {
    list2?.size
    val i: Int? = list2?.get(0)
}

fun main() {

}

class NullableUnderthehood {
}