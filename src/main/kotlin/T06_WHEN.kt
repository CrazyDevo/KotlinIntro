fun main(){

    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

// Outputs "Thursday" (day 4)


    //The when expression is similar to the switch statement in Java.

/*
This is how it works:

The when variable (day) is evaluated once
The value of the day variable is compared with the values of each "branch"
Each branch starts with a value, followed by an arrow (->) and a result
If there is a match, the associated block of code is executed
else is used to specify some code to run if there is no match
In the example above, the value of day is 4, meaning "Thursday" will be printed
 */


}