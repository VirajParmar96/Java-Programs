/*
  Program: Thread Creation by Implementing Runnable
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates thread creation by implementing the Runnable interface
    and passing it to the Thread class.
*/

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable thread running: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class P92_ThreadRunnableExample {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();
    }
}

/*
  Sample Output:
  Runnable thread running: 1
  Runnable thread running: 1
  Runnable thread running: 2
  Runnable thread running: 2
  Runnable thread running: 3
  Runnable thread running: 3
  Runnable thread running: 4
  Runnable thread running: 4
  Runnable thread running: 5
  Runnable thread running: 5
*/
