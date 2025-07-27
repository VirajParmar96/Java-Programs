/*
  Program: Sum of Natural Numbers
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program calculates the sum of the first 'n' natural numbers.
*/

import java.util.Scanner;

public class P26_SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a positive integer: 10
  Sum of first 10 natural numbers = 55
*/
