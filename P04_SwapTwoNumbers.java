/*
  Program: Swap Two Numbers
  Level  : Basic
  Description:
    This program swaps the values of two numbers using a temporary variable.
*/

import java.util.Scanner;

public class P04_SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
        scanner.close();
    }
}

/*
  Sample Output:
  Enter first number (a): 5
  Enter second number (b): 10
  Before swapping: a = 5, b = 10
  After swapping: a = 10, b = 5
*/
