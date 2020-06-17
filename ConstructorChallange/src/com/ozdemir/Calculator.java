package com.ozdemir;

public class Calculator {
    Floor floor = new Floor();
    Carpet carpet = new Carpet();

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost (){
        return (this.floor.getArea() * this.carpet.getCost());
    }
}
