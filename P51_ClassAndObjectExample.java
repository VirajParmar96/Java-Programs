/*
  Program: Class and Object Example
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates the use of a class and creating objects in Java.
*/

class Car {
    String brand;
    int year;

    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}

public class P51_ClassAndObjectExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2020;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.year = 2022;

        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println("\nCar 2 Details:");
        car2.displayDetails();
    }
}

/*
  Sample Output:
  Car 1 Details:
  Car Brand: Toyota
  Manufacturing Year: 2020

  Car 2 Details:
  Car Brand: Honda
  Manufacturing Year: 2022
*/
