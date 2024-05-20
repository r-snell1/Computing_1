import java.util.*

//Ex1: reimplement max function to return the bigger one between two numbers. Note: do NOT use Math.max, but do use Java's native ternary operator
//Ex2: reimplement the previous max function, create max3 function such that it takes three numbers and return the largest one.
//Use Kotlin to:
//Ex3: similar to Ex1, use Kotlin's native if/else syntax
//Ex4: create a maxN function such that it takes an array and returns its largest element.
object MainKotlin {
    @JvmStatic
    fun main(args: Array<String>) {
        printNumber()
    } //end main

    fun MaxNumber(number1: Int, number2: Int): Int {
        var max = 0
        if (number1 > number2) {
            max = number1
        } else if (number1 < number2) {
            max = number2
        } else {
            println("Invalid number")
        } //end if else


        return max
    } //end method

    fun MaxNumber(number1: Int, number2: Int, number3: Int): Int {
        var max = 0
        if (number1 > number2 && number1 > number3) {
            max = number1
        } else if (number2 > number1 && number2 > number3) {
            max = number2
        } else if (number3 > number1 && number3 > number2) {
            max = number3
        } else {
            println("Invalid number")
        } //end method

        return max
    } //end method

    fun printNumber() {
        val userInput = Scanner(System.`in`)
        println("How many numbers do you want to enter? 2 or 3")
        val numbers = userInput.nextInt()
        if (numbers == 2) {
            println("Please enter a number: ")
            val number1 = userInput.nextInt()
            println("Please enter a number: ")
            val number2 = userInput.nextInt()
            println("The max number is: " + MaxNumber(number1, number2))
        } else if (numbers == 3) {
            println("Please enter a number: ")
            val number1 = userInput.nextInt()
            println("Please enter a number: ")
            val number2 = userInput.nextInt()
            println("Please enter a number: ")
            val number3 = userInput.nextInt()
            println("The max number is: " + MaxNumber(number1, number2, number3))
        } else {
            println("invalid input")
        } //end if
    } //end method
} //end main