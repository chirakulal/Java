package com.xworkz.interfaces.internal;

public interface Coffee {

    void brewCoffee();
    void serveCoffee();
    void addSugar();

    default  void serve(){
        System.out.println("Running serve in Coffee");
    }
}
