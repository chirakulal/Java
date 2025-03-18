package com.xworkz;

public class Customer {

    public  void getHaircut(Barber barber){
        System.out.println("Customer is running");
        if(barber!=null){
            barber.serve();
        }
        else {
            System.out.println("reference is running");
        }
    }
}
