package com.xworkz.javareferenceandvariable;

public class Security {
    String type;
    int personnelCount;
    String level;
    boolean armed;

    Security(String type,int personnelCount,String level,boolean armed){
        this.type=type;
        this.personnelCount=personnelCount;
        this.level=level;
        this.armed=armed;
    }

    void display(){
        System.out.println("Running display in Security");
        System.out.println("the type is : "+this.type+" |the personnelCount is: "+this.personnelCount+" |the level is: "+this.level+" |the armed: "+this.armed);
    }
}
