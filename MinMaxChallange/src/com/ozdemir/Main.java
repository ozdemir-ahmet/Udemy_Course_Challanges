package com.ozdemir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    boolean first = true;

	    while (true) {
            System.out.println("enter a number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int number = scanner.nextInt();
                if (first){
                    min = number;
                    max = number;
                    first = false;
                }
                if (number > max) {
                    max = number;
                }

                if (number < min){
                    min= number;
                }

            }else{
                System.out.println("Min = " +min);
                System.out.println("Max = " +max);
                break;
            }
        }
	    scanner.close();
    }
}
