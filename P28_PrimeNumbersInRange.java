/*
  Program: Display Prime Numbers in a Range
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program displays all prime numbers between a given range.
*/

import java.util.Scanner;

public class P28_PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

/*
  Sample Output:
  Enter starting number: 10
  Enter ending number: 30
  Prime numbers between 10 and 30:
  11 13 17 19 23 29
*/
