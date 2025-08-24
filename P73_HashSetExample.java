/*
  Program: HashSet Example
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates how to use HashSet in Java to store unique
    elements and avoid duplicates.
*/

import java.util.HashSet;

public class P73_HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // duplicate, will not be added

        System.out.println("Numbers Set: " + numbers);

        // Removing element
        numbers.remove(10);
        System.out.println("After Removing 10: " + numbers);

        // Checking if element exists
        System.out.println("Contains 30? " + numbers.contains(30));
    }
}

/*
  Sample Output:
  Numbers Set: [20, 10, 30]
  After Removing 10: [20, 30]
  Contains 30? true
*/
