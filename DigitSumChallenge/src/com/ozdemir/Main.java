package com.ozdemir;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(11));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-11198));
        System.out.println(sumDigits(1119823456));
    }
    public static int sumDigits(int number) {
        if (number < 10) return -1;
        int sum = number % 10;
        while (number / 10 > 0){
            number /=10;
            if (number < 10) sum +=number;
            else {
                int lastDigit = number % 10;
                sum +=lastDigit;
            }


        }
        return sum;

    }
}
