import java.util.*

object MainKotlin {
    @JvmStatic
    fun main(args: Array<String>) {
        val userInput = Scanner(System.`in`)
        println("Please enter the number you want to check: ")
        val target = userInput.nextInt()
        twoSum(target)
    } //end main

    fun twoSum(target: Int): Boolean {
        val aList = IntArray(5)
        val bList = IntArray(5)
        val random = Random()
        for (i in aList.indices) {
            aList[i] = random.nextInt(10)
        } //end for

        for (i in bList.indices) {
            bList[i] = random.nextInt(10)
        } //end for

        Arrays.sort(aList)
        Arrays.sort(bList)
        println(aList.contentToString())
        println(bList.contentToString())
        var flag = false
        for (i in aList.indices) {
            for (j in aList.indices) {
                flag = if (aList[i] + bList[j] == target) {
                    true
                } else {
                    false
                } //end if
            } //end for
        } //end for

        println(flag)
        return flag
    } //end method
} //end class