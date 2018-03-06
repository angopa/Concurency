package com.andresgp;

/**
 * Created by Andres Gonzalez on 3/5/18
 */
public class Main {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
