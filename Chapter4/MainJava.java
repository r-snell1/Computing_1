//Ex1: Complete the first code snippet listed on page 335 of our textbook
//Ex2: Reimplement the second code snippet with Kotlin or Python
//Ex3: Reimplement the third code snippet with either Kotlin or Python
//Ex4: Review and correct the mistake in the fourth code snippet.

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;
import static java.lang.System.*;

public class MainJava {

    public static void main(@NotNull String[] args) {

        Scanner fileInput = new Scanner(System.in);
        String s = args[0];
        int dot = s.indexOf(".");
        String base = s.substring(0, dot);
        String extension = s.substring(dot + 1, s.length());
        String query = args[0];
        while (fileInput.hasNextLine())
        {
            String data = fileInput.nextLine();
            if (data.contains(query))
                out.println(data);
        }//end while
        fileInput.close();
        out.println(base);
        out.println(extension);
        isPalindrome(s);
        translate("AUGAUCUCGUAA");
    }//end main
    public static boolean isPalindrome(@NotNull String s)
    {
        int n = s.length();
        for (int i = 0; i < n/2; i++)
            if (s.charAt(i) != s.charAt(n-1-i))
                return false;
        return true;
    }//end method
    @NotNull
    public static String translate(String dna)
    {
        dna = dna.toUpperCase();
        String rna = dna.replaceAll("T", "U");
        return rna;
    }//end method
}//end class
