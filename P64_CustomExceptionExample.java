/*
  Program: Custom Exception Class
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    This program demonstrates how to create and use a custom exception class.
*/

import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class P64_CustomExceptionExample {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Valid age. You can proceed.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            validateAge(age);
        } 
        catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}

/*
  Sample Output 1:
  Enter your age: 15
  Caught Exception: Age must be 18 or above.
  Scanner closed.

  Sample Output 2:
  Enter your age: 21
  Valid age. You can proceed.
  Scanner closed.
*/
