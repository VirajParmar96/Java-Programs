/*
  Program: Count Words in a String
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program counts the number of words in a user-entered string.
    Words are assumed to be separated by spaces.
*/

import java.util.Scanner;

public class P44_CountWordsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String sentence = scanner.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            String[] words = sentence.split("\\s+");
            System.out.println("Number of words: " + words.length);
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a string: Java is a powerful language
  Number of words: 5
*/
