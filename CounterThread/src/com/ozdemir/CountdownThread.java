package com.ozdemir;

public class CountdownThread extends Thread {
    private Countdown countdown;

    public CountdownThread (Countdown countdown){
        this.countdown = countdown;
    }
    @Override
    public void run (){
        countdown.doCountDown();
    }
}
