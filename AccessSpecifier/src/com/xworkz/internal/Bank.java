package com.xworkz.internal;

public class Bank {

    public String accountName = "";
    String account = "Saved";
    private double accountBalance = 40000;

    public void checkBalance(){
        System.out.println(this.accountBalance);

    }
    private void transactionDetail(){
        System.out.println("Running transactionDetail in Bank");
    }
    void accountDetails(){
        System.out.println("Running accountDetails in Bank ");

    }

}
