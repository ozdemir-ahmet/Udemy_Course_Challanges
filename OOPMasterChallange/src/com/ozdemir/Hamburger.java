package com.ozdemir;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;
    private String addition4;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, String meatType, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meatType;
        this.price = price;
        System.out.println(name+ " hamburger on a "+breadRollType+" price is " +price);
    }

    public void addHamburgerAddition1 ( String name, double price) {
        this.addition1 = name;
        this.addition1Price = price;
     }

    public void addHamburgerAddition2 ( String name, double price) {
        this.addition2 = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3 ( String name, double price) {
        this.addition3 = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4 ( String name, double price) {
        this.addition4 = name;
        this.addition4Price = price;
    }

    public double getPrice () {
        double hamburgerPrice = this.price;
        if (this.addition1 != null) {
            hamburgerPrice += addition1Price;
            System.out.println("Added  "+addition1+" for the price of "+addition1Price);
        }

        if (this.addition2 != null) {
            hamburgerPrice += addition2Price;
            System.out.println("Added  "+addition2+" for the price of "+addition2Price);
        }

        if (this.addition3 != null) {
            hamburgerPrice += addition3Price;
            System.out.println("Added "+addition3+" for the price of "+addition3Price);
        }

        if (this.addition4 != null) {
            hamburgerPrice += addition4Price;
            System.out.println("Added "+addition4+" for the price of "+addition4Price);
        }
        return hamburgerPrice;
    }
}
