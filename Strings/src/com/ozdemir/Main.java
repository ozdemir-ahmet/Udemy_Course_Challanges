package com.ozdemir;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a String";
        System.out.println("My String is equal to :" + myString);
        myString = myString + " and this is more";
        System.out.println("My String is equal to :" + myString);
        myString = myString + " \u00A9" + 2019;
        System.out.println("My String is equal to :" + myString);
    }
}
