package keno.ToyKotlin.lectures.lecture2

/**
 * Kotlin standard library = Java standard library + extensions
 *
 */
fun List<Int>.sum(): Int {
    var res = 0
    for (i:Int in 0 until this.size) {
        res += this.get(i)
    }
    return res
}

fun main() {
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    print(set.javaClass)
    print(list.javaClass)
    print(map.javaClass)

    val l:List<Int> = listOf(1, 2, 3)


    val sum = listOf(1, 2, 3).sum()
    println(sum)


}

fun <T> Array<T>.getOrNull(index: Int) =
    if (index in 0 until size) this[index] else null

//infix fun Int.until(to: Int): IntRange


fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)

val q = """Oh what's this
""".trimIndent()

// "1234".toIntOfNull()
// "1e-10".toDoubleOrNull()

/*fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}*/







fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}

fun printPair(a: String, b: String) {
    print { a.to(b) }

}

/**
 * Kotlin library: extensions on java collections
 * filter, count, flatMap, map, find, groupBy, reduce, any, ...
 *
 * No Kotlin SDK, just JDK + extensions
 *
 */

class ExtensionsExamples {
}