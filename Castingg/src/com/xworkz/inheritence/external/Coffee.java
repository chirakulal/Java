package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Beverage;

public class Coffee extends Beverage {

    public Coffee() {
        super();
        System.out.println("No-arg constructor is running in Coffee");
    }
    @Override
    public void prepare() {
        System.out.println("Running prepare in Coffee");
    }

    @Override
    public void serve() {
        System.out.println("Running serve in Coffee");
    }

    @Override
    public void drink() {
        System.out.println("Running drink in Coffee");
    }

    @Override
    public void checkTemperature() {
        System.out.println("Running checkTemperature in Coffee");
    }

    @Override
    public void addSugar() {
        System.out.println("Running addSugar in Coffee");
    }
    public void addCoffee(){
        System.out.println("Running addCoffee  in Coffee");
    }

}
