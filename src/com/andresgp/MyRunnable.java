package com.andresgp;

import static com.andresgp.ThreadColor.ANSI_RED;

/**
 * Created by Andres Gonzalez on 2/23/18
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Running");
    }
}
