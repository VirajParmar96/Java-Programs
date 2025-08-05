/*
  Program: Count Vowels and Consonants
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program counts the number of vowels and consonants in a user-entered string.
*/

import java.util.Scanner;

public class P43_CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowels = 0, consonants = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a string: Programming is fun
  Number of vowels: 5
  Number of consonants: 11
*/
