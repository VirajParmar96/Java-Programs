/*
  Program: Check Vowel or Consonant
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program checks whether the entered alphabet is a vowel or a consonant.
*/

import java.util.Scanner;

public class P21_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single alphabet: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase for simplicity
        ch = Character.toLowerCase(ch);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input. Please enter an alphabet.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a single alphabet: E
  e is a vowel.
*/
