package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Lays {


    public static void main(String[] args) {


        Collection<String> lays = new ArrayList<>();
        lays.add("Wasabi");
        lays.add("Ketchup");
        lays.add("Mango Chili");
        lays.add("Roasted Garlic");
        lays.add("Classic Salted");
        lays.add("Magic Masala");
        lays.add("Hot & Sweet Chili");
        lays.add("Tomato Tango");
        lays.add("Paprika");
        lays.add("Seaweed ");

        System.out.println("lays=="+lays.size());

        lays.clear();

        System.out.println("lays=="+lays.size());

        lays.add("Wasabi");
        lays.add("Ketchup");
        lays.add("Mango Chili");
        lays.add("Roasted Garlic");
        lays.add("Classic Salted");
        lays.add("Magic Masala");
        lays.add("Hot & Sweet Chili");
        lays.add("Tomato Tango");
        lays.add("Paprika");
        lays.add("Seaweed ");

        System.out.println("lays=="+lays.size());


    }
}
