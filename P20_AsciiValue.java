/*
  Program: Print ASCII Value of a Character
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program prints the ASCII (integer) value of a user-entered character.
*/

import java.util.Scanner;

public class P20_AsciiValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        int ascii = (int) character;

        System.out.println("The ASCII value of '" + character + "' is: " + ascii);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a character: A
  The ASCII value of 'A' is: 65
*/
