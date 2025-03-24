package com.xworkz;

import com.xworkz.external.Customer;
import com.xworkz.internal.Bank;
import com.xworkz.internal.Manager;

public class BankRunner {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Manager manager = new Manager(bank);
        manager.details();

        Customer customer = new Customer(bank);
        customer.checkBalance();
    }
}
