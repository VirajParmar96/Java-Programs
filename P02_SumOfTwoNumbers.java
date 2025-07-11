/*
  Program: Sum of Two Numbers
  Level  : Basic
  Description:
    This program takes two integers as input from the user and calculates their sum.
*/

import java.util.Scanner;

public class P02_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);
        scanner.close();
    }
}

/*
  Sample Output:
  Enter first number: 25
  Enter second number: 35
  Sum = 60
*/
