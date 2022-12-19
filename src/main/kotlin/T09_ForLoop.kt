fun main(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }


    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
        if (x==1)
            println("1 is in the nums")
    }
}