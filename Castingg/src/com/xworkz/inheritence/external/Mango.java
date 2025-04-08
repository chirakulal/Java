package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Fruit;

public class Mango extends Fruit {

    public Mango(){
        super();
        System.out.println("no-argu constructor is running in Mango");
    }
    @Override
    public void grow() {
        System.out.println("Running grow in Mango");
    }

    @Override
    public void ripen() {
        System.out.println("Running ripen in Mango");
    }

    @Override
    public void harvest() {
        System.out.println("Running harvest in Mango");
    }

    @Override
    public void eat() {
        System.out.println("Running eat in Mango");
    }

    @Override
    public void provideNutrition() {
        System.out.println("Running provideNutrition in Mango");
    }

}
