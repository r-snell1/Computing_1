import java.util.*

object MainKotlin {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        var a = 0
        var b = 0
        println("Enter the first integer: ")
        a = input.nextInt()
        println("Enter the Second integer: ")
        b = input.nextInt()
        println(gcdRecur(a, b))
        println(gcdIter(a, b))
    } //end main

    fun gcdRecur(a: Int, b: Int): Int {
        var gcd = 0
        return if (b == 0) {
            a
        } else {
            gcdRecur(b, a % b).also { gcd = it }
        } //end if
    } //end method

    fun gcdIter(a: Int, b: Int): Int {
        var gcd = 0
        var i = 1
        while (i < a && i < b) {
            if (a % i == 0 && b % i == 0) {
                gcd = i
            } //end if
            i++
        }
        return gcd
    } //end method
} //end class