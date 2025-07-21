/*
  Program: Sum of Digits
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program calculates the sum of digits of a given non-negative integer.
*/

import java.util.Scanner;

public class P16_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits = " + sum);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a number: 1234
  Sum of digits = 10
*/
