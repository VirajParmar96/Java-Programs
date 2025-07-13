/*
  Program: Find Largest of Three Numbers
  Level  : Basic
  Description:
    This program takes three numbers as input and prints the largest among them.
*/

import java.util.Scanner;

public class P06_LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }
}

/*
  Sample Output:
  Enter first number: 12
  Enter second number: 25
  Enter third number: 17
  The largest number is: 25
*/
