package keno.ToyKotlin.lectures.lecture2

fun String.lastChar() = this.get(this.length - 1)
fun String.lastChar2() = get(length - 1)
/**
 * String = receiver
 * Refer to the body of receiver by 'this' expression
 */

fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}

/**
 * Extension functions are compiled into static functions
 * So, it is not possible to access its private fields
 */

fun main() {
    var s = "Hello"
    print(s.lastChar())
    var c: Char = "abc".lastChar()
    var c2: Char = "abc".lastChar2()
}

class Extension {
}