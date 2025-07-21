/*
  Program: Power of a Number
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program calculates the result of a number raised to a power (base^exponent).
*/

import java.util.Scanner;

public class P17_PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power " + exponent + " is: " + result);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter the base: 2
  Enter the exponent: 5
  2.0 raised to the power 5 is: 32.0
*/
