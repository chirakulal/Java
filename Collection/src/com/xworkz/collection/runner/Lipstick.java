package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Lipstick {

    public static void main(String[] args) {

        Collection<String> lipstick = new ArrayList<>();
        lipstick.add("Ruby Woo");
        lipstick.add("Diva ");
        lipstick.add("Lolita ");
        lipstick.add("Pillow Talk ");
        lipstick.add("Bachelorette");
        lipstick.add("Touch of Spice ");
        lipstick.add("Red Velvet  ");
        lipstick.add("Rosewood  ");
        lipstick.add("Raisin Rage");
        lipstick.add("Chili ");

        System.out.println("lipstick =="+lipstick.size());

        lipstick.clear();

        System.out.println("lipstick =="+lipstick.size());
        lipstick.add("Red Sangria");
        lipstick.add("Diva ");
        lipstick.add("Self-Starter");
        lipstick.add("Pillow Talk ");
        lipstick.add("Bachelorette");
        lipstick.add("Velvet Teddy ");
        lipstick.add("Founder    ");
        lipstick.add("Lolita II ");
        lipstick.add("Boss Babe ");
        lipstick.add("Chili ");

        System.out.println("lipstick =="+lipstick.size());

    }
}
