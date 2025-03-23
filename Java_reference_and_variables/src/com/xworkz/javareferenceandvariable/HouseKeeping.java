package com.xworkz.javareferenceandvariable;

public class HouseKeeping {

    String name;
    int age;
    String gender;
    String contactNumber;
    Transport transport = new Transport("bus",10,"petrol",40);

    public HouseKeeping(String name, int age, String gender, String contactNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
        System.out.println(this.name+" "+this.age+" "+this.gender+" "+this.contactNumber);
    }
    void display(){
        System.out.println("Running display in Housekeeping");
        if(transport!=null){
            transport.display();
        }

    }

}
