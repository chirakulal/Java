package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Restaurant;

public class Chef extends Restaurant {

    public Chef(){
        super();
        System.out.println("No-argu const is running in Chef");
    }
    @Override
    public void cook() {
        System.out.println("Running cook in Chef");
    }

    @Override
    public void addsalt() {
        System.out.println("Running addsalt in Chef");
    }

    @
    Override
    public void clean() {
        System.out.println("Running clean in Chef");
    }

    @Override
    public void addIngredients() {
        System.out.println("Running addIngredients in Chef");
    }

    @
    Override
    public void taste() {
        System.out.println("Running taste in Chef");
    }


}
