package com.ozdemir;

public class TravelAgency {

    private String name;
    private Address address;

    public TravelAgency(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "    TravelAgency{" + "\n" +
                "       name:'" + name + '\'' + "," + "\n" +
                "   " + address + "\n" +
                "   }";
    }
}