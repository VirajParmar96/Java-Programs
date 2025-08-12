/*
  Program: Inheritance Example
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates inheritance in Java.
*/

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class P54_InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // from parent class
        dog.bark(); // from child class
    }
}

/*
  Sample Output:
  This animal eats food.
  The dog barks.
*/
