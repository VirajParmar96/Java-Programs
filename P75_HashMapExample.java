/*
  Program: HashMap Example
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates how to use HashMap in Java to store key-value
    pairs and perform basic operations.
*/

import java.util.HashMap;

public class P75_HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Viraj");
        map.put(2, "Parmar");
        map.put(3, "Java");

        System.out.println("HashMap Elements: " + map);

        // Access value using key
        System.out.println("Value for key 2: " + map.get(2));

        // Removing a key-value pair
        map.remove(1);
        System.out.println("After Removing Key 1: " + map);

        // Checking if key exists
        System.out.println("Contains Key 3? " + map.containsKey(3));
    }
}

/*
  Sample Output:
  HashMap Elements: {1=Viraj, 2=Parmar, 3=Java}
  Value for key 2: Parmar
  After Removing Key 1: {2=Parmar, 3=Java}
  Contains Key 3? true
*/
