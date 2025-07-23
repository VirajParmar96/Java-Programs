/*
  Program: LCM of Two Numbers
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program calculates the Least Common Multiple (LCM) of two integers using the formula:
    LCM(a, b) = (a × b) / GCD(a, b)
*/

import java.util.Scanner;

public class P19_LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);

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
  Enter first number: 12
  Enter second number: 18
  LCM of 12 and 18 is: 36
*/
