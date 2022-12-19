/*
Parameters are specified after the function name, inside the parentheses.
You can add as many parameters as you want,
just separate them with a comma.
Just note that you must specify the type of each parameter (Int, String, etc).
 */

fun myFunction() {
    println("I just got executed!")
}
//
fun myFunction(fname: String) {
    println(fname + " Barry")
}

fun myFunction(fname: String, age: Int) {
    println(fname + " is " + age)
}
//To return a value, use the return keyword, and specify the return type after the function's parantheses (Int in this example):
                    //Return Type
fun myFunction(x: Int): Int {
    return (x + 5)
}

fun myFunction(x: Int, y: Int): Int {
    return (x + y)
}

/*
When a parameter is passed to the function, it is called an argument.
So, from the example above: fname is a parameter, while John, Jane and George are arguments.
 */

/*
There is also a shorter syntax for returning values.
You can use the = operator instead of return without specifying the return type.
Kotlin is smart enough to automatically find out what
 */
fun myFunction(x: Int, y: Int,z:Int) = x + y +z

fun main(){
    myFunction();
    myFunction("Adam");
    myFunction("John", 35)
    var result = myFunction(4);
    println(result)
    val result2 = myFunction(5, 6);
    println(result2)
    println(myFunction(4, 5, 6))

}

