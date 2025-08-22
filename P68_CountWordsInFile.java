/*
  Program: Count Words in a File
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    This program reads a text file and counts the number of words inside it.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P68_CountWordsInFile {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            System.out.println("Total words in file: " + wordCount);
        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

/*
  Sample Content of sample.txt:
  Java is fun to learn.
  File handling in Java is easy.

  Sample Output:
  Total words in file: 9
*/
