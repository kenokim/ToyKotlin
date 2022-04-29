package keno.ToyKotlin.lectures.lecture2

import java.lang.NumberFormatException

fun exception1() {
    val str = "hello"
    val number = try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        return
    }
}

class Exception {
}