package keno.ToyKotlin.lectures.lecture2

fun printFunction() {
    println(listOf('a', 'b', 'c').joinToString(separator = "+", prefix="(", postfix=")"))
    println(listOf('a', 'b', 'c').joinToString(prefix="?"))
}

@JvmOverloads
fun display(c: Char='*', size: Int=10) {
    repeat(size) {
        print(c)
    }
}

fun declare(num:Int?) {
    val value:Int = num?:0
    print(value)
}

fun main() {
    declare(null)
    printFunction()
    display()
}

class DefaultAndNamedArguments {

}