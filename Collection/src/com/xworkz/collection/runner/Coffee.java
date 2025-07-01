package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Coffee {

    public static void main(String[] args) {

        Collection<String> coffee = new ArrayList<>();
        coffee.add("Espresso");
        coffee.add("Americano");
        coffee.add("Latte");
        coffee.add("Cappuccino");
        coffee.add("Macchiato");
        coffee.add("Mocha");
        coffee.add("Flat White");
        coffee.add("Cortado");
        coffee.add("Affogato");
        coffee.add("Ristretto");

        System.out.println("coffee=="+coffee.size());

        coffee.clear();

        System.out.println("coffee=="+coffee.size());

        coffee.add("Cold Brew");
        coffee.add("Doppio");
        coffee.add("Iced Coffee");
        coffee.add("Cappuccino");
        coffee.add("Macchiato");
        coffee.add("Nitro Cold Brew");
        coffee.add("Flat White");
        coffee.add("Cortado");
        coffee.add("Affogato");
        coffee.add("Irish Coffee");

        System.out.println("coffee=="+coffee.size());

    }
}
