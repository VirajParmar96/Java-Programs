/*
  Program: TreeMap Example
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates how to use TreeMap in Java to store key-value
    pairs in sorted order of keys.
*/

import java.util.TreeMap;

public class P76_TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs
        map.put(3, "Java");
        map.put(1, "Viraj");
        map.put(2, "Parmar");
        map.put(5, "TreeMap");
        map.put(4, "Example");

        System.out.println("TreeMap Elements: " + map);

        // First and Last keys
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        // Removing element
        map.remove(2);
        System.out.println("After Removing Key 2: " + map);
    }
}

/*
  Sample Output:
  TreeMap Elements: {1=Viraj, 2=Parmar, 3=Java, 4=Example, 5=TreeMap}
  First Key: 1
  Last Key: 5
  After Removing Key 2: {1=Viraj, 3=Java, 4=Example, 5=TreeMap}
*/
