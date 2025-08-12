/*
  Program: Method Overloading
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates method overloading in Java.
*/

class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class P53_MethodOverloading {
    public static void main(String[] args) {
        MathOperations mo = new MathOperations();

        System.out.println("Sum of 2 integers: " + mo.add(5, 10));
        System.out.println("Sum of 3 integers: " + mo.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + mo.add(5.5, 10.5));
    }
}

/*
  Sample Output:
  Sum of 2 integers: 15
  Sum of 3 integers: 30
  Sum of 2 doubles: 16.0
*/
