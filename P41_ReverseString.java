/*
  Program: Reverse a String
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program reverses a user-entered string using a loop.
*/

import java.util.Scanner;

public class P41_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a string: Hello World
  Reversed string: dlroW olleH
*/
