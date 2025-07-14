/*
  Program: Factorial of a Number
  Level  : Basic
  Description:
    This program calculates the factorial of a given non-negative integer using a loop.
*/

import java.util.Scanner;

public class P06_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}

/*
  Sample Output:
  Enter a non-negative integer: 5
  Factorial of 5 is: 120
*/
