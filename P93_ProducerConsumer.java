/*
  Program: Producer-Consumer Problem
  Level  : Advanced
  Author : Viraj Parmar
  Description:
    Demonstrates the classic producer-consumer problem using
    wait() and notify() methods for inter-thread communication.
*/

class Buffer {
    private int data;
    private boolean isEmpty = true;

    public synchronized void produce(int value) {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        data = value;
        isEmpty = false;
        System.out.println("Produced: " + data);
        notify();
    }

    public synchronized void consume() {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + data);
        isEmpty = true;
        notify();
    }
}

class Producer extends Thread {
    private Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class P93_ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}

/*
  Sample Output:
  Produced: 1
  Consumed: 1
  Produced: 2
  Consumed: 2
  Produced: 3
  Consumed: 3
  Produced: 4
  Consumed: 4
  Produced: 5
  Consumed: 5
*/
