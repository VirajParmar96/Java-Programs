/*
  Program: TreeSet Example
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates how to use TreeSet in Java to store unique
    elements in sorted (ascending) order.
*/

import java.util.TreeSet;

public class P74_TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10); // duplicate, will not be added

        System.out.println("TreeSet Elements: " + numbers);

        // First and Last elements
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());

        // Removing element
        numbers.remove(30);
        System.out.println("After Removing 30: " + numbers);
    }
}

/*
  Sample Output:
  TreeSet Elements: [10, 20, 30, 50]
  First Element: 10
  Last Element: 50
  After Removing 30: [10, 20, 50]
*/
