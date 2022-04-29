package keno.ToyKotlin.lectures.lecture2
fun main(args: Array<String>) {
    val arr = arrayOf("apple", "orange", "candy")
    val choice = 1
    var yourChoice = if (choice < 0) arr[0] else arr[2]
    println("This is your choice: $yourChoice")
}