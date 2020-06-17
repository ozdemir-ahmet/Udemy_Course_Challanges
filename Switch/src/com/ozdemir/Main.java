package com.ozdemir;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 6;
	    switch (switchValue) {
            case 1 :
                System.out.println("Value was 1");
                break;
            case 2 :
                System.out.println("Value was 1");
                break;
            case 3 : case 4 : case 5 :
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually was a "+switchValue);
                break;
            default :
                System.out.println("Was not 1, 2, 3, 4, 5");
                break;
        }

        char charValue = 'H';
	    switch (charValue){
            case 'A' :
                System.out.println("Char Value is A");
                break;

            case 'B' :
                System.out.println("Char Value is B");
                break;

            case 'C' :
                System.out.println("Char Value is C");
                break;

            case 'D' :
                System.out.println("Char Value is D");
                break;

            case 'E' :
                System.out.println("Char Value is E");
                break;

            default:
                System.out.println("Your char value is not A, B, C, D, E. Char value is "+charValue);
        }

        String month = "JAnuary";
	    switch (month.toLowerCase()){
            case "january" :
                System.out.println("Jan");
                break;
            case "june" :
                System.out.println("Jun");
                break;
            default :
                System.out.println("You dont know haaa");
                break;
        }
    }
}
