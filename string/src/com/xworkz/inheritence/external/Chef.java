package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Restaurant;

public class Chef extends Restaurant {

    private String name;
    private String specialty;
    private int experienceYears;


    public Chef(String name, String specialty, int experienceYears) {
        this.name = name;
        this.specialty = specialty;
        this.experienceYears = experienceYears;
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

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", experienceYears=" + experienceYears ;
    }
}
