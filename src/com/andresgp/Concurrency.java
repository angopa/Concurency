package com.andresgp;

import static com.andresgp.ThreadColor.ANSI_GREEN;
import static com.andresgp.ThreadColor.ANSI_PURPLE;
import static com.andresgp.ThreadColor.ANSI_RED;

/**
 * Created by Andres Gonzalez on 2/22/18
 */
public class Concurrency {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from Main Thread");

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("=== Another Thread ===");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated, or time out, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all, I was interrupted");

                }
            }
        });
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread.");
    }
}
