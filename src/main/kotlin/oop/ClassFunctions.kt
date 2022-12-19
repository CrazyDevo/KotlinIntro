package oop



fun main() {
    class Car(var brand: String, var model: String, var year: Int) {
        // Class function
        fun drive() {
            println("Wrooom!")
        }
    }
    val c1 = Car("Ford", "Mustang", 1969)

    // Call the function
    c1.drive()
}