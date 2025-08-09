/*
  Program: Replace Characters in String
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program replaces all occurrences of a given character in a string with another character.
*/

import java.util.Scanner;

public class P47_ReplaceCharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);

        System.out.print("Enter the new character: ");
        char newChar = scanner.next().charAt(0);

        String replacedString = input.replace(oldChar, newChar);

        System.out.println("Updated string: " + replacedString);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a string: hello world
  Enter the character to replace: l
  Enter the new character: x
  Updated string: hexxo worxd
*/
