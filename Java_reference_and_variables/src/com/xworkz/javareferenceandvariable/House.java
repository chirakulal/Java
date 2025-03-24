package com.xworkz.javareferenceandvariable;

public class House {
    String address;
    int rooms;
    int squarefeet;
    boolean garage;
    HouseKeeping[] houseKeeping = new HouseKeeping[]{new HouseKeeping("tina",35,"female","14365779"),
                                new HouseKeeping("shiv",45,"male","4758790")};

    Room[] room = new Room[]{new Room(12,"single",4,false),
                    new Room(23,"double",7,true)};

    House(String address,int rooms,int squarefeet,boolean garage){
        this.address=address;
        this.rooms=rooms;
        this.squarefeet=squarefeet;
        this.garage=garage;
        System.out.println("the address is: "+this.address+"the no of rooms : "+this.rooms+"the squarefeet is: "+this.squarefeet+"the garage is: "+this.garage);
    }

    void display(){
        System.out.println("Running display in house");
        if(houseKeeping!=null&&room!=null){
            for(HouseKeeping ref:houseKeeping){
                ref.display();
            }
            for(Room ref1 : room){
                ref1.display();
            }
        }
    }
}
