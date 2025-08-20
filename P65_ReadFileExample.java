/*
  Program: Read File Line by Line
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    This program reads a text file line by line using BufferedReader.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P65_ReadFileExample {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // Make sure this file exists in the project folder

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

/*
  Sample Content of sample.txt:
  Hello Java
  Welcome to File Handling
  Reading line by line example

  Sample Output:
  Reading file content:
  Hello Java
  Welcome to File Handling
  Reading line by line example
*/
