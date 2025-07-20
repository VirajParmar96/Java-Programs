/*
  Program: Count Digits in a Number
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program counts the number of digits in a given non-negative integer.
*/

import java.util.Scanner;

public class P15_CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a number: 12345
  Number of digits: 5
*/
