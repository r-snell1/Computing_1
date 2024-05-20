import java.util.Scanner;

import static java.lang.System.out;

//Ex1: reimplement max function to return the bigger one between two numbers.
// Note: do NOT use Math.max, but do use Java's native ternary operator
//Ex2: reimplement the previous max function, create max3 function such that it takes
// three numbers and return the largest one.
//Use Kotlin to:
//Ex3: similar to Ex1, use Kotlin's native if/else syntax
//Ex4: create a maxN function such that it takes an array and returns its largest element.
public class MainJava {

    public static void main(String[] args) {

            printNumber();

    }//end main

    public static int MaxNumber(int number1, int number2){
        int max = 0;
        if (number1 > number2){
            max = number1;
        } else if (number1 < number2){
            max = number2;
        } else {
            out.println("Invalid number");
        }//end if else

       return max;
    }//end method

    public static int MaxNumber(int number1, int number2, int number3){
        int max = 0;
        if (number1 > number2 && number1 > number3){
            max = number1;
        } else if (number2 > number1 && number2 > number3){
            max = number2;
        } else if (number3 > number1 && number3> number2){
            max = number3;
        } else {
            out.println("Invalid number");
        }//end method
        return max;
    }//end method

    public static void printNumber(){
        Scanner userInput = new Scanner(System.in);
        out.println("How many numbers do you want to enter? 2 or 3");
        int numbers = userInput.nextInt();
        if (numbers == 2){
            out.println("Please enter a number: ");
            int number1 = userInput.nextInt();
            out.println("Please enter a number: ");
            int number2 = userInput.nextInt();
            out.println("The max number is: " + MaxNumber(number1, number2));
        } else if (numbers == 3){
            out.println("Please enter a number: ");
            int number1 = userInput.nextInt();
            out.println("Please enter a number: ");
            int number2 = userInput.nextInt();
            out.println("Please enter a number: ");
            int number3 = userInput.nextInt();
            out.println("The max number is: " + MaxNumber(number1, number2, number3));
        } else {
            out.println("invalid input");
        }//end if

    }//end method

}//end class
