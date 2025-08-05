/*
  Program: Check Palindrome String
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program checks whether a given string is a palindrome.
    A palindrome reads the same forward and backward.
*/

import java.util.Scanner;

public class P42_PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(original + " is a Palindrome String.");
        } else {
            System.out.println(original + " is not a Palindrome String.");
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a string: Madam
  Madam is a Palindrome String.
*/
