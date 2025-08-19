/*
  Program: Throw and Throws Example
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    This program demonstrates the use of 'throw' to explicitly 
    throw an exception and 'throws' to declare exceptions 
    in a method signature.
*/

import java.util.Scanner;

public class P63_ThrowAndThrowsExample {

    // Method declares that it may throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access Denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access Granted - You are eligible.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkAge(age);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally {
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}

/*
  Sample Output 1:
  Enter your age: 16
  Exception caught: Access Denied - You must be at least 18 years old.
  Scanner closed.

  Sample Output 2:
  Enter your age: 20
  Access Granted - You are eligible.
  Scanner closed.
*/
