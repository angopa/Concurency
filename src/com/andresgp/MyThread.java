package com.andresgp;

import static com.andresgp.ThreadColor.ANSI_BLUE;

/**
 * Created by Andres Gonzalez on 2/22/18
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from another thread.");
    }
}
