//Ex1: implement a TwoSum function which takes two parameters: 1) an array  of integers and  2)
// a target value. TwoSum enumerates the array and finds the first pair whose sum matches the
// target value. If there's a match, returns true, else returns false. For example:  given this
// array: [5, 3, 10, 4, 11], if the target is 7, TwoSum returns true; with the same array,
// if the target is 19, TwoSum returns false, because throughout the array, there's NO such pair
// of numbers which add up to 19. You can implement this in either Java or Kotlin. Note: compile
// your code on command line first, then run it on command line as well.

//Ex2: Reimplment the sorting algorithm listed on page 543 with Kotlin, and write some tests to
// verify your implementation. Note: compile your code on command line first, then run it via command
// line.
import static java.lang.System.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class MainJava {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        out.println("Please enter the number you want to check: ");
        int target = userInput.nextInt();
        twoSum(target);
    }//end main
    public static boolean twoSum(int target) {
        int[] aList = new int[5];
        int[] bList = new int[5];
        Random random = new Random();
        for (int i = 0; i < aList.length; i++) {
            aList[i]=random.nextInt(10);
        }//end for
        for (int i = 0; i < bList.length; i++) {
            bList[i] = random.nextInt(10);
        }//end for
        Arrays.sort(aList);
        Arrays.sort(bList);
        out.println(Arrays.toString(aList));
        out.println(Arrays.toString(bList));
        boolean flag = false;
        for (int i = 0; i < aList.length; i++) {
            for (int j = 0; j < aList.length; j++) {
                if (aList[i] + bList[j] == target) {
                    flag = true;
                } else {
                    flag = false;
                }//end if
            }//end for
        }//end for
        out.println(flag);
        return flag;
    }//end method
}//end class
