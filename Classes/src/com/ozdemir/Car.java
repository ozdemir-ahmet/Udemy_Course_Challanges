package com.ozdemir;

public class Car {
    private int doors;
    private int wheels;
    protected String type;
    private String model;
    private String colour;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel (){
        return this.model;
    }
}
