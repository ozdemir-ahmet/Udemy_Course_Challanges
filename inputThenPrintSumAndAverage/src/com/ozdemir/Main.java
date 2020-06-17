package com.ozdemir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage ();
    }
    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        long average = 0;

        while (true){
            System.out.println("enter a number");
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int number = scanner.nextInt();
                counter ++;
                sum += number;
                average = (long) Math.round((double) sum / (double) counter);
            }else{
                System.out.println("SUM = "+sum+" AVG = "+average);
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
