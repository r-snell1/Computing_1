//Ex1: Implement Euclidian GCD ( Greatest Common Divisor) iteratively
//Ex2: Implement Euclidian GCD recusrively
//E3: Use BigDecimal to implement NLogN

import java.math.*;
import java.util.Scanner;
import static java.lang.System.out;

public class MainJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        out.println("Enter the first integer: ");
        a = input.nextInt();
        out.println("Enter the Second integer: ");
        b = input.nextInt();
        out.println(gcdRecur(a,b));
        out.println(gcdIter(a,b));
    }//end main

    public static int gcdRecur(int a, int b) {
        int gcd =0;
        if (b == 0){
            return a;
        }else {
            return gcd = gcdRecur(b,a%b);
        }//end if
    }//end method
    public static int gcdIter(int a, int b) {
        int gcd = 0;
        for (int i = 1; i < a && i < b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }//end if
        }//end for
        return gcd;
    }//end method

}//end class
