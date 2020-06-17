package com.ozdemir;


public class BankAccount {
    private String accountNumber;
    private double balance = 0;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount () {
        this("000",0.0,"no name","no email","no phone number yet");
    }

    public BankAccount (String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999",0,customerName, email, phoneNumber);
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public  void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber () {
        return this.accountNumber;
    }

    public double getBalance () {
        return this.balance;
    }

    public String getCustomerName (){
        return this.customerName;
    }

    public String getEmail () {
        return this.email;
    }

    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    public void depositFunds (double funds) {
        this.balance += funds;
        System.out.println("Deposit of "+funds+" made. Your current balance is :" + this.balance);
    }

    public void withdrawFunds (double funds) {
        if (funds > this.balance) {
            System.out.println("You do not have enough balance to withdraw "+funds);
        } else {
            this.balance -= funds;
            System.out.println("You withdrawn "+funds+". Your current balance is :" + this.balance);
        }

    }
}
