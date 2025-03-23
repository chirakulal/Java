package com.xworkz.javareferenceandvariable;

public class State {
    String name;
    String capital;
    int population;
    double area;

    State(String name,String capital,int population,double area){
        this.name=name;
        this.capital=capital;
        this.population=population;
        this.area=area;
        System.out.println("the name is: "+this.name+"the capital is: "+this.capital+"the population is"+this.population+ " the area is : "+this.area);
    }

    void display(){
        System.out.println("running display in State");

    }
}
