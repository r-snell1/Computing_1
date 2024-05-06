fun main() {

    var nullString: String? = null //nullability
    println("Enter a number 0-9")
    nullString = readln()

    if (nullString == "5") {

        println("You guessed correctly! ")

    } else {

        println("You did not guess correctly. ")

    }//end if else

    /*
    val f1 = 0.1f
    var total = 0.0f

    val fname = "Ryan"
    val lname = "Snell"

    println("$fname $lname")
    println(fname + " " + lname)

    for (i in 0..10){
        total += f1
        println("$total")
    }*/

}//end main