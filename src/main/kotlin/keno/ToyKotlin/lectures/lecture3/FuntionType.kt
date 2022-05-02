package keno.ToyKotlin.lectures.lecture3

class FuntionType {
    val sum = { x: Int, y: Int -> x + y }
    val sum2: (Int, Int) -> Int = { x, y -> x + y }
    val isEven: (Int) -> Boolean = { i: Int -> i % 2 == 0 }
    val res: Boolean = isEven(42)

    val list = listOf(1, 2, 3, 4)

    fun listFilter() {
        list.filter(isEven)
//        { println("Hello") }()
        run { println("Hi") }
    }
}

val isEven: (Int) -> Boolean = { i:Int -> i % 2 == 0 }

val evenFilter = { l:List<Int> -> l.filter { i:Int -> i % 2 == 0 } }

fun filterEven(list: List<Int>):List<Int> {
    return list.filter(isEven)
}

fun postpone(r: Runnable) {

}

fun main() {
    var l:List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    print(evenFilter(l))
}
