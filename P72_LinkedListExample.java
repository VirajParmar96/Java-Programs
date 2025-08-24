/*
  Program: LinkedList Example
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates how to use LinkedList in Java to store,
    add, remove, and display elements.
*/

import java.util.LinkedList;

public class P72_LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // Adding elements
        names.add("Viraj");
        names.add("Parmar");
        names.add("Java");

        System.out.println("Names List: " + names);

        // Removing element
        names.remove(1);
        System.out.println("After Removing Index 1: " + names);

        // Adding element at first position
        names.addFirst("Hello");
        System.out.println("After Adding First: " + names);
    }
}

/*
  Sample Output:
  Names List: [Viraj, Parmar, Java]
  After Removing Index 1: [Viraj, Java]
  After Adding First: [Hello, Viraj, Java]
*/
