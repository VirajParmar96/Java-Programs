/*
  Program: Timer and TimerTask Example
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates how to schedule a task repeatedly using
    Timer and TimerTask classes in Java.
*/

import java.util.Timer;
import java.util.TimerTask;

public class P95_TimerExample {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int count = 0;

            @Override
            public void run() {
                count++;
                System.out.println("Timer Task executed: " + count);
                if (count >= 5) {
                    timer.cancel();
                    System.out.println("Timer stopped.");
                }
            }
        };

        System.out.println("Timer started...");
        timer.schedule(task, 0, 1000); // schedule task every 1 second
    }
}

/*
  Sample Output:
  Timer started...
  Timer Task executed: 1
  Timer Task executed: 2
  Timer Task executed: 3
  Timer Task executed: 4
  Timer Task executed: 5
  Timer stopped.
*/
