package com.ozdemir;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int counter = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)) continue;
            counter ++;
            System.out.println(number);
            if (counter == 5) break;
        }
        System.out.println(counter + " even numbers");
        /*int sum = 0;
        int counter = 0;
        for (int i = 1; i < 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                counter +=1;
                sum += i;
                if (counter == 5) {
                    System.out.println("Sum of those numbers equal "+sum);
                    break;
                }
            }
        }


	    for (double i = 8; i>=2 ; i -= 0.5){
            System.out.println(String.format("%.2f", calculateInterest(10_000,i)));
        }
        int counter = 0;
	    for (int i =20; i<300; i++){
	        if (isPrime(i)){
	            counter ++;
	            System.out.println(i);
	            if (counter == 10) break;
            }
        }
    }
    public static double calculateInterest (double amount, double interestRate){
        return (amount * interestRate / 100);
    }

    public static boolean isPrime (int n) {
        if (n == 1) return false;
        for (int i =2; i<=n/2;i++){
            if (n % i == 0) return false;
        }
        return true;*/
    }
    public static boolean isEvenNumber (int number){
        if ((number % 2) == 0) return true;
        else return false;
    }

}
