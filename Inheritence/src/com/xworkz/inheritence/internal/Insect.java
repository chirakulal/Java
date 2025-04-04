package com.xworkz.inheritence.internal;

public class Insect {

    public Insect() {
        System.out.println("No-arg constructor is running in Insect");
    }

    public void crawl() { System.out.println("Crawling on the ground"); }
    public void fly() { System.out.println("Flying in the air"); }
    public void feed() { System.out.println("Feeding on nectar"); }
    public void reproduce() { System.out.println("Reproducing new insects"); }
    public void undergoMetamorphosis() { System.out.println("Undergoing metamorphosis"); }
}
