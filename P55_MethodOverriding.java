/*
  Program: Method Overriding
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates method overriding in Java.
*/

class Vehicle {
    void run() {
        System.out.println("The vehicle is running.");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("The bike is running safely.");
    }
}

public class P55_MethodOverriding {
    public static void main(String[] args) {
        Vehicle obj = new Bike(); // Upcasting
        obj.run();
    }
}

/*
  Sample Output:
  The bike is running safely.
*/
