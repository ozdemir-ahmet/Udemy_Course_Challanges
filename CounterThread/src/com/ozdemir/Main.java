package com.ozdemir;

public class Main {
 private String color;
 public Main() {
         this("white");
         }
 public Main(String color) {
         color = color;
         }
 public static void main(String[] args) {
         Main e = new Main();
         System.out.println("Color:" + e.color);
         }
 }

/*public class Main {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread countdownThread1 = new CountdownThread(countdown);
        countdownThread1.setName("Thread 1");

        CountdownThread countdownThread2 = new CountdownThread(countdown);
        countdownThread2.setName("Thread 2");

        System.out.println(countdownThread1.getState());
        System.out.println(countdownThread2.getState());

        countdownThread1.start();
        countdownThread2.start();

        System.out.println(countdownThread1.getState());
        System.out.println(countdownThread2.getState());

        try {
            countdownThread2.sleep(5000);
            countdownThread1.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(countdownThread1.getState());
        System.out.println(countdownThread2.getState());


    }

}
*/