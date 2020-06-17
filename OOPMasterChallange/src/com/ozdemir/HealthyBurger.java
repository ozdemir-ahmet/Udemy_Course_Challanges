package com.ozdemir;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private  double healthyExtra1Price;
    private String healthyExtra2Name;
    private  double healthyExtra2Price;

    public HealthyBurger(String meatType, double price) {
        super("Healthy", "Brown rye", meatType, price);
    }

    public void addhealthyaddition1 (String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addhealthyaddition2 (String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double getPrice() {
        double hamburgerprice = super.getPrice();
        if (this.healthyExtra1Name != null) {
            hamburgerprice += healthyExtra1Price;
            System.out.println("Added "+healthyExtra1Name+" for the price of "+healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {
            hamburgerprice += healthyExtra2Price;
            System.out.println("Added "+healthyExtra2Name+" for the price of "+healthyExtra2Price);
        }
        return hamburgerprice;
    }
}
