package com.ozdemir;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] array = {2,3,4,5,6,7,8};
        System.out.println("Array is "+ Arrays.toString(array));
        reverse (array);
    }

    public static void reverse(int [] array) {
        int swap;
        for (int i =0; i < array.length/2 ; i ++){
            swap = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i]=swap;
        }
        System.out.println("reversed array is "+Arrays.toString(array));
    }
}
