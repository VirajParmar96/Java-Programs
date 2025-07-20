/*
  Program: Multiplication Table
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program prints the multiplication table for a given number up to 10.
*/

import java.util.Scanner;

public class P14_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter a number: 5
  Multiplication Table of 5:
  5 x 1 = 5
  5 x 2 = 10
  5 x 3 = 15
  5 x 4 = 20
  5 x 5 = 25
  5 x 6 = 30
  5 x 7 = 35
  5 x 8 = 40
  5 x 9 = 45
  5 x 10 = 50
*/
