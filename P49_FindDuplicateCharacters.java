/*
  Program: Find Duplicate Characters
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program finds and displays duplicate characters in a string.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P49_FindDuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (c != ' ') {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a string: programming
  Duplicate characters:
  r - 2 times
  g - 2 times
  m - 2 times
*/
