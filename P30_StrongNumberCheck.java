/*
  Program: Check Strong Number
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program checks whether a number is a Strong Number.
    A Strong Number is a number whose sum of the factorial of digits equals the number itself.
    Example: 145 => 1! + 4! + 5! = 145
*/

import java.util.Scanner;

public class P30_StrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong Number.");
        } else {
            System.out.println(original + " is not a Strong Number.");
        }

        scanner.close();
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

/*
  Sample Output:
  Enter a number: 145
  145 is a Strong Number.
*/
