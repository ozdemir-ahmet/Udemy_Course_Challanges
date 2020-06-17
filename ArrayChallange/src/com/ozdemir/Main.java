package com.ozdemir;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
	    int [] myArray = readIntegers (5);
        System.out.println("My numbers are "+(Arrays.toString(myArray)));
        System.out.println("minimum value in the array is " + findMin(myArray));
    }

    public static int[] readIntegers (int number) {
        int [] myArray = new int[number];
        System.out.println("Enter "+number+" numbers for the array");
        for (int i = 0 ; i < myArray.length ; i++) {
            myArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return myArray;
    }

    public static int findMin (int[] myArray){
        for (int i = 1; i < myArray.length; i++) {
            for (int j=i; j > 0 ; j--){
                int temp;
                if (myArray[j]<myArray[j-1]){
                    temp = myArray[j];
                    myArray[j]=myArray[j-1];
                    myArray[j-1]=temp;
                }
            }
        }
        System.out.println("Sorted numbers are "+(Arrays.toString(myArray)));
        return myArray[0];
    }
}
