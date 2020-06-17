package com.ozdemir;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic","White","Beef",3.5);
	    double price = hamburger.getPrice();
	    hamburger.addHamburgerAddition1("Cheese", 0.53);
	    hamburger.addHamburgerAddition2("Lettuce",0.42);
	    hamburger.addHamburgerAddition3("Tomato",0.35);
	    price = hamburger.getPrice();
        System.out.println("Total burger price is "+hamburger.getPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 5.68);
        healthyBurger.addhealthyaddition1("Egg",0.45);
        System.out.println("Total burger price is "+healthyBurger.getPrice());
    }
}
