package com.ozdemir;

import java.time.Instant;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an int value");
        String input = keyboard.next();
        int intValue = Integer.parseInt(input);
        intValue*=2;
        System.out.println("Multplied by 2 = " + intValue);
        System.out.println(Integer.SIZE);
        System.out.println(Double.SIZE);
        System.out.println(Integer.BYTES);
        keyboard.close();*/

        Instant now = Instant.now();
        System.out.println(now);
        Instant later = now.plusSeconds(7);
        later = later.plusMillis(5);
        later = later.plusNanos(3);
        System.out.println(later);
    }
}