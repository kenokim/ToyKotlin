package keno.ToyKotlin.lectures.lecture2

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNumber(number: Int) = if (number in 1..9) true else throw IllegalStateException("Not a number")


fun main() {
    print(isNumber(100))
}
