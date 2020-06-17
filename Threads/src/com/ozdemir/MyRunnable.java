package com.ozdemir;

import static com.ozdemir.ThreadColor.ANSI_CYAN;
import static com.ozdemir.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_CYAN + "Hello from Runnable Thread");
    }
}
