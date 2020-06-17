package com.ozdemir;

import static com.ozdemir.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from another thread");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Another thread is interrupted");
            return;
        }
        System.out.println("3 seconds passed and i am awake");
    }
}
