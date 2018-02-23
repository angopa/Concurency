package com.andresgp;

import static com.andresgp.ThreadColor.ANSI_GREEN;
import static com.andresgp.ThreadColor.ANSI_PURPLE;

/**
 * Created by Andres Gonzalez on 2/22/18
 */
public class Concurrency {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from Main Thread");

        Thread myThread = new MyThread();
        myThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread.");
    }

}
