/*
  Program: Abstract Class Example
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates the concept of abstract classes in Java.
*/

abstract class Shape {
    abstract void draw(); // abstract method

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class P56_AbstractClassExample {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Upcasting
        shape.display();
        shape.draw();
    }
}

/*
  Sample Output:
  This is a shape.
  Drawing a circle.
*/
