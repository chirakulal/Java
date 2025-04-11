package com.xworkz.inheritence.external;

public class Account {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return
                "accountNumber='" + accountNumber + '\'' +
                        ", accountHolder='" + accountHolder + '\'' +
                        ", balance=" + balance;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 12;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Account) {
                Account a1 = this;
                Account a2 = (Account) obj;
                if (a1.accountNumber.equals(a2.accountNumber) &&
                        a1.accountHolder.equals(a2.accountHolder) &&
                        a1.balance == a2.balance) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
