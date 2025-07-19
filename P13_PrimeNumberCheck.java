/*
  Program: Prime Number Check
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program checks whether a given number is a prime number.
    A prime number is a number greater than 1 with only two factors: 1 and itself.
*/

import java.util.Scanner;

public class P13_PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
        scanner.close();
    }
}

/*
  Sample Output:
  Enter a number: 17
  17 is a Prime Number.

  OR

  Enter a number: 20
  20 is not a Prime Number.
*/
