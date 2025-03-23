package com.xworkz.javareferenceandvariable;

public class PrimeMinister {
    String name;
    String country;
    long startDate;
    long endDate;
    Minister[] minister=new Minister[]{new Minister("Jayashankar","foreign",50,10),
            new Minister("Nirmala","finance",40,10),
            new Minister("Rajanath Singh","defence",73,20)};;


    PrimeMinister(String name, String country,long startDate,long endDate){
        this.name=name;
        this.country=country;
        this.startDate=startDate;
        this.endDate=endDate;
    }

    void display(){
        System.out.println("Running display in prime minister");
        System.out.println("name of PrimeMinister: "+this.name+" |name of country "+this.country+" |starting date : "+this.startDate+" |end date: "+this.endDate);
        if(minister!= null){
            for(Minister ref:minister){
                ref.display();
            }

        }
    }

}
