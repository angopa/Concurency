package com.andresgp;

/**
 * Created by Andres Gonzalez on 3/5/18
 */
public class Countdown {
    private int i = 0;

    public void doCountdown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
                break;
        }

        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + " i = " + i);
            }
        }
    }
}


class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown threadCountdown) {
        this.threadCountdown = threadCountdown;
    }

    @Override
    public void run() {
        threadCountdown.doCountdown();
    }
}