/*
  Program: Static Keyword Usage
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates the usage of the static keyword for
    variables, methods, and blocks in Java.
*/

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}

public class P59_StaticKeywordUsage {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        Counter.displayCount();
    }
}

/*
  Sample Output:
  Total objects created: 3
*/
