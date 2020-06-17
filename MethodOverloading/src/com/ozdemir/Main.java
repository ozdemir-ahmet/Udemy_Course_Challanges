package com.ozdemir;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Ahmet" , 500) ;
        System.out.println("New score is " + newScore );
        calculateScore(75);
        calculateScore();
        calculateScore(25,75);

        System.out.println(calcFeetAndInchesToCentimeters(6,0));
        System.out.println(calcFeetAndInchesToCentimeters(6,-5));
        System.out.println(calcFeetAndInchesToCentimeters(27) );
    }
    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000 ;
    }

    public static int calculateScore (int firstScore, int score) {
        System.out.println("Player scored " + (firstScore + score) + " points");
        return score * 1000 ;
    }

    public static int calculateScore (int score) {
        System.out.println("Unnamed Player " + " scored " + score + " points");
        return score * 1000 ;
    }

    public static int calculateScore ( ) {
        System.out.println("No Player Name, No player score" );
        return 0 ;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (!(feet >= 0)) return -1;
        else if (!(inches >=0 && inches <=12)) return -1;
        else {
            double totalInches = (12 * feet) + inches;
            return 2.54 * totalInches;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (!(inches >=0)) return -1;
        else {
            return 2.54 * inches;
        }
    }



}
