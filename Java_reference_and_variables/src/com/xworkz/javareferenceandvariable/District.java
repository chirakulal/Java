package com.xworkz.javareferenceandvariable;

public class District {

    String name;
    String headquarters;
    int population;
    int numberOfTowns;


    public District(String name, String headquarters, int population, int numberOfTowns) {
        this.name = name;
        this.headquarters = headquarters;
        this.population = population;
        this.numberOfTowns = numberOfTowns;
        System.out.println(this.name+" "+this.headquarters+" "+this.population+" "+this.numberOfTowns);
    }
    void display(){
        System.out.println("Runnning display in District");
    }

}
