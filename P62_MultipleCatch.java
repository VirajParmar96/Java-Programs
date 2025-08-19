/*
  Program: Multiple Catch Blocks
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates the use of multiple catch blocks 
    to handle different types of exceptions.
*/

import java.util.Scanner;

public class P62_MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();

            int result = 100 / num;  // may cause ArithmeticException
            System.out.println("Result: " + result);

            int[] arr = {1, 2, 3};
            System.out.println("Accessing 5th element: " + arr[4]); // may cause ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}

/*
  Sample Output 1:
  Enter an integer: 10
  Result: 10
  Error: Array index out of bounds.
  Scanner closed.

  Sample Output 2:
  Enter an integer: 0
  Error: Division by zero is not allowed.
  Scanner closed.
*/
