package com.ozdemir;

import static com.ozdemir.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_GREEN + "Hello from the main thread");

        Thread anotherThread = new AnotherThread ();
        anotherThread.start();

        new Thread () {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from anonymous thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        Thread myRunnableThread2 = new Thread(new MyRunnable(){
            @Override
            public void run() {
                super.run();
            }
        });

        myRunnableThread2.start();
        anotherThread.interrupt();;

    }
}
