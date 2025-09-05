/*
  Program: Synchronization in Threads
  Level  : Advanced
  Author : Viraj Parmar
  Description:
    Demonstrates synchronization in Java to prevent
    multiple threads from accessing a shared resource at the same time.
*/

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class P94_ThreadSynchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}

/*
  Sample Output:
  Final Count: 2000
*/
