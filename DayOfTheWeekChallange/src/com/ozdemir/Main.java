package com.ozdemir;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(7);

    }

    public static void printDayOfTheWeek (int day) {
        /*switch (day){
            case 0 :
                System.out.println("Monday");
                break;

            case 1 :
                System.out.println("Tuesday");
                break;

            case 2 :
                System.out.println("Wednesday");
                break;

            case 3 :
                System.out.println("Thursday");
                break;

            case 4 :
                System.out.println("Friday");
                break;

            case 5 :
                System.out.println("Saturday");
                break;

            case 6 :
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }*/
        if (day == 0) System.out.println("Sunday");
        else if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Monday");
        else if (day == 3) System.out.println("Monday");
        else if (day == 4) System.out.println("Monday");
        else if (day == 5) System.out.println("Monday");
        else if (day == 6) System.out.println("Monday");
        else System.out.println("Invalid Day");
    }
}
