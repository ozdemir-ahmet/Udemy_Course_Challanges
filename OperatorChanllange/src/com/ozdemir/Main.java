package com.ozdemir;

public class Main {

    public static void main(String[] args) {
        double firstDouble =20.00d;
        double secondDouble = 80.00d;
        double remainder = (100.00 * (firstDouble + secondDouble)%40.00);
        boolean isDividable = (remainder == 0) ? true : false;
        System.out.println(isDividable);
    }
}
