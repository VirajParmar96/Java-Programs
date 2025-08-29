/*
  Program: PriorityQueue Usage
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates the usage of PriorityQueue in Java.
    Elements are stored according to their natural ordering
    (min-heap by default).
*/

import java.util.PriorityQueue;

public class P79_PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);

        // Access head of queue
        System.out.println("Peek (head element): " + pq.peek());

        // Remove elements
        System.out.println("Removed Element: " + pq.poll());
        System.out.println("PriorityQueue after removal: " + pq);

        // Iterating PriorityQueue
        System.out.print("Iterating PriorityQueue: ");
        for (Integer num : pq) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

/*
  Sample Output:
  PriorityQueue: [10, 20, 30, 40]
  Peek (head element): 10
  Removed Element: 10
  PriorityQueue after removal: [20, 40, 30]
  Iterating PriorityQueue: 20 40 30
*/
