package com.xworkz.javareferenceandvariable;

public class House {
    String address;
    int rooms;
    int squarefeet;
    boolean garage;

    House(String address,int rooms,int squarefeet,boolean garage){
        this.address=address;
        this.rooms=rooms;
        this.squarefeet=squarefeet;
        this.garage=garage;
        System.out.println("the address is: "+this.address+"the no of rooms : "+this.rooms+"the squarefeet is: "+this.squarefeet+"the garage is: "+this.garage);
    }

    void display(){
        System.out.println("Running display in house");
    }
}
