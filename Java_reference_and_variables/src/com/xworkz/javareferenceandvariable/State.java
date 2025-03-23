package com.xworkz.javareferenceandvariable;

public class State {
    String name;
    String capital;
    int population;
    double area;
     City city = new City("mangluru",5,"kamath","50018");
     District[] district = new District[]{new District("dk","mangaluru",5,10),
             new District("udupi","manipal",3,8)};

    State(String name,String capital,int population,double area){
        this.name=name;
        this.capital=capital;
        this.population=population;
        this.area=area;
        System.out.println("the name is: "+this.name+"the capital is: "+this.capital+"the population is"+this.population+ " the area is : "+this.area);
    }

    void display(){
        System.out.println("running display in State");
        if(city!=null&&district!=null){
            city.display();
            for(District ref1:district){
                ref1.display();
            }
        }
    }
}
