/*
  Program: Check Anagram Strings
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program checks if two strings are anagrams.
    An anagram is a word formed by rearranging the letters of another word.
*/

import java.util.Arrays;
import java.util.Scanner;

public class P48_CheckAnagramStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("Not anagrams");
            }
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter first string: Listen
  Enter second string: Silent
  The strings are anagrams.
*/
