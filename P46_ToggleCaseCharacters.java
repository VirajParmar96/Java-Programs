/*
  Program: Toggle Case of Characters
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program takes a string as input and toggles the case of each character.
    Uppercase characters are converted to lowercase and vice versa.
*/

import java.util.Scanner;

public class P46_ToggleCaseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder toggled = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch); // Leave non-alphabet characters unchanged
            }
        }

        System.out.println("Toggled case: " + toggled);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a string: HeLLo WoRLd!
  Toggled case: hEllO wOrlD!
*/
