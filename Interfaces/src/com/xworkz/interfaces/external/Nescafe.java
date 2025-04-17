package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Coffee;

public class Nescafe implements Coffee {

    @Override
    public void brewCoffee() {
        System.out.println("Running brewCoffee in Nescafe");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Running serveCoffee in Nescafe");
    }

    @Override
    public void addSugar() {
        System.out.println("Running addSugar in Nescafe");
    }

    @Override
    public void serve() {
        System.out.println("Running serve in Nescafe");

    }
}
