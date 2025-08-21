/*
  Program: Copy File Contents
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    This program copies the content of one file into another.
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P67_CopyFileExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
        } 
        catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}

/*
  Sample Content of source.txt:
  Java is powerful!
  File handling is fun.

  After running program:
  destination.txt content:
  Java is powerful!
  File handling is fun.

  Sample Output:
  File copied successfully from source.txt to destination.txt
*/
