import java.util.*

//Ex1: Complete the first code snippet listed on page 335 of our textbook
//Ex2: Reimplement the second code snippet with Kotlin or Python
//Ex3: Reimplement the third code snippet with either Kotlin or Python
//Ex4: Review and correct the mistake in the fourth code snippet.

object MainJava {
    @JvmStatic
    fun main(args: Array<String>) {
        val fileInput = Scanner(System.`in`)
        val s = args[0]
        val dot = s.indexOf(".")
        val base = s.substring(0, dot)
        val extension = s.substring(dot + 1, s.length)
        val query = args[0]
        while (fileInput.hasNextLine()) {
            val data = fileInput.nextLine()
            if (data.contains(query)) println(data)
        } //end while

        fileInput.close()
        println(base)
        println(extension)
        isPalindrome(s)
        translate("ttgccatggatatcc")
    } //end main

    fun isPalindrome(s: String): Boolean {
        val n = s.length
        for (i in 0 until n / 2) if (s[i] != s[n - 1 - i]) return false
        return true
    } //end method

    fun translate(dna: String): String {
        val dna = dna.uppercase(Locale.getDefault())
        val rna = dna.replace("T".toRegex(), "U")
        return rna
    } //end method
} //end class