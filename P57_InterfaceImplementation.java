/*
  Program: Interface Implementation
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates how to implement an interface in Java.
*/

interface Animal {
    void sound(); // abstract method
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class P57_InterfaceImplementation {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sound();
    }
}

/*
  Sample Output:
  The cat meows.
*/
