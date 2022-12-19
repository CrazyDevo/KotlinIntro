fun main(){

    for (chars in 'a'..'x') {
        println(chars)
    }


    for (nums in 5..15) {
        println(nums)
    }

    val nums = arrayOf(2, 4, 6, 8)
    if (2 in nums) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    //Stop the loop when nums is equal to 10:

    for (nums in 5..15) {
        if (nums == 10) {
            break
        }
        println(nums)
    }

}