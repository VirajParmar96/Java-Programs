/*
  Program: Stack Example
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates how to use Stack in Java to perform push, pop,
    peek, and search operations.
*/

import java.util.Stack;

public class P77_StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements
        stack.push("Viraj");
        stack.push("Parmar");
        stack.push("Java");
        stack.push("Stack");

        System.out.println("Initial Stack: " + stack);

        // Peek element
        System.out.println("Top Element (peek): " + stack.peek());

        // Pop element
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Stack after Pop: " + stack);

        // Search element
        System.out.println("Position of 'Java': " + stack.search("Java"));
    }
}

/*
  Sample Output:
  Initial Stack: [Viraj, Parmar, Java, Stack]
  Top Element (peek): Stack
  Popped Element: Stack
  Stack after Pop: [Viraj, Parmar, Java]
  Position of 'Java': 1
*/
