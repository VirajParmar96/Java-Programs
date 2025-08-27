/*
  Program: Queue Implementation
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates how to use Queue in Java with LinkedList implementation.
    It performs enqueue, dequeue, peek, and iteration operations.
*/

import java.util.LinkedList;
import java.util.Queue;

public class P78_QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements
        queue.add("Viraj");
        queue.add("Parmar");
        queue.add("Java");
        queue.add("Queue");

        System.out.println("Initial Queue: " + queue);

        // Peek element
        System.out.println("Front Element (peek): " + queue.peek());

        // Dequeue element
        System.out.println("Dequeued Element: " + queue.remove());
        System.out.println("Queue after Dequeue: " + queue);

        // Iterating through the queue
        System.out.print("Iterating Queue: ");
        for (String item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

/*
  Sample Output:
  Initial Queue: [Viraj, Parmar, Java, Queue]
  Front Element (peek): Viraj
  Dequeued Element: Viraj
  Queue after Dequeue: [Parmar, Java, Queue]
  Iterating Queue: Parmar Java Queue
*/
