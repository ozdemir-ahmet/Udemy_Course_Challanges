package com.ozdemir;

public class Main {

    public static void main(String[] args) {
        float myMinFloatNumber = Float.MIN_VALUE;
        float myMaxFloatNumber = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatNumber);
        System.out.println("Float Maximum Value = " + myMaxFloatNumber);

        double myMinDoubleNumber = Double.MIN_VALUE;
        double myMaxDoubleNumber = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleNumber);
        System.out.println("Double Maximum Value = " + myMaxDoubleNumber);

        int myIntValue = 5/2;
        float myFloatValue = 5f/2;
        double myDoubleValue = 5d/2;

        System.out.println("My int value = " + myIntValue);
        System.out.println("My float value = " + myFloatValue);
        System.out.println("My double value = " + myDoubleValue);

        double myPounds = 200;
        double myKilogram = myPounds * 0.45359237;
        System.out.println(myPounds + " pounds = " + myKilogram +" kg.");
    }
}
