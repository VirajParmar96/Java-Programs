/*
  Program: Remove All Whitespaces
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program removes all whitespace characters from a string.
*/

import java.util.Scanner;

public class P45_RemoveWhitespaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();

        String result = input.replaceAll("\\s+", "");

        System.out.println("String after removing whitespaces: " + result);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a string with spaces: Java Programming Language
  String after removing whitespaces: JavaProgrammingLanguage
*/
