package com.ozdemir;

public class Main {

    public static void main(String[] args) {
	    Car porshe = new Car();
	    Car honda = new Car();
	    honda.type = "CRV";
	    //honda.model = "2015";
        System.out.println(honda.getModel());
        honda.setModel("CRV");
        System.out.println(honda.getModel());
    }
}
