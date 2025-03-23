package com.xworkz.javareferenceandvariable;

public class Country {

    String name;

    String language;
    Double population;
    int states;

    PrimeMinister primeMinister;

    public Country(String names,String language, Double population,int states){
        System.out.println("running constructor");
        this.name=names;
        this.language = language;
        this.population=population;
        this.states=states;
        this.primeMinister= new PrimeMinister("Modi","India",2024,2029);

    }
    void display(){
        System.out.println("running display in country");
        System.out.println("name of the country: "+this.name +" |language of country: "+this.language +" |population of country: "+this.population +" |no od states: "+this.states);
       if(primeMinister!=null){
           primeMinister.display();
       }
      else System.out.println("reference is pointing to null");
    }
}
