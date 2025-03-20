package com.xworkz.March20;

public class Ticket {
    TicketType type;
    double cost;

    Ticket(TicketType type,double cost){
        this.type =type;
        this.cost = cost;
        System.out.println(this.type+" "+this.cost);
    }
    void buy(){
        System.out.println("Running buy in ticket class");
    }
    void sell(){
        System.out.println("Running sell in ticket class");
    }
}
