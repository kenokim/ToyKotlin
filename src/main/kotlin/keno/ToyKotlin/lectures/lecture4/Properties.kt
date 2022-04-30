package keno.ToyKotlin.lectures.lecture4

class Contact(
    val name: String,
    val address: String
)



fun main() {
    var c = Contact("keno", "home")
    print(c.name)
    print(c.address)
}

class Properties {
}