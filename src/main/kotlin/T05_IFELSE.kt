
    fun main(){
/*
if (condition) {
  // block of code to be executed if the condition is true
}
 */


        if (20 > 18) {
            println("20 is greater than 18")
        }



        val a = 20
        val b = 18
        if (a > b) {
            println("$a is greater than $b")
        }




        val time = 20
        if (time < 18) {
            println("Good day.")
        } else {
            println("Good evening.")
        }
// Outputs "Good evening."

/*
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
 */

        val time1 = 22
        if (time1 < 10) {
            println("Good morning.")
        } else if (time1 < 20) {
            println("Good day.")
        } else {
            println("Good evening.")
        }
// Outputs "Good evening."

//In Kotlin, you can also use if..else statements as expressions (assign a value to a variable and return it):

        val time3 = 20
        val greeting = if (time3 < 18) {
            "Good day."
        } else {
            "Good evening."
        }
        println(greeting)

        //Note: You can ommit the curly braces {} when if has only one statement:


        val time4 = 20
        val greeting1 = if (time4 < 18) "Good day." else "Good evening."
        println(greeting1)
    }

