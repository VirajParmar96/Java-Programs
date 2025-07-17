/*
  Program: Reverse a Number
  Level  : Basic
  Description:
    This program reverses the digits of a given integer.
    For example, if the input is 1234, the output will be 4321.
*/

import java.util.Scanner;

public class P10_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
        scanner.close();
    }
}

/*
  Sample Output:
  Enter a number: 1234
  Reversed Number: 4321
*/
