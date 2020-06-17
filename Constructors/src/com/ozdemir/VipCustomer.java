package com.ozdemir;

import javax.xml.namespace.QName;

public class VipCustomer {
    private String name;
    private  double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, String emailAddress) {
        this (name, 0, emailAddress);
    }

    public VipCustomer () {
        this ("no name yet",0,"no email address yet");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
