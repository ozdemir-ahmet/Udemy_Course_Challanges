package com.ozdemir;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(divideLBYL(2,0));
        System.out.println(divideEAFP(2,0));
        System.out.println("Entered number is: " + getInt ());
    }

    public static int getInt (){
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an int");
        try {
            number = keyboard.nextInt();
            return number;
        } catch (InputMismatchException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int divideLBYL (int x, int y){
        if (y != 0) {
            return x/y;
        } else {
            return 0;
        }
    }

    public static int divideEAFP (int x, int y){
        try {
            return x/y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
