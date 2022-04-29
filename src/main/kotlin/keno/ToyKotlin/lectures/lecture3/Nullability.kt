package keno.ToyKotlin.lectures.lecture3


/*fun main() {
    val s: String? = null
    val length: Int? = if (s != null) s.length else null
    val length2: Int? = s?.length ?: 0
}*/

class Nullability() {
}

//class Name(val value)

//fun isFoo1(n: Name) = n.value == "foo"
//fun isFoo2(n: Name?) = n.value == "foo"
//fun isFoo3(n: Name?) = n != null && n.value == "foo"
//fun isFoo4(n: Name?) = n?.value == "foo"

fun main(args: Array<String>) {
//    isFoo1(null)
//    isFoo2(null)
//    isFoo3(null)
//    isFoo4(null)
}

val x: Int? = 1
val y: Int = 2
val s = x ?: y + 0



/*val f1: () -> Int? = null
val f2: () -> Int? = { null }
val f3: (() -> Int)? = null
val f4: (() -> Int)? = { null }*/