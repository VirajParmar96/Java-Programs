/*
  Program: Check Perfect Number
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program checks whether a given number is a Perfect Number.
    A Perfect Number is a positive integer that is equal to the sum of its proper divisors.
    Example: 6 => 1 + 2 + 3 = 6
*/

import java.util.Scanner;

public class P29_PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number && number != 0) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a number: 28
  28 is a Perfect Number.
*/
