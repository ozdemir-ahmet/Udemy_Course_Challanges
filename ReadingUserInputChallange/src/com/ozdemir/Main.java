package com.ozdemir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int number = 0;
        int sum = 0;

        for (int i = 1; i <= 10 ; i++){
            System.out.println("Enter your "+i+". number:");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                sum = sum + number;
                if (i == 10) {
                    System.out.println("The sum is : "+sum);
                    break;
                }
            } else {
                System.out.println("Invalid number");
                i--;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
