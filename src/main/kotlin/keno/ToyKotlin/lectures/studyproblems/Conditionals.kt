package keno.ToyKotlin.lectures.studyproblems

interface Pet {
    val sound: String
}
class Dog: Pet {
    override val sound = "멍멍"
}
class Cat: Pet {
    override val sound = "meow"
}
/** ====================== RE-WRITE =================== */
fun dogSound(dog: Dog) { // callee
    println(dog.sound)
}
fun catSound(cat: Cat) { // callee
    println(cat.sound)
}
fun bark(p: Pet) { // caller
    when(p) {
        is Dog -> dogSound(p as Dog)
        is Cat -> catSound(p as Cat)
    }
}
/** =================================================== */

fun main() {
    val a = Dog()
    val b = Cat()
    bark(a)
    bark(b)
    genericBark(a)
    genericBark(b)
    bark2(a)
}


fun <T:Pet>animalSound(animal: T) {
    println(animal?.sound);
}

fun bark2(p: Pet) {
    animalSound(p)
}





fun <T:Pet> genericBark(p:T) {
    println(p.sound)
}