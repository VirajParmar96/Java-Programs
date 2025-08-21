/*
  Program: Write Text to File
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    This program writes text content into a file using FileWriter.
*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P66_WriteFileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "output.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.print("Enter text to write into file: ");
            String text = sc.nextLine();

            writer.write(text);
            System.out.println("Successfully wrote to the file: " + fileName);
        } 
        catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}

/*
  Sample Run:
  Enter text to write into file: Java File Handling Example
  Successfully wrote to the file: output.txt

  Content of output.txt:
  Java File Handling Example
*/
