/*
  Program: Iterate Through Map Entries
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates how to iterate through a HashMap using
    entrySet() method to access keys and values.
*/

import java.util.HashMap;
import java.util.Map;

public class P80_MapIterationExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding entries
        map.put(1, "Viraj");
        map.put(2, "Parmar");
        map.put(3, "Java");
        map.put(4, "Map Example");

        System.out.println("HashMap: " + map);

        // Iterating through map entries
        System.out.println("Iterating using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

/*
  Sample Output:
  HashMap: {1=Viraj, 2=Parmar, 3=Java, 4=Map Example}
  Iterating using entrySet():
  Key: 1, Value: Viraj
  Key: 2, Value: Parmar
  Key: 3, Value: Java
  Key: 4, Value: Map Example
*/
