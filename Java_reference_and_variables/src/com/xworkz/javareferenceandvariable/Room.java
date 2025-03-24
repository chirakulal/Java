package com.xworkz.javareferenceandvariable;

public class Room {

    int roomNumber;
    String roomType;
    double roomArea;
    boolean isOccupied;


    public Room(int roomNumber, String roomType, double roomArea, boolean isOccupied) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.isOccupied = isOccupied;
        System.out.println(this.roomNumber+" "+this.roomType+" "+this.roomArea+" "+this.isOccupied);
    }

     void display(){
         System.out.println("running display in Room");
     }
}
