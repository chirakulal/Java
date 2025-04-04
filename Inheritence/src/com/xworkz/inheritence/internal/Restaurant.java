package com.xworkz.inheritence.internal;

public class Restaurant {

    public Restaurant(){
        System.out.println("NO argument constructor is running in Restaurant");
    }

    public void cook(){
        System.out.println("cooking in the Restaurant");
    }
    public void addsalt(){
        System.out.println("Adding salt in the Restaurant");
    }
    public void clean(){
        System.out.println("clean the utensil ");
    }
    public void addIngredients(){
        System.out.println("Adding ingredients to the food");
    }
    public void taste(){
        System.out.println("tasting the food");
    }
}
