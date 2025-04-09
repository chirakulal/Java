package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Beverage;

public class Coffee extends Beverage {

    private String type;
    private String size;
    private boolean hasSugar;

    public Coffee(String type, String size, boolean hasSugar) {
        this.type = type;
        this.size = size;
        this.hasSugar = hasSugar;
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

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", hasSugar=" + hasSugar;
    }
}
