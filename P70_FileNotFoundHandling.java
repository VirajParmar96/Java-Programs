/*
  Program: File Not Found Handling
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    This program demonstrates how to handle a situation
    when a file is not found using try-catch block.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P70_FileNotFoundHandling {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}

/*
  Sample Output:
  Error: File not found!
*/
