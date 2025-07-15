/*
  Program: Armstrong Number
  Level  : Basic
  Description:
    This program checks whether a given number is an Armstrong number.
    An n-digit number is an Armstrong number if the sum of its digits raised to the power n equals the number itself.
    Example: 153 = 1³ + 5³ + 3³ = 153
*/

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int original = number;
        int result = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, digits);
            number /= 10;
        }

        if (original == result) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}

/*
  Sample Output:
  Enter a number: 153
  153 is an Armstrong number.

  OR

  Enter a number: 123
  123 is not an Armstrong number.
*/
