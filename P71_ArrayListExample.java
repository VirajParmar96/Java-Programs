/*
  Program: ArrayList Example
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates how to use ArrayList in Java to store,
    add, remove, and display elements.
*/

import java.util.ArrayList;

public class P71_ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits List: " + fruits);

        // Removing element
        fruits.remove("Banana");
        System.out.println("After Removing Banana: " + fruits);

        // Accessing element
        System.out.println("First Fruit: " + fruits.get(0));
    }
}

/*
  Sample Output:
  Fruits List: [Apple, Banana, Mango]
  After Removing Banana: [Apple, Mango]
  First Fruit: Apple
*/
