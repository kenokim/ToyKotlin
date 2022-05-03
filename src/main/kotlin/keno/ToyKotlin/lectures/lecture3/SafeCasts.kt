package keno.ToyKotlin.lectures.lecture3

fun cast1() {
    var any = "keno"
    if (any is String) {
        val s = any as String
        s.toUpperCase()
    }
}

fun cast2() {
    var any = "keno"
    if (any is String) {
        any.toUpperCase() // smart cast
    }
}

fun cast3() {
    var any = "keno"
    (any as? String)?.toUpperCase()
}

fun main(args: Array<String>) {
    val s = "1234"
    println(s as? Int)    // null
    println(s as Int?)    // exception
}


class SafeCasts {
}