package com.ozdemir;

public class Main {

    public static void main(String[] args) {
        boolean gameOvere = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println("Your score is " + calculateScore(score, levelCompleted, bonus));

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("Your score is " + calculateScore(score, levelCompleted, bonus));


        String name = "Ahmet";
        int position = 1;
        displayPosition (name, position);

        score = 1500;
        System.out.println("score =" + score + " and position is " + calculateHighScorePosition(score));

        score = 900;
        System.out.println("score =" + score + " and position is " + calculateHighScorePosition(score));

        score = 400;
        System.out.println("score =" + score + " and position is " + calculateHighScorePosition(score));

        score = 50;
        System.out.println("score =" + score + " and position is " + calculateHighScorePosition(score));
    }
    private static void displayPosition (String name, int position){
        System.out.println(name + " managed to get into position " + position + " on th high score table");
    }

    private static int calculateHighScorePosition (int score) {
        int position = 4;
        if (score > 1000) position = 1;
        else if (score > 500 ) position = 2;
        else if (score > 100 ) position = 3;
        return position;
    }
    private static int calculateScore(int score, int levelCompleted, int bonus){
        return score + (levelCompleted * bonus);
    }
}
