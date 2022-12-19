package oop



fun main() {
    class Car(var brand: String, var model: String, var year: Int)
    val c1 = Car("Ford", "Mustang", 1969)

    println(c1.brand)
}