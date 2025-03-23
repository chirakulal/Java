package com.xworkz.javareferenceandvariable;

public class Portfolio {
    String name;
    int id;
    String description;
    int budget;

    Portfolio(String name,int id,String description,int budget){
        this.budget=budget;
        this.name=name;
        this.description=description;
        this.id=id;

    }
    void display(){
        System.out.println("Running display of Portfolio");
        System.out.println("the name is: "+this.name+" |the id is: "+this.id+"the description is : "+this.description+"|the budget is: "+this.budget);
    }
}
