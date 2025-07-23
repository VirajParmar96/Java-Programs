/*
  Program: GCD of Two Numbers
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program calculates the Greatest Common Divisor (GCD) of two integers using the Euclidean algorithm.
*/

import java.util.Scanner;

public class P18_GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int gcd = findGCD(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

/*
  Sample Output:
  Enter first number: 48
  Enter second number: 18
  GCD of 48 and 18 is: 6
*/
