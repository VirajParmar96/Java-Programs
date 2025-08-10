/*
  Program: Find Most Frequent Character
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program finds the most frequent character in a given string.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P50_FindMostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();
        char mostFrequentChar = ' ';
        int maxCount = 0;

        for (char c : input.toCharArray()) {
            if (c != ' ') {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);

                if (charCount.get(c) > maxCount) {
                    maxCount = charCount.get(c);
                    mostFrequentChar = c;
                }
            }
        }

        System.out.println("Most frequent character: '" + mostFrequentChar + "' occurred " + maxCount + " times.");

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a string: success
  Most frequent character: 's' occurred 3 times.
*/
