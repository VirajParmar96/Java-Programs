/*
  Program: Thread Creation by Extending Thread Class
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates thread creation by extending the Thread class
    and overriding the run() method.
*/

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class P91_ThreadExtendExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}

/*
  Sample Output:
  Thread running: 1
  Thread running: 1
  Thread running: 2
  Thread running: 2
  Thread running: 3
  Thread running: 3
  Thread running: 4
  Thread running: 4
  Thread running: 5
  Thread running: 5
*/
