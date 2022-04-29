package keno.ToyKotlin.lectures.lecture2

fun mapIteration() {
    val map = mapOf(1 to 'a',
                    2 to 'b',
                    3 to 'c')
    for ((key, value) in map) {
        println("$key : $value")
    }
}

fun listIndexIteration() {
    val list = listOf('a', 'b', 'c')
    for ((idx, value) in list.withIndex()) {
        println("$idx : $value")
    }
}

fun iteration() {
    for (i in 1..9) {
        print(i)
    }
}

fun iteration2() {
    for (i in 9 downTo 1 step 2) {
        print(i)
    }
}

fun main() {
    mapIteration()
    listIndexIteration()
    iteration()

}

class Iteration {
}