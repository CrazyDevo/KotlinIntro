fun main(){

    //To access the characters (elements) of a string, you must refer to the index number inside square brackets.
    //STRINGS
    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)


    var firstName = "John "
    var lastName = "Doe"
    println(firstName.plus(lastName))

    /*
    String Templates/Interpolation
Instead of concatenation, you can also use "string templates", which is an easy way to add variables and expressions inside a string.

Just refer to the variable with the $ symbol:
     */

    println("My name is $firstName $lastName")

}