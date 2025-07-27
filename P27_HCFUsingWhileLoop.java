/*
  Program: Find HCF Using While Loop
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program finds the Highest Common Factor (HCF) of two numbers using a while loop.
*/

import java.util.Scanner;

public class P27_HCFUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int hcf = 1;
        int i = Math.min(a, b);

        while (i > 0) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                break;
            }
            i--;
        }

        System.out.println("HCF of " + a + " and " + b + " = " + hcf);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter first number: 36
  Enter second number: 60
  HCF of 36 and 60 = 12
*/
