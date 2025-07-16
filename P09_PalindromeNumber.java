/*
  Program: Palindrome Number
  Level  : Basic
  Description:
    This program checks whether a given number is a palindrome.
    A palindrome number reads the same backward as forward (e.g., 121, 1331).
*/

import java.util.Scanner;

public class P09_PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int original = scanner.nextInt();
        int reversed = 0, temp = original;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
        scanner.close();
    }
}

/*
  Sample Output:
  Enter a number: 121
  121 is a Palindrome.

  OR

  Enter a number: 123
  123 is not a Palindrome.
*/
