package com.ozdemir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        boolean hasNextString = scanner.hasNext();

        String name = scanner.nextLine();

        System.out.println("Please enter you year of birth");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt == true) {
            int yearOfBirth = scanner.nextInt();
            int age = 2019 - yearOfBirth;
            System.out.println("Your name is : " + name + ", You are " + age + " years old");
        } else System.out.println("Invalid Value");
        scanner.close();
    }
}
