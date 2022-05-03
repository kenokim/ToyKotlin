package keno.ToyKotlin.lectures.studyproblems

fun List<Int>.filterGT(crit: (Int, Int) -> Boolean, targ: Int): List<Int> {
    TODO("crit 함수와 targ 값을 받아서 crit 에 해당하는 값만 제곱하여 리스트로 리턴해 주세요.")
}

infix fun<T> T.IS_EQ(o: T): Boolean = if (this?.equals(o) != true) throw RuntimeException("no") else true
fun success() = println("OK")
fun main(args: Array<String>) {
    var list = listOf(1, 2, 3, 4, 5, 13, 14)
    var crit = { x: Int, targ: Int -> x < targ * targ && x > targ }

    var ans1 = list.filterGT(crit, 3)
    ans1 IS_EQ listOf(16, 25)

    var ans2 = list.filterGT(crit, 4)
    ans2 IS_EQ listOf(25, 169, 196)

    var crit2 = { x: Int, targ: Int -> x - 3 > targ }

    var ans3 = list.filterGT(crit2, 10)
    ans3 IS_EQ listOf(196)

    success()
}







/*fun List<Int>.filterGT(crit: (Int, Int) -> Boolean, targ: Int): List<Int> {
    return this.filter { crit(it, targ) }
        .map { it -> it * it }
}*/
