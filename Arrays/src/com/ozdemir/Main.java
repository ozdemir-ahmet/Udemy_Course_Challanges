package com.ozdemir;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myArray = getIntegers(10);
        for (int i = 0; i<myArray.length;i++){
            System.out.println(i+". value of the array is "+myArray[i]);
        }
        System.out.println("Myarray before sorting "+(Arrays.toString(myArray)));
        int [] sortedArray = sortArray(myArray);
        for (int i = 0; i<sortedArray.length;i++){
            System.out.println(i+". value of the sorted array is "+sortedArray[i]);
        }
        System.out.println("sortedArray "+(Arrays.toString(sortedArray)));
        System.out.println("myArray after sorting"+(Arrays.toString(myArray)));
    }

    public static int[] getIntegers (int number) {
        System.out.println("Please enter "+number+" int values. \r");
        int [] values = new int [number];
        for (int i =0; i<values.length;i++){
            values [i] = scanner.nextInt();
        }
        return values;
    }

    public static int [] sortArray (int [] array){
        int swap;
        for (int i=1;i < array.length;i++){
            for (int j =i;j>0;j--){
                 if (array[j]> array[j-1]){
                     swap=array[j-1];
                     array[j-1]=array[j];
                     array[j]=swap;
                 }
            }
        }
        return array;
    }
}
