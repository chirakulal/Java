package com.xworkz.javareferenceandvariable;

public class City {

    String name;
    int population;
    String mayor;
    String postalCode;
    Ward[] wards = new Ward[]{new Ward("5thblock",10,"shiva",1),
    new Ward("6thblock",2,"thima",3)};

    // Constructor
    public City(String name, int population, String mayor, String postalCode) {
        this.name = name;
        this.population = population;
        this.mayor = mayor;
        this.postalCode = postalCode;
        System.out.println(this.name+" "+this.population+" "+this.mayor+" "+this.postalCode);

    }
    void display(){
        System.out.println("Running display in City");
        if(wards!=null){
            for(Ward ref: wards){
                ref.display();
            }
        }
    }
}
