package com.ozdemir;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("National Bank");
	    bank.addBranch("Camlidere");
	    bank.addCustomer("Camlidere","Ahmet",50.05);
        bank.addCustomer("Camlidere","Sedat",175.34);
        bank.addCustomer("Camlidere","Saniye",220.12);

        bank.addBranch("Merkez");
        bank.addCustomer("Merkez","Ece",150.54);

        bank.addTransaction("Camlidere","Ahmet",44.22);
        bank.addTransaction("Camlidere","Ahmet",12.44);
        bank.addTransaction("Camlidere","Sedat",1.65);

        bank.listCustomers("Camlidere", true);
    }
}
