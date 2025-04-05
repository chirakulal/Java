package com.xworkz.javareferenceandvariable;

public class Ward {

    String name;
    int wardNumber;
    String representative;
    int population;


    public Ward(String name, int wardNumber, String representative, int population) {
        this.name = name;
        this.wardNumber = wardNumber;
        this.representative = representative;
        this.population = population;
        System.out.println(this.name+" "+this.wardNumber+" "+this.representative+" "+this.population);
    }
    void display(){
        System.out.println("Running display in Ward");
    }

}
