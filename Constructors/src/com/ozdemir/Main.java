package com.ozdemir;

public class Main {

    public static void main(String[] args) {
	    BankAccount myAccount = new BankAccount();
	    myAccount.setBalance(1000);
        System.out.println(myAccount.getBalance());
        myAccount.depositFunds(500);
        myAccount.withdrawFunds(900);
        myAccount.withdrawFunds(700);
        System.out.println(myAccount.getEmail());
        System.out.println(myAccount.getPhoneNumber());

        BankAccount ahmetsAccount = new BankAccount("ahmet","a@b.com","12345");
        System.out.println(ahmetsAccount.getCustomerName());

        VipCustomer ahmet = new VipCustomer("ahmet" ,100, "a@b.com" );
        System.out.println(ahmet.getName() + " has "+ahmet.getCreditLimit()+" limit.");

        VipCustomer ali = new VipCustomer();
        System.out.println(ali.getName()+" has "+ali.getCreditLimit()+" limit.");
    }
}
