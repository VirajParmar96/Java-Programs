/*
  Program: This and Super Keyword Demo
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates the usage of 'this' to refer to the current
    object and 'super' to call parent class methods/constructors.
*/

class Parent {
    String message = "Message from Parent";

    Parent() {
        System.out.println("Parent constructor called");
    }

    void showMessage() {
        System.out.println(message);
    }
}

class Child extends Parent {
    String message = "Message from Child";

    Child() {
        super(); // Calls Parent constructor
        System.out.println("Child constructor called");
    }

    void displayMessages() {
        System.out.println(this.message); // Child's message
        System.out.println(super.message); // Parent's message
    }
}

public class P60_ThisAndSuperKeywordDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessages();
    }
}

/*
  Sample Output:
  Parent constructor called
  Child constructor called
  Message from Child
  Message from Parent
*/
